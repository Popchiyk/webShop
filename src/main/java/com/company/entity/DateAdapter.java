package com.company.entity;/*
com.company.entity
webShop
Popchiyk
10.05.2022 05 11:56 2022 */

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateAdapter extends XmlAdapter<String, Date> {
    @Override
    public Date unmarshal(String v) throws Exception {
        return new SimpleDateFormat("dd/MM/yyyy").parse(v);
    }

    @Override
    public String marshal(Date v) throws Exception {
        return new SimpleDateFormat("dd/MM/yyyy").format(v);
    }
}
