package com.hspedu.poly_;

public class PolyExercise {
    public static void main(String[] args) {
        Sub s = new Sub();//创建子类对象s
        //s的编译类型是Sub 运行类型是Sub
        System.out.println(s.count);//访问属性看编译类型----->20
        s.display();//从运行类型查找方法---->20

        Base b = s;//相当于Base b = new Sub();//向上转型
        //b的编译类型是Base 运行类型是Sub
        System.out.println(b == s);//true
        System.out.println(b.count);//访问属性看编译类型 ---> 10
        b.display();//从运行类型查找方法---->20
    }
}

class Base{ //父类

    int count = 10;
    public void display(){
        System.out.println(this.count);
    }
}

class Sub extends Base{ //子类

    int count = 20;
    public void display(){
        System.out.println(this.count);
    }
}