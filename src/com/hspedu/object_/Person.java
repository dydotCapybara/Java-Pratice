package com.hspedu.object_;

public class Person {//extends Object

    private String name;
    private int age;
    private char gender;

    //Object 的 equals 方法默认就是比较对象地址是否相同
//        public boolean equals(Object obj) {
//            return (this == obj);
//        }
    public boolean equals(Object obj){
        if(this == obj){//如果判断的两个对象是同一个对象，则直接返回true
            return true;
        }
        //类型判断
        if(obj instanceof Person){//是person才比较
            Person p = (Person)obj;//向下转型-->得到obj的各个属性
            return name.equals(p.name) && age == p.age && gender == p.gender;
        }
        //如果不是Person直接false
        return false;
    }




    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
