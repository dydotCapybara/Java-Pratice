package com.hspedu.override_;

public class OverrideExercise {
    public static void main(String[] args) {
        Person person = new Person("jack",18);
        System.out.println(person.say());
        Student student = new Student("tom",23,1930200142,99.9);
        System.out.println(student.say());
    }
}
