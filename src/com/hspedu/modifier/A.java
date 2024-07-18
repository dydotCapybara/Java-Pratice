package com.hspedu.modifier;

public class A {

    //分别使用四个不同的修饰符来修饰四个变量
    public int n1 = 100;
    protected int n2 = 200;
    int n3 = 300;
    private int n4 = 400;


    public void m1(){
    //该方法可以访问四个属性
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);
    }

    protected void m2(){
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);
    }
    void m3(){

    }
    private void m4(){

    }
    public void hi(){
        m1();
        m2();
        m3();
        m4();
    }
}
