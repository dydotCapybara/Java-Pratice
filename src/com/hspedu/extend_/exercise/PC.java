package com.hspedu.extend_.exercise;

public class PC extends Computer{

    private String brand;

    public PC(String cpu, String memory, String disk, String brand) {
        super(cpu, memory, disk);
        this.brand = brand;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void printInfo(){
        System.out.println("PC信息如下:");
        System.out.println(getDetails() + "\nBrand: " + getBrand());
    }
}
