package com.hspedu.encap;

public class AccountTest {
    public static void main(String[] args) {
        Account account1 = new Account("duyuyang",15,"123");
        System.out.println(account1.getInfo());

        Account account2 = new Account("jack",3333,"923923");
        System.out.println(account2.getInfo());

        Account account3 = new Account();
        account3.setName("whm");
        System.out.println(account3.getInfo());


    }
}
