package org.example.interfaces;

public class Test {
    public static void main(String[] args) {
        Info animal = new Animal(001);
        Info pers = new Person("Arsen");

        animal.showInfo();
        pers.showInfo();
    }
}
