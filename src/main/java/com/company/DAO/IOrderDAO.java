package com.company.DAO;/*
com.company.DAO
webShop
Popchiyk
05.05.2022 05 11:43 2022 */

import com.company.entity.Order;

public interface IOrderDAO extends IBaseDAO<Order,Integer>{
    Order findByCompletedOrder(boolean complete);
    Order findByDeliveryId(int id);
    Order findBySelectedItem(int id);
}
