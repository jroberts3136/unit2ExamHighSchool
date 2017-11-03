package com.company;

/**
 * Created by jroberts3136 on 11/3/17.
 */
public class Student {

    private boolean honors = false;
    private double gpa;
    private String name;

    public Student (String studentName, double studentGpa){
        name = studentName;
        gpa = studentGpa;

        if (gpa >= 3.5){
            honors = true;
        }
    }

    public String getName(){
        return name;
    }

    public double getGpa(){
        return gpa;
    }

    public boolean isHonors(){
        return honors;
    }
}
