package com.hspedu.homework.H3;

public class Professor extends Teacher {

    private double income;

    public Professor(String name, int age, String post, double salary) {
        super(name, age, post, salary);
        this.income = salary * 1.3;
    }

    public String introduce() {
        return "Professor " + super.introduce() + ", income: " + income;
    }
}
