package com.hspedu.homework.H11;

public class Homework11 {
    public static void main(String[] args) {
        Person dyy = new Student();//向上转型
        dyy.run();//student run
        dyy.eat();//person eat
//      dyy.study()//报错--->study()是特有方法
        Student student = (Student) dyy;//向下转型
        student.study();//student study
        student.eat();//person eat
        student.run();//student run
    }
}


/**
 * 现有 Person 类，里面有方法 run、eat，Student 类继承了 Person 类，并重写了 run 方法，自定义了 study 方法。
 * 试写出对象向上转型和向下转型的代码，并写出各自都可以调用哪些方法，并写出方法输出什么？
 */