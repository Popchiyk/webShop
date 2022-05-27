package com.company.entity;/*
com.company.entity
webShop
Popchiyk
05.05.2022 05 11:12 2022 */

import java.util.Objects;

public class Category {

    private Integer idCategory;
    private String name;

    public Category() {
    }

    public Category(Integer idCategory, String name) {
        this.idCategory = idCategory;
        this.name = name;
    }

    public Integer getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(Integer idCategory) {
        this.idCategory = idCategory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Category category = (Category) o;
        return idCategory.equals(category.idCategory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCategory);
    }

    @Override
    public String toString() {
        return "Category{" +
                "idCategory=" + idCategory +
                ", name='" + name + '\'' +
                '}';
    }
}
