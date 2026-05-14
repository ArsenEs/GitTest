package org.example.interfaces;

public class Animal implements Info {
    int id;

    public void sleeping(){
        System.out.println(id+ " sleeping");
    }

    public Animal(int id) {
        this.id = id;
    }

    @Override
    public void showInfo() {
        System.out.println("hello, my ID is" + id);
    }
}
