package com.hspedu.pkg;

import com.hspedu.modifier.A;

public class Tets {

    public static void main(String[] args) {

        A a = new A();
        System.out.println(a.n1);
//        System.out.println(a.n2);
//        System.out.println(a.n3);
//        System.out.println(a.n4);
        a.m1();
        //不能访问a.m2(); a.m3(); a.m4()
    }
}
