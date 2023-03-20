package TP0.ex5;

import java.util.ArrayList;

public class Teacher extends Person implements TeacherTasks{
    private ArrayList<Student> studentList = new ArrayList<>();
    private Subject subject;

    public Teacher(String name, int age, String phoneNumber, Subject subject) {
        super(name, age, phoneNumber);
        this.studentList = studentList;
        this.subject = subject;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

    public void addToStudentList(Student s) {
        this.studentList.add(s);
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public void passingStudents(){
        System.out.println("Passing students: ");
        for(Student s: studentList){
            if(s.getMean() > 5.0){
                System.out.println(s);
            }
        }
    }

    @Override
    public void printTitle() {
        System.out.println(this.getName() + "est un professeur.");
    }

    @Override
    public void teach() {
        System.out.println("Professeur " + this.getName() + " enseigne " + this.subject);
    }

    @Override
    public void grade(Student s, int[] grades) {
        s.setGrades(grades);
        s.calculateMean();
    }
}
