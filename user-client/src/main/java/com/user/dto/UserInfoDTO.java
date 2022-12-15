package com.user.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserInfoDTO implements Serializable {

    private String name;

    private String sex;
}
