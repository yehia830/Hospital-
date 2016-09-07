package com.tiy.practice;

import java.util.ArrayList;

/**
 * Created by Yehia830 on 8/29/16.
 */
public class Hospital {
    private String name = "Dom's Hospital";
    ArrayList<HospitalDoctor> doctorArrayList = new ArrayList<HospitalDoctor>();
    ArrayList<Patient> patientList = new ArrayList<Patient>();

   public ArrayList<HospitalDoctor> getDoctorArrayList() {

      return doctorArrayList;
   }

   public void addDoctorsList(HospitalDoctor myDoc){
       doctorArrayList.add(myDoc);
   }
    public ArrayList<Patient> getPatientList() {
        return patientList;
    }

    public void addPatientList(Patient patient) {
        patientList.add(patient);
    }






    public Hospital(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
