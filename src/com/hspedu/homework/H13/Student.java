package com.hspedu.homework.H13;

import jdk.nashorn.internal.objects.annotations.Setter;

/**
 * Student类，Student类有名称（name），性别（sex），年龄（age），学号（stu_id），
 * 做合理封装，通过构造器在创建对象时将4个属性赋值。
 */
public class Student extends Person {

    private String stu_id;

    public Student(String name, int age, char sex, String stu_id) {
        super(name, age, sex);
        setStu_id(stu_id);
    }

    public String getStu_id() {
        return stu_id;
    }

    public void setStu_id(String stu_id) {
        if (stu_id != null && !stu_id.trim().isEmpty()) {
            this.stu_id = stu_id;
        } else {
            System.out.println(getName() + "Student ID cannot be null or empty");
            this.stu_id = "100000000";
        }
    }
    public void study(){
        System.out.println("我承诺，我会好好学习。");
    }

    public String play(){
        return super.play() + "足球";
    }

    public void printInfo(){
        System.out.println("学生的信息：");
        super.printInfo();
        System.out.println("学号：" + stu_id);
    }


}
