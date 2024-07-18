package com.hspedu.homework.H4;

/**
 * 通过继承实现员工工资核算打印功能 Homework04.java
 * 类：员工类(Employee)
 * (1) 经理类(Manager)、普通工人类(Worker)
 * (2) 部门经理底薪=1000+单日工资天数等级（1.2）=》奖金=基本工资
 * 普通工人工资=单日工资天数等级（1.0）=》奖金=基本工资
 * (3) 员工属性：姓名，单日工资，工作天数
 * 员工方法（打印工资）
 * (4) 普通员工和部门经理都是员工类，需要重写打印工资方法。
 * (5) 定义初始化一个员工对象，调用打印工资方法输出工资，定义并初始化部门经理对象，调用打印工资方法输出工资
 */
public class Homework04 {
    public static void main(String[] args) {
        Manager manage = new Manager("刘备", 100, 20, 1.2);
        //设置奖金
        manage.setBonus(3000);
        //打印经理的工资情况
        manage.printSal();

        Worker worker = new Worker("关羽",50, 10, 1.0);
        worker.printSal();
    }
}
