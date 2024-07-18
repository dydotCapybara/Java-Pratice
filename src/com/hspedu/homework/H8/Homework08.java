package com.hspedu.homework.H8;

public class Homework08 {
    public static void main(String[] args) {
        // 使用 BankAccount 引用来测试 CheckingAccount
        BankAccount account1 = new CheckingAccount(1000);
        System.out.println("CheckingAccount 初始余额: " + account1.getBalance());
        account1.deposit(500);
        System.out.println("存入 500 后余额: " + account1.getBalance());
        account1.withdraw(200);
        System.out.println("取出 200 后余额: " + account1.getBalance());

        // 使用 BankAccount 引用来测试 SavingsAccount
        BankAccount account2 = new SavingsAccount(2000);
        System.out.println("SavingsAccount 初始余额: " + account2.getBalance());
        account2.deposit(1000);
        System.out.println("存入 1000 后余额: " + account2.getBalance());
        account2.withdraw(500);
        System.out.println("取出 500 后余额: " + account2.getBalance());
        account2.deposit(300);
        System.out.println("存入 300 后余额: " + account2.getBalance());
        account2.withdraw(100);
        System.out.println("取出 100 后余额: " + account2.getBalance());

        // 向下转型以调用 SavingsAccount 特有的方法
        if (account2 instanceof SavingsAccount) {
            SavingsAccount savingsAccount = (SavingsAccount) account2;
            savingsAccount.earnMonthlyInterest();
            System.out.println("计算月利息后余额: " + savingsAccount.getBalance());
        }

        for (int i = 0;i <= 3;i++){
            account2.deposit(1000);
            System.out.println("下一月再存入 1000 后余额: " + account2.getBalance());
        }

    }
}
