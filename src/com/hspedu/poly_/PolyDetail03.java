package com.hspedu.poly_;

public class PolyDetail03 {
    public static void main(String[] args) {
        BB bb = new BB();
        System.out.println(bb instanceof BB);//true
        System.out.println(bb instanceof AA);//true

        //aa 编译类型是 AA , 运行类型是 BB
        AA aa = new BB();
        System.out.println(aa instanceof BB);//true
        System.out.println(aa instanceof AA);//true
        //------>判断的是运行类型

        //obj 编译类型是 Object, 运行类型是Object
        Object obj= new Object();
        System.out.println(obj instanceof AA);//false

        String str = "hello";
        //System.out.println(str instanceof AA);
        System.out.println(str instanceof Object);//tue


    }
}

class AA{}  //父类
class BB extends AA{}   //子类