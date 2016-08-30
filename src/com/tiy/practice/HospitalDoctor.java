package com.tiy.practice;

/**
 * Created by Yehia830 on 8/29/16.
 */
public abstract class HospitalDoctor extends Person implements Doctor {
    private String college;


    public HospitalDoctor(String firstName, String lastName, String college) {
        super(firstName, lastName);
        this.college = college;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

}
