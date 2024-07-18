package com.hspedu.homework.H8;


public class CheckingAccount extends BankAccount {
    private static final double FEE = 1.0;//手续费
    public CheckingAccount(double initialBalance) {
        super(initialBalance);
    }
    //存款
    public void deposit(double amount) {
        super.deposit(amount - FEE);
    }
    //取款
    public void withdraw(double amount) {
        super.withdraw(amount + FEE);
    }


}
