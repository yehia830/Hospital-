package com.tiy.practice;

/**
 * Created by Yehia830 on 8/29/16.
 */
public class Patient extends Person {

    private int isSick = -1;
    private String sickness;

    public int isSick() {
        return isSick;
    }

    public void setSick(int sick) {
        isSick = sick;
    }

    public String getSickness() {
        return sickness;
    }

    public void setSickness(String sickness) {
        this.sickness = sickness;
    }

    public Patient(String firstName, String lastName) {
        super(firstName, lastName);
    }
}
