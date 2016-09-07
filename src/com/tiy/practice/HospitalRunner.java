package com.tiy.practice;


import com.sun.jdi.IntegerValue;

import java.util.ArrayList;
import java.util.Scanner;

public class HospitalRunner {
    static boolean docCure;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Hospital myHos = new Hospital("4-1 Hospital");

        while (true) {
            System.out.println("Welcome to " + myHos.getName());

            System.out.println("Type 0 to exit");

            System.out.println("How many doctors are in the " + myHos.getName());

            int numDoctors = Integer.valueOf(scanner.nextLine());

            if (numDoctors == 0) {
                break;
            }
            for (int counter = 0; counter < numDoctors; counter++) ;
            {
                System.out.println("What is the Doctor's first name?");
                String firstDoc = scanner.nextLine();
                System.out.println("What is the Doctor's last name?");
                String lastDoc = scanner.nextLine();
                System.out.println("Where did your Doctor graduate from?");
                String univDoc = scanner.nextLine();
                System.out.println("Choose a specialy for this Doctor");
                System.out.println("1. Pulmonologist");
                System.out.println("2. Surgical Oncologist");
                System.out.println("3. Otolaryngologist");
                System.out.println("4. General Doctor ");
                int docspec = Integer.valueOf(scanner.nextLine());
                if (docspec == 1) {
                    HospitalDoctor pulmDoc = new Pulmonologist(firstDoc, lastDoc, univDoc);
                    myHos.addDoctorsList(pulmDoc);
                } else if (docspec == 2) {
                    HospitalDoctor surgicalOncologist = new SurgicalOncologist(firstDoc, lastDoc, univDoc);
                    myHos.addDoctorsList(surgicalOncologist);
                } else if (docspec == 3) {
                    HospitalDoctor entDoc = new Otolaryngologist(firstDoc, lastDoc, univDoc);
                    myHos.addDoctorsList(entDoc);
                } else if (docspec == 4) {
                    HospitalDoctor generalDoc = new GeneralDoctor(firstDoc, lastDoc, univDoc);
                    myHos.addDoctorsList(generalDoc);
                }


            }

            System.out.println("How many Patients are here for treatment?");
            int numPatients = Integer.valueOf(scanner.nextLine());
            for (int currPatient = 0; currPatient < numPatients; currPatient++) {

                System.out.println("\nCreate a new Patient. ");
                System.out.println("What's your patient's first name?");
                String firstName = scanner.nextLine();
                System.out.println("What's your patient's last name?");
                String lastName = scanner.nextLine();
                System.out.println("What symptom does your patient have?");
                System.out.println("1. Lung Cancer");
                System.out.println("2. Brain Cancer");
                System.out.println("3. Common Cold");
                System.out.println("4. Strep Throat");
                int symptom = Integer.valueOf(scanner.nextLine());


                Patient currentPatient = new Patient(firstName, lastName);
                currentPatient.setSick(symptom);
                myHos.addPatientList(currentPatient);


                if (symptom == 3) {
                    for (HospitalDoctor myDoc : myHos.getDoctorArrayList()) {
                        if (myDoc instanceof GeneralDoctor) {
                            System.out.println();
                            docCure = true;
                            boolean success = ((GeneralDoctor) myDoc).operate(currentPatient);
                            System.out.println("Oh no, you have a Cold!");
                            if (success) {
                                System.out.println("You're healed!");
                            } else {
                                System.out.println("Sucks to be you");
                            }
                        }
                    }
                    if (docCure == false) {
                        System.out.println("The doctor you seek is not at this hospital");
                    } else if (symptom == 2) {
                        for (HospitalDoctor myDoc : myHos.getDoctorArrayList()) {
                            if (myDoc instanceof SurgicalOncologist) {
                                docCure = true;
                                System.out.println();
                                System.out.println("Oh no! You have Brain Cancer!");
                                boolean success = ((SurgicalOncologist) myDoc).operate(currentPatient);
                                if (success) {
                                    System.out.println("You're healed!");
                                } else {
                                    System.out.println("sucks to be you");
                                }
                            }
                        }
                    } if(docCure == false) {
                        System.out.println("The doctor you seek is not at this hospital!");
                    }
                    else if (symptom == 4) {
                        for (HospitalDoctor myDoc : myHos.getDoctorArrayList()) {
                            if (myDoc instanceof Otolaryngologist) {
                                System.out.println();
                                boolean success = ((Otolaryngologist) myDoc).operate(currentPatient);
                                docCure = true;
                                System.out.println();
                                System.out.println("Oh no! You have Brain Cancer!");

                                if (success) {
                                    System.out.println("You're healed!");
                                } else {
                                    System.out.println("sucks to be you");
                                }
                            }
                        }
                    }if(docCure == false) {
                        System.out.println("The doctor you seek is not at this hospital!");
                    }
                    else if(symptom == 1){
                        for (HospitalDoctor myDoc : myHos.getDoctorArrayList()) {
                            if (myDoc instanceof Pulmonologist) {
                                System.out.println();
                                boolean success = ((Otolaryngologist) myDoc).operate(currentPatient);
                                docCure = true;
                                System.out.println();
                                System.out.println("Oh no! You have Lung Cancer!");

                                if (success) {
                                    System.out.println("You're healed!");
                                } else {
                                    System.out.println("sucks to be you");
                                }
                            }
                        }

                    }if(docCure == false) {
                        System.out.println("The doctor you seek is not at this hospital!");
                    }
                        break;
                    }


                }


            }


        }

    }
