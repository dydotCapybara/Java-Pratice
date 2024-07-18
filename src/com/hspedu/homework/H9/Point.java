package com.hspedu.homework.H9;

/**
 * 设计一个 Point 类，其 x 和 y 坐标可以通过构造器提供。提供一个子类 LabeledPoint，
 * 其构造器接受一个标签值和 x, y 坐标，
 * 比如：new LabeledPoint("Black Thursday", 1929, 230.07)，写出对应的构造器即可。
 */
public class Point {
    private double x;
    private double y;
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
