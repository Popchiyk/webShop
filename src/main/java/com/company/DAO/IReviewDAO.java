package com.company.DAO;/*
com.company.DAO
webShop
Popchiyk
05.05.2022 05 11:42 2022 */

import com.company.entity.Review;

public interface IReviewDAO extends IBaseDAO<Review,Integer>{
    Review findByUserItemId(int idReview);
}
