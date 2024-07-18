package com.hspedu.modifier;

public class Test {
    public static void main(String[] args) {
        A a = new A();
        a.m1();
//        System.out.println(a.n4);//访问不到
        System.out.println("========");
        B b = new B();
        b.say();
    }
}
