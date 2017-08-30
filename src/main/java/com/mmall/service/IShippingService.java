package com.mmall.service;

import com.github.pagehelper.PageInfo;
import com.mmall.common.ServerResponse;
import com.mmall.pojo.Shipping;

/**
 * Created by dengtianyue on 2017/8/30.
 */
public interface IShippingService {

    ServerResponse add(Integer userId, Shipping shipping);

    ServerResponse del(Integer userId,Integer shippingId);

    ServerResponse update(Integer userId, Shipping shipping);

    ServerResponse<PageInfo>list (Integer userId, int pageNum, int pageSize);

    ServerResponse<Shipping> select(Integer userId,Integer shippingId);
}
