package com.common.dto;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
@Data
public class AdminDto implements UserDetails, Serializable {

    private static final long serialVersionUID = 1L;


    private Integer adminId;

    /**
     * 用户名
     */
    private String userName;

    private String email;

    private String password;

    private Integer addTime;

    private Integer lastLogin;

    private String lastIp;

    private String navList;

    private String langType;

    /**
     * 支付密码
     */
    private String paypwd;

    /**
     * 角色id
     */
    private Integer roleId;

    /**
     * suppliers_id
     */
    private Integer suppliersId;

    /**
     * 0没有城市分站，1有
     */
    private Integer siteId;

    private Integer openTeach;


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> authorities = new ArrayList<>();
        authorities.add(new SimpleGrantedAuthority("ROLE_SELLER"));
        authorities.add(new SimpleGrantedAuthority("ROLE_USER"));
        authorities.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
        return authorities;
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public String getUsername() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }
}
