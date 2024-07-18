package com.hspedu.debug_;

import java.util.Arrays;

//演示执行到下一个断点,同时支持动态下断点
public class Debug04 {
    public static void main(String[] args) {
        int [] arr = {1, -1, 10, -20, 100};
        Arrays.sort(arr);//alt + shift + F7
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println("hello100");
        System.out.println("hello200");
        System.out.println("hello300");
        System.out.println("hello400");
        System.out.println("hello500");
        System.out.println("hello600");
        System.out.println("hello700");
    }
}
