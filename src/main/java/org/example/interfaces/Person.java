package org.example.interfaces;

public class Person implements Info {
     String name;

     public void sayHello(){
         System.out.println("hello, my name is" + name);

     }

    public Person(String name) {
        this.name = name;
    }


    public void showInfo() {
        System.out.println("hello, my name is" + name);
        sayHello();
    }
}
