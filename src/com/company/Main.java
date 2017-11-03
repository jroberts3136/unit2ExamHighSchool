package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner intInput = new Scanner(System.in);
        Scanner doubleInput = new Scanner(System.in);
        Scanner lineInput = new Scanner(System.in);

        int numStudents;
        double tempGpa;
        String tempName;

        System.out.println("How many students are in the class?");
        numStudents = intInput.nextInt();
        Student [] classStudents = new Student[numStudents];

        System.out.println("The program will now have you supply the information for each student.");
        for (int i = 0; i < classStudents.length; i++){
            System.out.println("What is the student's name?");
            tempName = lineInput.nextLine();

            System.out.println("What is "+tempName+"'s GPA?");
            tempGpa = doubleInput.nextDouble();

            classStudents[i] = new Student(tempName,tempGpa);
        }

        
    }
}
