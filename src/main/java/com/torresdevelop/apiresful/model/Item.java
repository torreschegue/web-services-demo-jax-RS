package com.torresdevelop.apiresful.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Item {
    private int id;
    private String description;
    private int price;

    public Item() {

    }

    public Item(String description, int price, int id) {
        this.id = id;
        this.description = description;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
