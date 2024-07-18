package com.hspedu.homework.H7;

class Demo extends Test {
    String name = "Jack";
    Demo() {
        super();
        System.out.println("Demo");
    }
    Demo(String s) {
        super(s);
    }
    public void test() {
        System.out.println(super.name);
        System.out.println(this.name);
    }
    public static void main(String[] args) {
        new Demo().test();
        new Demo("john").test();
    }
}

