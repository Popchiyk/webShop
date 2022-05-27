package com.company.entity;/*
com.company.entity
webShop
Popchiyk
05.05.2022 05 11:05 2022 */

import java.util.Objects;

public class Delivery {

    private Integer idDelivery;
    private String address;
    private boolean courier;

    public Delivery() {
    }

    public Delivery(Integer idDelivery, String address, boolean courier) {
        this.idDelivery = idDelivery;
        this.address = address;
        this.courier = courier;
    }

    public Integer getIdDelivery() {
        return idDelivery;
    }

    public void setIdDelivery(Integer idDelivery) {
        this.idDelivery = idDelivery;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isCourier() {
        return courier;
    }

    public void setCourier(boolean courier) {
        this.courier = courier;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Delivery delivery = (Delivery) o;
        return idDelivery.equals(delivery.idDelivery);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idDelivery);
    }

    @Override
    public String toString() {
        return "Delivery{" +
                "idDelivery=" + idDelivery +
                ", address='" + address + '\'' +
                ", courier=" + courier +
                '}';
    }
}
