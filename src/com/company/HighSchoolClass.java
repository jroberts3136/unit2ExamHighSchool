package com.company;

/**
 * Created by jroberts3136 on 11/3/17.
 */
public class HighSchoolClass {

    private int valIndex = 0;
    private int honorsCount;
    private double honorsPercentage;
    private double gpaTrack = 0;
    private Student [] students;
    private Student valedictorian;

    public HighSchoolClass(Student []stnt){
        students = stnt;
    }

    public Student getValedictorian(){
        for (int i = 0; i < students.length; i++) {
            if (students[i].getGpa()>gpaTrack){
                valIndex = i;
                gpaTrack = students[i].getGpa();
            }
        }
        valedictorian = students[valIndex];
        return valedictorian;
    }

    public double getHonorsPercentage(){
        for (Student a:students) {
            if (a.isHonors()){
                honorsCount ++;
            }
        }
        honorsPercentage = (honorsCount/(students.length + 1)) * 100;
        return honorsPercentage;
    }

}
