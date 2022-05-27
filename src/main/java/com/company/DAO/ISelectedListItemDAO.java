package com.company.DAO;/*
com.company.DAO
webShop
Popchiyk
05.05.2022 05 12:02 2022 */

import com.company.entity.SelectedListItem;

public interface ISelectedListItemDAO extends IBaseDAO<SelectedListItem,Integer>{
    SelectedListItem findByItem(int id);
    SelectedListItem findByUser(int id);
}
