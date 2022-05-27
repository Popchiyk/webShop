package com.company.entity;/*
com.company.entity
webShop
Popchiyk
05.05.2022 05 10:59 2022 */

import java.time.LocalDateTime;
import java.util.Objects;

public class Review {

    private Integer idReview;
    private int mark;
    private String text;
    private String header;
    private LocalDateTime createdAt;
    private User idUser;
    private Item idItem;

    public Review() {
    }

    public Review(Integer idReview, int mark, String text, String header, LocalDateTime createdAt, User idUser, Item idItem) {
        this.idReview = idReview;
        this.mark = mark;
        this.text = text;
        this.header = header;
        this.createdAt = createdAt;
        this.idUser = idUser;
        this.idItem = idItem;
    }

    public Integer getIdReview() {
        return idReview;
    }

    public void setIdReview(Integer idReview) {
        this.idReview = idReview;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
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
        Review review = (Review) o;
        return idReview.equals(review.idReview);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idReview);
    }

    @Override
    public String toString() {
        return "Review{" +
                "idReview=" + idReview +
                ", mark=" + mark +
                ", text='" + text + '\'' +
                ", header='" + header + '\'' +
                ", createdAt=" + createdAt +
                ", idUser=" + idUser +
                ", idItem=" + idItem +
                '}';
    }
}
