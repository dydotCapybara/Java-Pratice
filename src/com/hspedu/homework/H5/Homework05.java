package com.hspedu.homework.H5;

public class Homework05 {
    public static void main(String[] args) {
        Worker worker = new Worker("Alice", 3000);
        worker.setSalMonth(13);//将工人的工资改为13薪
        Peasant peasant = new Peasant("Bob", 2500);
        Waiter waiter = new Waiter("Charlie", 2000);
        Teacher teacher = new Teacher("David", 4000);
        teacher.setClassDay(100);
        teacher.setClassSal(450);//修改补课的课时费和节数
        Scientist scientist = new Scientist("Eve", 5000, 20000);
        scientist.setSalMonth(18);//将科学家的工资改为18薪

        // 将对象存入Employee数组
        Employee[] employees = {worker, peasant, waiter, teacher, scientist};

        // 遍历数组并打印每个对象的信息
        for (Employee employee : employees) {
            System.out.println(employee);
            System.out.println("======================================================");
        }

    }
}
