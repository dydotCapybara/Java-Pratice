package com.hspedu.homework.H3;

public class AssociateProfessor extends Teacher {

    private double income;

    public AssociateProfessor(String name, int age, String post, double salary) {
        super(name, age, post, salary);
        this.income = salary * 1.2;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public String introduce() {
        return "Associate Professor:" + super.introduce() + ", income: " + income;
    }
}
