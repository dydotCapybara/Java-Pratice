package com.use;

import com.xiaoqiang.Dog;

public class Test {
    public static void main(String[] args) {

        Dog dog = new Dog();
        System.out.println(dog);//com.xiaoqiang.Dog@4554617c

        com.xiaoming.Dog dog1 = new com.xiaoming.Dog();
        System.out.println(dog1);//com.xiaoming.Dog@74a14482

        System.out.println(Math.abs(-1));
    }
}
