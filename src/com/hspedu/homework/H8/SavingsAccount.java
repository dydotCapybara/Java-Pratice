package com.hspedu.homework.H8;

public class SavingsAccount extends BankAccount {

    private static final int FREE_TRANSACTIONS = 3;//免手续费交易的额度
    private static final double INTEREST_RATE = 0.05;//利率
    private int transactionCount = 0;//实际交易次数

    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    public void deposit(double amount) {
        transactionCount++;
        if (transactionCount <= FREE_TRANSACTIONS) {
            super.deposit(amount);
        } else {
            super.deposit(amount - 1);
        }
    }

    public void withdraw(double amount) {
        transactionCount++;
        if (transactionCount <= FREE_TRANSACTIONS) {
            super.withdraw(amount);
        } else {
            super.withdraw(amount + 1);
        }
    }

    public void TransactionCount_0() {
        transactionCount = 0; // 重置交易计数
    }
    public void earnMonthlyInterest() {
//        double interest = getBalance() * INTEREST_RATE;
        TransactionCount_0();//这一次重置是为了加利息的操作扣手续费给覆盖
        deposit(getBalance() * INTEREST_RATE);
        TransactionCount_0();//这一次是为了下一个月的重置次数还是3次
    }

}
