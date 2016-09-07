package com.tiy.practice;

/**
 * Created by Yehia830 on 8/29/16.
 */
public class GeneralDoctor extends HospitalDoctor implements Surgeon {

    public GeneralDoctor(String firstName, String lastName, String college) {
        super(firstName, lastName, college);
    }

    public Diagnosis diagnose() {
        return new Diagnosis(Diagnosis.COMMON_COLD);
    }

    public boolean operate(Patient patient) {
        patient.setSick(0);
        return true;
    }
}
