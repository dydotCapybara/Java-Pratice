package com.hspedu.pkg;

//建议:需要需要使用哪个类，就导入哪个类即可
//import java.util.Scanner;//只会引入java.util 包下的 Scanner
//import java.util.*;//只会引入java.util 包下的 所有类都引入


import java.util.Arrays;

public class Import01 {
    public static void main(String[] args) {
        //使用系统提供 Arrays 完成数组排序
        int[] arr = {-1, 20, 2, 13, 3};


        Arrays.sort(arr);

        //输出排序结果
        System.out.println(Arrays.toString(arr));
    }
}
