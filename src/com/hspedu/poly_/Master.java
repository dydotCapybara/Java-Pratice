package com.hspedu.poly_;

public class Master {

    private String name;

    public Master(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        name = name;
    }

    //完成主人给小狗 喂食 骨头
//    public void feed(Dog dog, Bone bone){
//        System.out.println("主人 " + name + " 给 " + dog.getName() + " 吃 " + bone.getName());
//    }
//    //完成主人给小猫 喂食 黄花鱼
//    public void feed(Cat cat, Fish fish){
//        System.out.println("主人 " + name + " 给 " + cat.getName() + " 吃 " + cat.getName());
//    }
    //使用多态机制可以统一管理主人喂食的问题
    public void feed(Animal animal, Food food) {
        System.out.println("主人 " + name + " 给 " + animal.getName() + " 吃 " + food.getName());
    }
}
