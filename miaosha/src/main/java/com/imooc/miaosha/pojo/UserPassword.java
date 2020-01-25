package com.imooc.miaosha.pojo;

import lombok.Data;

@Data
public class UserPassword {
    private Integer id;

    private String encrptPassword;

    private Integer userId;
}