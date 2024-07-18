package com.hspedu.object_;

public class Finalize_ {
    public static void main(String[] args) {

        Car bmw = new Car("宝马");
        bmw = null;//这是 car对象就是一个垃圾,垃圾回收器就会回收(销毁)对象,在销毁对象前,会调用该对象的finalize方法
        //程序员就可以在finalize中写自己的逻辑业务(比如 数据库的连接，打开的文件.....)
        System.gc();//主动调用垃圾回收器
        System.out.println("程序退出了.....");
    }
}

class Car{

    private String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("我们销毁了 汽车" + name);
        System.out.println("释放了某些资源....");
    }
}
