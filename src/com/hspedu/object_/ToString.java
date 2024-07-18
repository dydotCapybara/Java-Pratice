package com.hspedu.object_;

public class ToString {
    public static void main(String[] args) {
        /*
         Object的toString 的 源码
         (1)getClass().getName() 类的全类名(包名 +　类名)
         (2)Integer.toHexString(hashCode())将对象的hashCode值转成16进制字符串
         public String toString() {
            return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
         */
        Monster monster = new Monster("小妖怪", "巡山的", 1000);
        System.out.println(monster.toString() + "\thashCode(): " + monster.hashCode());
//        System.out.println(monster);//默认调用toString
    }
}


class Monster{

    private String name;
    private String job;
    private double salary;

    public Monster(String name, String job, double salary) {
        this.name = name;
        this.job = job;
        this.salary = salary;
    }
    
    //重写toString方法,输出对象属性

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", salary=" + salary +
                '}';
    }
}