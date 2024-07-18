package com.hspedu.homework.H3;

public class Lecturer extends Teacher {

    private double income;

    public Lecturer(String name, int age, String post, double salary) {
        super(name, age, post, salary);
        this.income = salary * 1.1;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public String introduce() {
        return "Lecturer " + super.introduce() + ", income: " + income;
    }
}
