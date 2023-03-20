package TP0.ex5;

import java.util.Arrays;

public class Student extends Person{
    private int[] grades;
    private double mean;

    public Student(String name, int age, String phoneNumber) {
        super(name, age, phoneNumber);
        this.grades = grades;
    }

    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }

    public double getMean() {
        return mean;
    }

    public void setMean(double mean) {
        this.mean = mean;
    }

    public double calculateMean(){
        double avg=0;
        for(int grade : grades){
            avg += grade;
        }
        avg /= grades.length;
        this.setMean(avg);
        return avg;
    }

    @Override
    public String toString() {
        return "Nom: " + this.getName() +
                ", Mean: " + this.mean;
    }

    @Override
    public void printTitle() {
        System.out.println(this.getName() + "est un student.");
    }
}
