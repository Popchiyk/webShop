package com.company.entity;/*
com.company.entity
webShop
Popchiyk
05.05.2022 05 11:09 2022 */

import java.util.Objects;

public class Share {

    private Integer idShare;
    private int percent;

    public Share() {
    }

    public Share(int idShare, int percent) {
        this.idShare = idShare;
        this.percent = percent;
    }

    public Integer getIdShare() {
        return idShare;
    }

    public void setIdShare(Integer idShare) {
        this.idShare = idShare;
    }

    public int getPercent() {
        return percent;
    }

    public void setPercent(int percent) {
        this.percent = percent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Share share = (Share) o;
        return idShare.equals(share.idShare);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idShare);
    }

    @Override
    public String toString() {
        return "Share{" +
                "idShare=" + idShare +
                ", percent=" + percent +
                '}';
    }
}
