package com.hspedu.extend_.improve;

import com.hspedu.extend_.Graduate;
import com.hspedu.extend_.Pupil;

public class Extends01 {
    public static void main(String[] args) {
        com.hspedu.extend_.Pupil pupil = new Pupil();
        pupil.name = "小王";
        pupil.age = 11;
        pupil.testing();
        pupil.setScore(61);
        pupil.showInfo();

        System.out.println("===============================");

        com.hspedu.extend_.Graduate graduate = new Graduate();
        graduate.name = "金角大王";
        graduate.age = 23;
        graduate.testing();
        graduate.setScore(81);
        graduate.showInfo();
    }
}
