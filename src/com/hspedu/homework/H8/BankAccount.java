package com.hspedu.homework.H8;

/**
 * 在上面类的基础上扩展新类 CheckingAccount 对每次存款和取款都收取 1 美元的手续费。
 * 扩展前一个练习的 BankAccount 类，
 * 新类 SavingsAccount 每个月都有利息产生 (earnMonthlyInterest 方法被调用)，
 * 并且有每月三次免手续费的存款或取款。在 earnMonthlyInterest 方法中重置交易计数。
 */
class BankAccount {
    // 账户余额
    private double balance;

    // 构造方法，初始化账户余额
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // 存款方法，增加账户余额
    // amount就是每次交易的数额   deposit：存款
    public void deposit(double amount) {
        balance += amount;
    }

    // 取款方法，减少账户余额      withdraw：取款
    public void withdraw(double amount) {
        balance -= amount;
    }

    // 获取账户余额
    public double getBalance() {
        return balance;
    }

    // 设置账户余额
    public void setBalance(double balance) {
        this.balance = balance;
    }
}


