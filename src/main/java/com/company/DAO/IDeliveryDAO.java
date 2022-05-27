package com.company.DAO;/*
com.company.DAO
webShop
Popchiyk
05.05.2022 05 11:59 2022 */

import com.company.entity.Delivery;

public interface IDeliveryDAO extends IBaseDAO<Delivery,Integer>{
    Delivery findByCourierDelivery(boolean courier);
}
