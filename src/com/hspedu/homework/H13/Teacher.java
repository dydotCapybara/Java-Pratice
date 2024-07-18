package com.hspedu.homework.H13;

/**
 * 写一个Teacher类，Teacher类有名称（name），性别（sex），年龄（age），工龄（work_age），
 * 做合理封装，通过构造器在创建对象时将4个属性赋值。
 */
public class Teacher extends Person {

    private int work_age;

    public Teacher(String name, int age, char sex, int work_age) {
        super(name, age, sex);
        setWork_age(work_age);
    }

    public int getWork_age() {
        return work_age;
    }

    public void setWork_age(int work_age) {
        if (work_age >= 0 && work_age <= getAge()) {
            this.work_age = work_age;
        } else {
            System.out.println(getName() + "Work age must be between 0 and the teacher's age");
            this.work_age = 5;
        }
    }

    public void teach(){
        System.out.println("我承诺，我会认真教学。");
    }

    public String play(){
        return super.play() + "象棋";
    }

    public void printInfo(){
        System.out.println("教师的信息：");
        super.printInfo();
        System.out.println("工龄：" + work_age);
    }
}




