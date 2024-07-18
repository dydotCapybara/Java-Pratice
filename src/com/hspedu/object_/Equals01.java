package com.hspedu.object_;

public class Equals01 {
    public static void main(String[] args) {
        A a = new A();
        A b = a;
        A c = b;
        System.out.println(a == c);//true
        System.out.println(b == c);//true

        B bObj = a;//向上转型
        System.out.println(bObj == c);//true

        String ss1 = "hello";
        String ss2 = "hello";
        System.out.println(ss1 == ss2); // true，因为s1和s2引用的是同一个字符串池中的对象
        String s1 = new String("hello");
        String s2 = new String("hello");
        System.out.println(s1 == s2); // false，因为s1和s2是不同的对象，内存地址不同
        System.out.println(s1.equals(s2)); // true，因为String类重写了equals()方法，比较的是内容


        /*
        //String类的equals方法
        //把Object的equals方法重新写了
         public boolean equals(Object anObject) {
        if (this == anObject) {//如果是同一个对象
            return true;
        }
        if (anObject instanceof String) {//判断类型
            String anotherString = (String)anObject;//向下转型
            int n = value.length;//把长度算出来
            if (n == anotherString.value.length) {//如果长度相同
                char v1[] = value;
                char v2[] = anotherString.value;
                int i = 0;
                while (n-- != 0) {//在过程中一个一个比较字符
                    if (v1[i] != v2[i])
                        return false;
                    i++;
                }
                return true;
            }
        }
        return false;
    }
         */

        "hello".equals("abc");

        //Object 的 equals 方法默认就是比较对象地址是否相同
//        public boolean equals(Object obj) {
//            return (this == obj);
//        }

//        Integer
        /*从源码可以看出 Integer 也重写了 Object的equals方法
        //变成判断两个值是否相等
    public boolean equals(Object obj) {
        if (obj instanceof Integer) {
            return value == ((Integer)obj).intValue();
        }
        return false;
    }
    这里的value是一个基本数据类型int的值。
    ((Integer)obj).intValue()将传入的Integer对象转换为基本数据类型int。
    ==运算符用于比较这两个int类型的值是否相等。
         */
        Integer integer1 = new Integer(1000);
        Integer integer2 = new Integer(1000);
        System.out.println(integer1 == integer2);//false
        System.out.println(integer1.equals(integer2));//true

        String str1 = new String("duyuyang");
        String str2 = new String("duyuyang");
        System.out.println(str1 == str2);//false
        System.out.println(str1.equals(str2));//true
    }
}

class B {//父类

}


class A extends B {//子类

}