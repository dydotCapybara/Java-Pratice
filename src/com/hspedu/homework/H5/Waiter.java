package com.hspedu.homework.H5;

public class Waiter extends Employee{
    public Waiter(String name, double salary) {
        super(name, salary);
    }

    @Override
    public String toString() {
        return super.toString() + " is a Waiter  Salary: "
                + super.getSalary() + "}";
    }
}
