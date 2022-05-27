package com.company.DAO;/*
com.company.DAO
webShop
Popchiyk
05.05.2022 05 11:27 2022 */

import com.company.entity.Item;

public interface IItemDAO extends IBaseDAO<Item,Integer>{
    Item findByCategoryId(int idItem);
    Item findByProviderId(int idItem);
    Item findByShareId(int idItem);
    Item findBySelectedUserItem(int idItem);
    Item findByReviewUserItem(int idItem);
}
