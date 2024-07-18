package com.hspedu.debug_;

public class DebugExercise {
    public static void main(String[] args) {
        Person jack = new Person("jack", 20);//alt + shift + F7
        System.out.println(jack);//默认调用toString
    }
}

class Person{
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //重写父类Object的toString()方法
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}