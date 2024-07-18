package com.hspedu.homework.H1;

/***
 * 定义一个Person类（name, age, job), 初始化Person对象数组，
 * 有3个person对象，并按照age从大到小进行排序，提示，使用冒泡排序
 */
public class Homework01 {
    public static void main(String[] args) {
        Person[] person = new Person[3];
        person[0] = new Person("Alice", 27, "前端工程师");
        person[1] = new Person("Bob", 26, "后端工程师");
        person[2] = new Person("Jack", 44, "算法工程师");

        System.out.println("Do Nothing to The Person");
        for (Person p : person) {
            System.out.println(p.toString());
        }

        // 调用 Bubble_Sort_Age 方法对 Person 对象数组按年龄排序
        Person.Bubble_Sort_Age(person);

        // 打印排序后的 Person 对象数组
        System.out.println("Sorted by age:");
        for (Person p : person) {
            System.out.println(p.toString());
        }


        Person.Bubble_Sort_NameLength(person);
        System.out.println("Sorted by name length:");
        for (Person p : person) {
            System.out.println(p.toString());
        }
    }
}
