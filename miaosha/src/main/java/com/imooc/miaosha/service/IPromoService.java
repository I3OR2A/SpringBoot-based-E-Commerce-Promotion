package com.imooc.miaosha.service;

import com.imooc.miaosha.service.model.PromoModel;

public interface IPromoService {
    //根据itemid获取即将进行的或正在进行的秒杀活动
    PromoModel getPromoByItemId(Integer itemId);
}
