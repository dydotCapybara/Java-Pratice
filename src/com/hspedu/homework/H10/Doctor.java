package com.hspedu.homework.H10;

/**
 * 编写 Doctor 类 {name, age, job, gender, sal} 相应的 getter() 和 setter() 方法，
 * 5 个参数的构造器，重写父类的 equals() 方法：public boolean equals(Object obj)，
 * 并判断测试类中创建的两个对象是否相等。相等就是判断属性是否相同。
 */
public class Doctor {
    private String name;
    private int age;
    private String job;
    private String gender;
    private double sal;

    public Doctor(String name, int age, String job, String gender, double sal) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.gender = gender;
        this.sal = sal;
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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }
    public boolean equals(Object obj){
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Doctor)) {
            return false;
        }
            Doctor doctor = (Doctor)obj;
            return doctor.getName().equals(this.getName()) &&
                    doctor.getAge() == this.getAge() &&
                    doctor.getJob().equals(this.getJob()) &&
                    doctor.getGender().equals(this.getGender()) &&
                    doctor.getSal() == this.getSal();

    }
}
