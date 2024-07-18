package com.hspedu.homework.H5;

public class Teacher extends Employee {

    private int classDay;//一年上课次数
    private int classSal;//课时费

    public Teacher(String name, double salary, int classDay, int classSal) {
        super(name, salary);
        this.classDay = classDay;
        this.classSal = classSal;
    }

    public Teacher(String name, double salary) {
        super(name, salary);
    }//这个构造方法让课外的补课更加灵活

    public double getSalary() {
        return super.getSalary() + getClassDay() * getClassSal();
    }



    public int getClassDay() {
        return classDay;
    }

    public void setClassDay(int classDay) {
        this.classDay = classDay;
    }

    public int getClassSal() {
        return classSal;
    }

    public void setClassSal(int classSal) {
        this.classSal = classSal;
    }
    public String toString() {
        return super.toString() + " is a Teacher  Salary: "
                + getSalary() + "}";
    }
}
