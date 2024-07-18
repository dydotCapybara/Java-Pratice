package com.hspedu.homework.H5;

public class Worker extends Employee{

    public Worker(String name, double salary) {
        super(name, salary);
    }

    @Override
    public String toString() {
        return super.toString() + " is a Worker  Salary: "
                + super.getSalary() + "}";
    }
}
