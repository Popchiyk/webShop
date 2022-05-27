package com.company.entity;/*
com.company.entity
webShop
Popchiyk
05.05.2022 05 11:04 2022 */

import java.time.LocalDateTime;
import java.util.Objects;

public class Order {

    private Integer idOrder;
    private String payMethod;
    private LocalDateTime createdAt;
    private int price;
    private boolean complete;
    private SelectedListItem idSelected;
    private Delivery idDelivery;

    public Order() {
    }

    public Order(Integer idOrder, String payMethod, LocalDateTime createdAt, int price, boolean complete,
                 SelectedListItem idSelected, Delivery idDelivery) {
        this.idOrder = idOrder;
        this.payMethod = payMethod;
        this.createdAt = createdAt;
        this.price = price;
        this.complete = complete;
        this.idSelected = idSelected;
        this.idDelivery = idDelivery;
    }

    public Integer getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(Integer idOrder) {
        this.idOrder = idOrder;
    }

    public String getPayMethod() {
        return payMethod;
    }

    public void setPayMethod(String payMethod) {
        this.payMethod = payMethod;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }

    public SelectedListItem getIdSelected() {
        return idSelected;
    }

    public void setIdSelected(SelectedListItem idSelected) {
        this.idSelected = idSelected;
    }

    public Delivery getIdDelivery() {
        return idDelivery;
    }

    public void setIdDelivery(Delivery idDelivery) {
        this.idDelivery = idDelivery;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return idOrder.equals(order.idOrder);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idOrder);
    }

    @Override
    public String toString() {
        return "Order{" +
                "idOrder=" + idOrder +
                ", payMethod='" + payMethod + '\'' +
                ", createdAt=" + createdAt +
                ", price=" + price +
                ", complete=" + complete +
                ", idSelected=" + idSelected +
                ", idDelivery=" + idDelivery +
                '}';
    }
}
