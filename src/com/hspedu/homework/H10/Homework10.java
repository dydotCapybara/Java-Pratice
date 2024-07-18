package com.hspedu.homework.H10;

public class Homework10 {
    public static void main(String[] args) {
        Doctor doctor1 = new Doctor("Jack", 20, "程序员", "男", 2000);
        Doctor doctor2 = new Doctor("Jack", 20, "程序员", "男", 2000);
        Doctor doctor3 = new Doctor("Jack", 21, "程序员", "男", 2000);
        System.out.println(doctor1.equals(doctor2));//ture
        System.out.println("=====");
        System.out.println(doctor1.equals(doctor3));//false
        System.out.println("=====");
        System.out.println(doctor1 == doctor2);//true
    }
}
