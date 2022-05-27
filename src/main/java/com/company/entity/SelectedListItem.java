package com.company.entity;/*
com.company.entity
webShop
Popchiyk
05.05.2022 05 11:02 2022 */

import java.time.LocalDateTime;
import java.util.Objects;

public class SelectedListItem {

    private Integer idSelected;
    private int quantity;
    private LocalDateTime createdAt;
    private User idUser;
    private Item idItem;

    public SelectedListItem() {
    }

    public SelectedListItem(Integer idSelected, int quantity, LocalDateTime createdAt, User idUser, Item idItem) {
        this.idSelected = idSelected;
        this.quantity = quantity;
        this.createdAt = createdAt;
        this.idUser = idUser;
        this.idItem = idItem;
    }

    public int getIdSelected() {
        return idSelected;
    }

    public void setIdSelected(int idSelected) {
        this.idSelected = idSelected;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public User getIdUser() {
        return idUser;
    }

    public void setIdUser(User idUser) {
        this.idUser = idUser;
    }

    public Item getIdItem() {
        return idItem;
    }

    public void setIdItem(Item idItem) {
        this.idItem = idItem;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SelectedListItem that = (SelectedListItem) o;
        return idSelected.equals(that.idSelected);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idSelected);
    }

    @Override
    public String toString() {
        return "SelectedListItem{" +
                "idSelected=" + idSelected +
                ", quantity=" + quantity +
                ", createdAt=" + createdAt +
                ", idUser=" + idUser +
                ", idItem=" + idItem +
                '}';
    }
}
