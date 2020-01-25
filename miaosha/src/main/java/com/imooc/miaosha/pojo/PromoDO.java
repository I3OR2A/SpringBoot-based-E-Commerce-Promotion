package com.imooc.miaosha.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class PromoDO {
    private Integer id;

    private String promoName;

    private Date startDate;

    private Integer itemId;

    private Double promoItemPrice;

    private Date endDate;
}