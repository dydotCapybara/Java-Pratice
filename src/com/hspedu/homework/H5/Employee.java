package com.hspedu.homework.H5;

public class Employee {

    private String name;
    private double salary;
    private int salMonth = 12;//默认为12个月

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary * getSalMonth();//月工资
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getSalMonth() {
        return salMonth;
    }

    public void setSalMonth(int salMonth) {
        this.salMonth = salMonth;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name : " + name;
    }
}
