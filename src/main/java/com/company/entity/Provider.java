package com.company.entity;/*
com.company.entity
webShop
Popchiyk
05.05.2022 05 11:12 2022 */

import java.time.LocalDateTime;
import java.util.Objects;

public class Provider {

    private Integer idProvider;
    private String nameItem;
    private int quantity;
    private String nameCompany;
    private String country;
    private int price;
    private LocalDateTime providedAt;

    public Provider() {
    }

    public Provider(Integer idProvider, String nameItem, int quantity, String nameCompany, String country,
                    int price, LocalDateTime providedAt) {
        this.idProvider = idProvider;
        this.nameItem = nameItem;
        this.quantity = quantity;
        this.nameCompany = nameCompany;
        this.country = country;
        this.price = price;
        this.providedAt = providedAt;
    }

    public Integer getIdProvider() {
        return idProvider;
    }

    public void setIdProvider(Integer idProvider) {
        this.idProvider = idProvider;
    }

    public String getNameItem() {
        return nameItem;
    }

    public void setNameItem(String nameItem) {
        this.nameItem = nameItem;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getNameCompany() {
        return nameCompany;
    }

    public void setNameCompany(String nameCompany) {
        this.nameCompany = nameCompany;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public LocalDateTime getProvidedAt() {
        return providedAt;
    }

    public void setProvidedAt(LocalDateTime providedAt) {
        this.providedAt = providedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Provider provider = (Provider) o;
        return idProvider.equals(provider.idProvider);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idProvider);
    }

    @Override
    public String toString() {
        return "Provider{" +
                "idProvider=" + idProvider +
                ", nameItem='" + nameItem + '\'' +
                ", quantity=" + quantity +
                ", nameCompany='" + nameCompany + '\'' +
                ", country='" + country + '\'' +
                ", price=" + price +
                ", providedAt=" + providedAt +
                '}';
    }
}
