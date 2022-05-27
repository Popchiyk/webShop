package com.company.entity;/*
com.company.entity
webShop
Popchiyk
05.05.2022 05 11:00 2022 */

import java.util.Objects;

public class Item {

    private Integer idItem;
    private String name;
    private int price;
    private int quantity;
    private Category idCategory;
    private Share idShare;
    private Provider idProvider;

    public Item() {
    }

    public Item(Integer idItem, String name, int price, int quantity, Category idCategory, Share idShare,
                Provider idProvider) {
        this.idItem = idItem;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.idCategory = idCategory;
        this.idShare = idShare;
        this.idProvider = idProvider;
    }

    public Integer getIdItem() {
        return idItem;
    }

    public void setIdItem(Integer idItem) {
        this.idItem = idItem;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Category getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(Category idCategory) {
        this.idCategory = idCategory;
    }

    public Share getIdShare() {
        return idShare;
    }

    public void setIdShare(Share idShare) {
        this.idShare = idShare;
    }

    public Provider getIdProvider() {
        return idProvider;
    }

    public void setIdProvider(Provider idProvider) {
        this.idProvider = idProvider;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return idItem.equals(item.idItem);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idItem);
    }

    @Override
    public String toString() {
        return "Item{" +
                "idItem=" + idItem +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", idCategory=" + idCategory +
                ", idShare=" + idShare +
                ", idProvider=" + idProvider +
                '}';
    }
}
