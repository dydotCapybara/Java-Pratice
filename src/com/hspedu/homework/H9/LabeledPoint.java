package com.hspedu.homework.H9;

public class LabeledPoint extends Point {
    private String label;

    public LabeledPoint(String label, double x, double y) {
        super(x, y);
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String toString() {
        return "LabeledPoint [label = " + label + ", x = " + getX()
                + ", y = " + getY() + "]";
    }
}
