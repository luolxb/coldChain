package com.coldchain.service.impl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.coldchain.dao.NtsContactPersonMapper;
import com.coldchain.entity.NtsContactPerson;
import com.coldchain.entity.vo.NtsContactPersonRq;
import com.coldchain.service.CommonSequenceService;
import com.coldchain.service.NtsContactPersonService;
import com.common.dto.UserDto;
import com.common.exception.ShopException;
import com.common.utils.NtsUtil;
import com.common.utils.TLinkUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.web.client.RestTemplate;

import java.util.*;
import java.util.stream.Collectors;

@Service
@Slf4j
public class NtsContactPersonServiceImpl extends ServiceImpl<NtsContactPersonMapper, NtsContactPerson> implements NtsContactPersonService {

    private String addContactsUrl = "https://app.dtuip.com/api/alarms/addContacts";
    private String getContactsUrl = "https://app.dtuip.com/api/alarms/getContacts";
    private String updateContactsUrl = "https://app.dtuip.com/api/alarms/updateContacts";
    private String deleteContactsUrl = "https://app.dtuip.com/api/alarms/deleteContacts";

    @Autowired
    private AuthenticationFacade authenticationFacade;

    @Autowired
    private CommonSequenceService commonSequenceService;

    @Autowired
    private RestTemplate restTemplate;

    /**
     * 联系人分页
     *
     * @param search
     * @param page
     * @param size
     * @return
     */
    @Override
    public Page<NtsContactPerson> contactPersonPage(String search, Integer page, Integer size) {
        QueryWrapper<NtsContactPerson> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("user_id", authenticationFacade.getUser().getUserId());
        if (StringUtils.isNotBlank(search)) {
            queryWrapper.and(wapper -> wapper
                    .like("name", search)
                    .or()
                    .like("mobile", search)
                    .or()
                    .like("email", search));
        }
        return this.page(new Page<>(page, size), queryWrapper);
    }

    /**
     * 新增联系人
     *
     * @param ntsContactPersonRq
     */
    @Override
    public void add(NtsContactPersonRq ntsContactPersonRq) {
        checkAddParam(ntsContactPersonRq);
        // 数据同步到 TLINK
//        addContacts2TLink(ntsContactPersonRq);

        NtsContactPerson ntsContactPerson = new NtsContactPerson();
        BeanUtils.copyProperties(ntsContactPersonRq, ntsContactPerson);
        UserDto userDto = authenticationFacade.getUser();
        ntsContactPerson.setUserId(userDto.getUserId());
        ntsContactPerson.setCreateBy(userDto.getNickname());
        ntsContactPerson.setCreateTime(new Date());
        ntsContactPerson.setNickMame(ntsContactPerson.getName());
        ntsContactPerson.setName(ntsContactPerson.getName());
        //String code = commonSequenceService.getCommonSequence(NtsUtil.generateCode(4) + "_p", null, 10, "\\‘nts_contact_person’\\");
        //ntsContactPerson.setCode(code);


        this.save(ntsContactPerson);
    }

    /**
     * 添加联系人到Tlink
     *
     * @param ntsContactPersonRq
     */
    private void addContacts2TLink(NtsContactPersonRq ntsContactPersonRq) {
        HttpHeaders httpHeaders = getHttpHeaders();

        Map<String, Object> map = getStringMap(ntsContactPersonRq);
        getRest(httpHeaders, map, addContactsUrl);
    }

    /**
     * 获取http 请求头
     *
     * @param ntsContactPersonRq
     * @return
     */
    private Map<String, Object> getStringMap(NtsContactPersonRq ntsContactPersonRq) {
        Map<String, Object> map = new HashMap<>();
        map.put("userId", TLinkUtil.getTLinkUserId());
        map.put("name", ntsContactPersonRq.getName());
        map.put("email", ntsContactPersonRq.getEmail());
        map.put("mobile", ntsContactPersonRq.getMobile());
        return map;
    }

    /**
     * 修改Tlink
     *
     * @param contacts2TLink
     * @param ntsContactPersonRq
     */
    private void editContacts2TLink(NtsContactPerson contacts2TLink, NtsContactPersonRq ntsContactPersonRq) {
        HttpHeaders httpHeaders = getHttpHeaders();
        Map<String, Object> map = getStringMap(ntsContactPersonRq);
        map.put("id", contacts2TLink.getId());

        getRest(httpHeaders, map, updateContactsUrl);
    }

    /**
     * 删除Tlink
     *
     * @param contacts2TLink
     */
    private void deleteContacts2TLink(NtsContactPerson contacts2TLink) {
        Map<String, Object> map = new HashMap<>();

        HttpHeaders httpHeaders = getHttpHeaders();
        map.put("userId", TLinkUtil.getTLinkUserId());
        map.put("id", contacts2TLink.getId());

        getRest(httpHeaders, map, deleteContactsUrl);
    }

    /**
     * 获取rest
     *
     * @param httpHeaders
     * @param map
     * @param updateContactsUrl
     */
    private void getRest(HttpHeaders httpHeaders, Map<String, Object> map, String updateContactsUrl) {
        HttpEntity httpEntity = new HttpEntity<>(map, httpHeaders);
        String object = restTemplate.postForObject(updateContactsUrl, httpEntity, String.class);
        JSONObject jsonObject = JSONObject.parseObject(object);
        Object flag = jsonObject.get("flag");
        if (!flag.equals("00")) {
            throw new ShopException(-1, (String) jsonObject.get("msg"));
        }
    }

    /**
     * 获取请求头
     *
     * @return
     */
    private HttpHeaders getHttpHeaders() {
        Map<String, String> header = TLinkUtil.getHeader();
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("authorization", header.get("accesstoken"));
        httpHeaders.add("tlinkAppId", header.get("clientId"));
        httpHeaders.add("Content-Type", "application/json");
        httpHeaders.add("cache-control", "no-cache");
        return httpHeaders;
    }

    /**
     * 修改联系人
     *
     * @param ntsContactPersonRq
     */
    @Override
    public void edit(NtsContactPersonRq ntsContactPersonRq) {
        checkUpdateParam(ntsContactPersonRq);
        // 数据同步到 TLINK
        NtsContactPerson ntsContactPerson = new NtsContactPerson();
        BeanUtils.copyProperties(ntsContactPersonRq, ntsContactPerson);
        UserDto userDto = authenticationFacade.getUser();
        ntsContactPerson.setUpdateBy(userDto.getNickname());
        ntsContactPerson.setUpdateTime(new Date());
        ntsContactPerson.setNickMame(ntsContactPerson.getName());

//        NtsContactPerson contacts2TLink = getContacts2TLink(ntsContactPersonRq);
//        editContacts2TLink(contacts2TLink, ntsContactPersonRq);

        this.updateById(ntsContactPerson);
    }

    private NtsContactPerson getContacts2TLink(NtsContactPersonRq ntsContactPersonRq) {
        HttpHeaders httpHeaders = getHttpHeaders();

        Map<String, Object> map = new HashMap<>();
        map.put("userId", TLinkUtil.getTLinkUserId());
        map.put("currPage", 1);
        map.put("pageSize", 100);

        HttpEntity httpEntity = new HttpEntity<>(map, httpHeaders);
        String object = restTemplate.getForObject(getContactsUrl, String.class, httpEntity);
        JSONObject jsonObject = JSONObject.parseObject(object);
        Object flag = jsonObject.get("flag");
        if (!flag.equals("00")) {
            throw new ShopException(-1, (String) jsonObject.get("msg"));
        }
        JSONArray dataList = (JSONArray) jsonObject.get("dataList");
        List<NtsContactPerson> contactPersonList = JSONObject.parseArray(dataList.toJSONString(), NtsContactPerson.class);
        Optional<NtsContactPerson> personOptional = contactPersonList.stream().filter(c -> StringUtils.equals(c.getName(), ntsContactPersonRq.getName())).findFirst();
        if (!personOptional.isPresent()) {
            throw new ShopException(-1, "联系人信息不存在");
        }
        return personOptional.get();
    }

    /**
     * 删除联系人
     *
     * @param ids
     */
    @Override
    public void delete(String ids) {
        // 数据同步到 TLINK
        if (StringUtils.isBlank(ids)) {
            throw new ShopException(-1, "联系人ID不能为空");
        }
        JSONObject jsonObject = JSONObject.parseObject(ids);
        List<Long> list = (List<Long>) jsonObject.get("ids");

//        List<NtsContactPerson> contactPersonList = this.list(new QueryWrapper<NtsContactPerson>().in("id", list));
//        contactPersonList.forEach(c -> {
//            NtsContactPersonRq ntsContactPersonRq = new NtsContactPersonRq();
//            BeanUtils.copyProperties(c, ntsContactPersonRq);
//            NtsContactPerson contacts2TLink = getContacts2TLink(ntsContactPersonRq);
//            deleteContacts2TLink(contacts2TLink);
//        });

        this.removeByIds(list);

    }

    /**
     * 校验修改联系人参数
     *
     * @param ntsContactPersonRq
     */
    private void checkUpdateParam(NtsContactPersonRq ntsContactPersonRq) {
        if (null == ntsContactPersonRq.getId()) {
            throw new ShopException(-1, "联系人ID不能为空");
        }
        NtsContactPerson contactPerson = this.getById(ntsContactPersonRq.getId());
        if (null == contactPerson) {
            throw new ShopException(-1, "联系人不存在");
        }
        NtsContactPerson name = getOne(new QueryWrapper<NtsContactPerson>().eq("name", ntsContactPersonRq.getName()));
        if (null != name &&
                !StringUtils.equals(contactPerson.getName(), name.getName())) {
            throw new ShopException(-1, "联系人名称已存在");
        }
        NtsContactPerson mobile = getOne(new QueryWrapper<NtsContactPerson>().eq("mobile", ntsContactPersonRq.getMobile()));
        if (null != mobile &&
                !StringUtils.equals(contactPerson.getMobile(), mobile.getMobile())) {
            throw new ShopException(-1, "电话号码已存在");
        }
        NtsContactPerson email = getOne(new QueryWrapper<NtsContactPerson>().eq("email", ntsContactPersonRq.getEmail()));
        if (null != email &&
                !StringUtils.equals(contactPerson.getEmail(), email.getEmail())) {
            throw new ShopException(-1, "邮箱已存在");
        }
    }

    /**
     * 校验新增联系人参数
     *
     * @param ntsContactPersonRq
     */
    private void checkAddParam(NtsContactPersonRq ntsContactPersonRq) {
        int name = count(new QueryWrapper<NtsContactPerson>().eq("name", ntsContactPersonRq.getName()));
        if (name > 0) {
            throw new ShopException(-1, "联系人已存在");
        }
        int mobile = count(new QueryWrapper<NtsContactPerson>().eq("mobile", ntsContactPersonRq.getMobile()));
        if (mobile > 0) {
            throw new ShopException(-1, "电话号码已存在");
        }
        int email = count(new QueryWrapper<NtsContactPerson>().eq("email", ntsContactPersonRq.getEmail()));
        if (email > 0) {
            throw new ShopException(-1, "邮箱已存在");
        }
    }
}
