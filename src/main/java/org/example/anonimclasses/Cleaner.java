package org.example.anonimclasses;

public class Cleaner implements Worker{
    @Override
    public void doWork() {
        System.out.println("Я работаю!!!");
    }

    public static void main(String[] args) {
        Cleaner w1 = new Cleaner();
        w1.doWork();

        Worker w2 = new Cleaner();
        w2.doWork();
    }

}

