package com.hspedu.modifier;

public class B {

    public void say() {
        A a = new A();
        //在同一个包下可以访问public、protected 和 默认,不能访问私有的
        System.out.println(a.n1);
        System.out.println(a.n2);
        System.out.println(a.n3);
//        System.out.println(a.n4);
        a.m1();
        a.m2();
        a.m3();
//        a.m4();
    }
}
