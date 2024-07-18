package com.hspedu.homework.H5;

public class Scientist extends Employee{

    private double bouns;

    public Scientist(String name, double salary, double bouns) {
        super(name, salary);
        this.bouns = bouns;
    }

    public double getSalary() {
        return super.getSalary() + getBouns();
    }


    public double getBouns() {
        return bouns;
    }

    public void setBouns(double bouns) {
        this.bouns = bouns;
    }
    public String toString() {
        return super.toString() + " is a Scientist  Salary: "
                + getSalary() + "}";
    }
}
