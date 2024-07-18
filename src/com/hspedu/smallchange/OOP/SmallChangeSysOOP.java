package com.hspedu.smallchange.OOP;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSysOOP {
    Scanner scanner = new Scanner(System.in);
    String key = "";
    boolean loop = true;

    // 完成零钱通明细
    String details = "------------------------------零钱通明细------------------------------";
    // 完成收益入账
    double money = 0; // 要变动的金额数目
    double balance = 0; // 余额
    Date date = null; // 表示日期
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); // 日期格式化

    public void mainMenu() {
        do {
            System.out.println("\n==============================零钱通菜单(OOP)==============================");
            System.out.println("\t\t\t1.零钱通明细");
            System.out.println("\t\t\t2.收益入账");
            System.out.println("\t\t\t3.消费");
            System.out.println("\t\t\t4.退     出");

            System.out.print("请选择(1-4):");
            key = scanner.nextLine();
            // 使用switch分支
            switch (key) {
                case "1":
                    this.detail();
                    break;
                case "2":
                    this.income();
                    break;
                case "3":
                    this.pay();
                    break;
                case "4":
                    this.exit();
                    break;
                default:
                    System.out.println("选择有误,重新选择.");
                    break;
            }
        } while (loop);
    }

    public void detail() {
        System.out.println(details);
    }

    public void income() {
        System.out.print("收益入账金额:");
        money = scanner.nextDouble();
        // 添加这一行以消费掉换行符
        scanner.nextLine();
        if (money > 0) {
            balance += money;
            date = new Date(); // 获取当前日期
            details += "\n收益入账\t+" + String.format("%.2f", money) + "元\t" + sdf.format(date) + "\t" + "余额:" + String.format("%.2f", balance) + "元";
        } else {
            System.out.println("收益数额必须大于0元,您的输入有误,请重新尝试!");
        }
    }

    public void pay() {
        System.out.print("进行消费,您要取出的数额为:");
        money = scanner.nextDouble();
        scanner.nextLine();
        if (money > 0 && money <= balance) {
            System.out.print("请输入消费商品名称:");
            String productName = scanner.nextLine();
            balance -= money;
            date = new Date();
            details += "\n" + productName + "\t-" + String.format("%.2f", money) + "元\t" + sdf.format(date) + "\t" + "余额:" + String.format("%.2f", balance) + "元";
        } else if (money <= 0) {
            System.out.println("消费数额必须大于0且小于等于余额,您的输入有误,请重新尝试！");
        } else {
            System.out.println("抱歉！您的余额不足！请充值！");
        }
    }

    public void exit() {
        boolean tag = true;
        do {
            System.out.print("你确定要退出吗？(y/n): ");
            String confirm = scanner.nextLine();
            if (confirm.equals("y")) {
                loop = false;
                tag = false;
            } else if (confirm.equals("n")) {
                break;
            } else {
                System.out.println("只能输入y/n , 您的输入有误");
            }
        } while (tag);
    }

    public static void main(String[] args) {
        new SmallChangeSysOOP().mainMenu();
    }
}
