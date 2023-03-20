package TP0.ex5;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Georgina Ortiz", 20, "0393357802");
        Student s2 = new Student("Rebekah Carney", 19, "0292839282");
        Teacher t1 = new Teacher("Myla Dejesus", 40, "9389898296", Subject.OOP);

        s1.printTitle();
        t1.printTitle();
        System.out.println();

        t1.addToStudentList(s1);
        t1.addToStudentList(s2);
        t1.teach();
        t1.grade(s1, new int[]{10,9,8});
        t1.grade(s2, new int[]{3,2,4});
        System.out.println();

        System.out.println("La moyenne pour le premiere student: " + s1.getMean());
        System.out.println("La moyenne pour le deuxieme student: " + s2.getMean());
        System.out.println();

        t1.passingStudents();
    }
}