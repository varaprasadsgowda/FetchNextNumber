package com.example.FetchNextNumber.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class table {
    @Id
    private String category;
    @Column(nullable = false)
    private String value;

    public table(String category, String value) {
        this.category = category;
        this.value = value;
    }

    public table() {

    }


    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
