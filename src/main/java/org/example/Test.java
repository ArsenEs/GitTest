package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        readFile();



    }

    public static void readFile(){
        File file = new File("sea");
        try {
            Scanner sc = new Scanner(file);
            System.out.println("Файл найден!");
        } catch (FileNotFoundException e){
            System.out.println("Нет файла");
        }
    }
}
