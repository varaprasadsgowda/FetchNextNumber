package com.example.FetchNextNumber.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "keyValue")
public class table {
    @Id
    @Column
    private int category;
    @Column
    private int value;

    public table(int category, int value) {
        this.category = category;
        this.value = value;
    }

    public table() {

    }


    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "table{" +
                "category='" + category + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
