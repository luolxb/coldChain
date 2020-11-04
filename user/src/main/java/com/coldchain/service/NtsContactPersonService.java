package com.coldchain.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.coldchain.entity.NtsContactPerson;
import com.coldchain.entity.vo.NtsContactPersonRq;

public interface NtsContactPersonService extends IService<NtsContactPerson> {
    Page<NtsContactPerson> contactPersonPage(String search, Integer page, Integer size);

    void add(NtsContactPersonRq ntsContactPersonRq);

    void edit(NtsContactPersonRq ntsContactPersonRq);

    void delete(String ids);
}
