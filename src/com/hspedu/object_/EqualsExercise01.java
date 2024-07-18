package com.hspedu.object_;

public class EqualsExercise01 {
    public static void main(String[] args) {
        Person person1 = new Person("jack", 10, '男');
        Person person2 = new Person("damn", 10, '男');
        System.out.println(person1.equals(person2));//Object类的equals方法是比较两个对象的引用是否相同
    }
}
