package com.hspedu.extend_.exercise;

public class NotePad extends Computer{

    private String color;

    public NotePad(String cpu, String memory, String disk, String color) {
        super(cpu, memory, disk);
        this.color = color;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void printInfo(){
        System.out.println("NotePad信息如下: " );
        System.out.println(getDetails() + "\ncolor: " + getColor());
    }
}
