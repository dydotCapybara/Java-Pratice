package com.hspedu.homework.H5;

public class Peasant extends Employee{
    public Peasant(String name, double salary) {
        super(name, salary);
    }

    @Override
    public String toString() {
        return  super.toString() + " is a Peasant  Salary: "
                + super.getSalary() + "}";
    }
}
