package com.imooc.miaosha.pojo;

import lombok.Data;

@Data
public class User {
    private Integer id;

    private String name;

    private Byte gender;

    private Integer age;

    private String telphone;

    private String registerMode;

    private String thirdPartyId;
}