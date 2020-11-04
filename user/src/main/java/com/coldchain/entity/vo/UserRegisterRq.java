package com.coldchain.entity.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.coldchain.validation.annotation.Phone;
import com.common.utils.TimeUtil;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.List;

/**
 * <p>
 *
 * </p>
 *
 * @author dyr
 * @since 2019-08-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel("用户注册实体类")
public class UserRegisterRq implements Serializable {

    private static final long serialVersionUID = 1L;


    @NotBlank(message = "用户名不能为空")
    @ApiModelProperty("用户名")
    private String nickname;

    @NotBlank(message = "短信验证码不能为空")
    @ApiModelProperty("短信验证码")
    private String code;

    /**
     * 密码
     */
    @NotBlank(message = "登录密码不能为空（MD5加密）")
    private String password;

    @NotBlank(message = "确认登录密码不能为空（MD5加密）")
    private String confirmPassword;

    /**
     * 手机号码
     */
    @Phone
    private String mobile;


}
