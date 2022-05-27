package com.company.DAO;/*
com.company.DAO
webShop
Popchiyk
05.05.2022 05 11:16 2022 */

import java.util.List;

public interface IBaseDAO<T,N> {
    T add(T t);
    void update(T t,N id);
    T getById(N id);
    void delete(N id);
    List<T> getAll();
}
