package com.example.FetchNextNumber.model;

public class returnObject {
    private int oldValue;
    private int newValue;


    public returnObject(int oldValue, int newValue) {
        this.oldValue = oldValue;
        this.newValue = newValue;
    }



    public int getOldValue() {
        return oldValue;
    }

    public void setOldValue(int oldValue) {
        this.oldValue = oldValue;
    }

    public int getNewValue() {
        return newValue;
    }

    public void setNewValue(int newValue) {
        this.newValue = newValue;
    }


}
