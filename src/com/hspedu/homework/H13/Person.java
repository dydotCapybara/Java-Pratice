package com.hspedu.homework.H13;

/**
 * 抽取一个父类Person类，将共用属性和方法放到Person类。
 */
public class Person {
    private String name;
    private char sex;
    private int age;

    public Person(String name, int age, char sex) {
        setName(name);
        setAge(age);
        setSex(sex);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Name cannot be null or empty");
            this.name = "Trump";
        }
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        if (sex == '男' || sex == '女') {
            this.sex = sex;
        } else {
            System.out.println(getName() + "Sex must be '男' or '女'");
            this.sex = '男';
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0 && age < 150) {
            this.age = age;
        } else {
            System.out.println(getName() + "Age must be between 1 and 149");
            this.age = 18;
        }
    }

    public String play() {
        return getName() + "爱玩";
    }

    public static void SortByAge(Person[] persons) {
        int length = persons.length;
        for (int i = 0; i < length - 1; i++) {
            for(int j = 0; j < length - i - 1; j++) {
                if (persons[j].getAge() < persons[j + 1].getAge()) {
                    Person temp = persons[j];
                    persons[j] = persons[j + 1];
                    persons[j + 1] = temp;
                }
            }
        }
    }

    public void printInfo(){

        System.out.println("姓名：" + getName());
        System.out.println("年龄：" + getAge());
        System.out.println("性别：" + getSex());

    }

}
