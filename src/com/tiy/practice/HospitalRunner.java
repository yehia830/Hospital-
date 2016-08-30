package com.tiy.practice;


import com.sun.jdi.IntegerValue;

import java.util.ArrayList;
import java.util.Scanner;

public class HospitalRunner {

    public static void main(String[] args) {
        Hospital hospital = new Hospital("Hospital of Arrays");
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many doctors are in the hosptal? ");

        int numOfDocs = Integer.valueOf(scanner.nextLine());
        ArrayList<String> docspec = new ArrayList<String>();

        int actionChoice = 0;
        for (int counter = 0; counter < numOfDocs; counter++) {

            System.out.println("What is the speciality of doctor " + counter);
            System.out.println("Choose One ");
            System.out.println(" 1. Lung Cancer ");
            System.out.println(" 2. Brain Cancer ");
            System.out.println(" 3. Common Cold ");
            System.out.println(" 4. Strep Throat ");
            System.out.println(" 5. I cant find the right doctor! ");
            actionChoice = Integer.valueOf(scanner.next());
            if (actionChoice == 1) {
                docspec.add("Lung Cancer");
            }
            if (actionChoice == 2) {
                docspec.add("Brain Cancer");
            }
            if (actionChoice == 3)
                docspec.add("Heart Cancer");

            if (actionChoice == 4) {
                docspec.add("Strep Thorat");
            }
            if (actionChoice == 0) {
                break;

            }


        }
        for (String name : docspec) {
            int counter = 1;
            System.out.println(counter + " . " + name);
            counter++;
        }

        int choice = 0;
        System.out.println("What is your illness?");
        System.out.println("Choose One ");
        System.out.println("1. Lung Cancer ");
        System.out.println("2. Brain Cancer ");
        System.out.println("3. Common Cold ");
        System.out.println("4. Strep Throat ");
        System.out.println("5. My Illness is not displayed");
        choice = Integer.valueOf(scanner.next());

        HospitalDoctor pulDoc = new Pulmonologist("James", "Glavin", "MIT");
        HospitalDoctor OtoDoc = new Otolaryngologist("Mike", "Smith", "Emory");
        HospitalDoctor SurgOnco = new SurgicalOncologist("John", "Dennis", "Harvard");
        HospitalDoctor GenDoc = new GeneralDoctor("Youssif", "Abdullah", "Emory");
        Patient newPatient = new Patient("David", "Polk");

        if (choice == 1) {
            if (choice == actionChoice) {
                System.out.println("successful!");
            } else {
                System.out.println("operation not successful!");
            }

        }
        if (choice == 2) {
            if (choice == actionChoice) {
                System.out.println("successful!");
            } else {
                System.out.println("operation not successful!");
            }

            if (choice == 3) {
                if (choice == actionChoice) {
                    System.out.println("successful!");
                } else {
                    System.out.println("operation not successful!");
                }
            }
            if (choice == 4) {
                if (choice == actionChoice) {
                    System.out.println("successful!");
                } else {
                    System.out.println("operation not successful!");
                }

            }
            if (choice == 5) {
                System.out.println("Please go to another hospital!");
            }


//        HospitalDoctor firstDoc = new SurgicalOncologist("James", "Glavin", "MIT");
//        Patient firstPatient = new Patient("David", "Polk");
//
//        if (firstDoc instanceof SurgicalOncologist) {
//            boolean success = ((SurgicalOncologist)firstDoc).operate(firstPatient);
//            if (success) {
//                System.out.println("Successful operation!");
//            } else {
//                System.out.println("Operation failed!!!");
//            }
//        }
//
//        System.out.println("HospitalRunner.main() - done!");
//    }


        }
    }
}