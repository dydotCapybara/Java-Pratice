package com.hspedu.poly_.objpoly_;

public class PloyObjet {
    public static void main(String[] args) {
        //体验对象多态 特点

        //animal 编译类型是 Animal, 运行类型是Dog
        Animal animal = new Dog();//向上转型
        animal.cry();//运行时, 这时就执行到改行时, animal运行类型是Dog
        //所以cyr是Dog的cry

        //animal 编译类型是 Animal, 运行类型就是Cat
        animal = new Cat();
        animal.cry();
    }
}
