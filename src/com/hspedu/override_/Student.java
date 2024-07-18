package com.hspedu.override_;

public class Student extends Person{

    private long id;
    private double score;

    public Student(String name, int age, long id, double score) {
        super(name, age);//这里调用父类构造器
        this.id = id;
        this.score = score;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String say() {
        return super.say() + " My id: " + id + ", score: " + score;
    }
}
