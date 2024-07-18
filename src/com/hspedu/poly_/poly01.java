package com.hspedu.poly_;


public class poly01 {
    public static void main(String[] args) {

        Master tom = new Master("汤姆");

        Dog dog = new Dog("大黄~");
        Bone bone = new Bone("大棒骨");
        tom.feed(dog, bone);

        Cat cat = new Cat("小花猫~");
        Fish fish = new Fish("黄花鱼");
        tom.feed(cat, fish);

        Pig pig = new Pig("猪猪侠");
        Rice rice = new Rice("泰国大米");
        tom.feed(pig, rice);
    }

}
