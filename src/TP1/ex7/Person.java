package TP1.ex7;

import TP1.ex7.Admin;
import TP1.ex7.User;

public class Person extends Admin implements User {
    public Person(String name, int age, String role) {
        super(name, age, role);
    }

    @Override
    public void logPerson() {
        System.out.println("Name: "+this.name+"\nAge: "+this.age+"\nRole: "+this.role);
    }
}
