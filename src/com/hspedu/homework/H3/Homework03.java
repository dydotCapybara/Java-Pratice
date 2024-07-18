package com.hspedu.homework.H3;

/**
 * 编写老师类 Homework03.java
 * (1) 要求有属性：“姓名name”，“年龄age”，“职称post”，“基本工资salary”
 * (2) 编写业务方法：introduce()，实现输出一个教师的信息。
 * (3) 编写教师类的三个子类：教授类(Professor)、副教授类、副教授类、讲师类。工资级别分别为：教授为1.3，副教授为1.2，讲师为1.1。在三个子类里面都重写父类的introduce()方法。
 * (4) 定义初始化一个数组对象，调用业务方法，输出每个教师对象的信息的后台打印。
 */
public class Homework03 {
    public static void main(String[] args) {
        Professor professor = new Professor("Jack",62,"教授",20000);
        AssociateProfessor associateProfessor = new AssociateProfessor("Bob", 45, "副教授", 7800);
        Lecturer lecturer = new Lecturer("Charlie", 40, "讲师", 6500);

        System.out.println(professor.introduce());
        System.out.println(associateProfessor.introduce());
        System.out.println(lecturer.introduce());

    }
}
