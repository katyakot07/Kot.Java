package com.company;
import java.util.Scanner;
public class Slava {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = "Вячеслав";
        if(scan.hasNext(name)){
            System.out.println("Привет, +name");
        }
        else {
            System.out.println("Нет такого имени");
        }

    }
}