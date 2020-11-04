package com.coldchain.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;

@Setter
@Getter
public class OEMUser {

    @JsonProperty(value = "user_id")
    private Integer userId;  //

    //@Email
    private String email;


    private String mobile;

    @JsonProperty(value = "nike_name")
    private String nikename;


    private String password;

    @JsonProperty(value = "company_id")
    private Integer companyId;
}
