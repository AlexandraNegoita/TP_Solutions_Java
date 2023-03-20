package TP1.ex7;

public class Main {
    public static void main(String[] args) {
        Person[] persons = {
                new Person("John Doe", 25, "Administrator"),
                new Person("Jane Doe", 32, "Manager")
        };
        for (Person p : persons)
        {
            p.logPerson();
        }
    }
}
//Name: John Doe, Age: 25, Role: Administrator; Name: Jane Doe, Age: 32, Role: Manager