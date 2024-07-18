package com.hspedu.encap;

public class Account {

    private String name;
    private long money;
    private String password;

    //提供两个构造器
    public Account() {

    }

    public Account(String name, long money, String password) {
        this.setName(name);
        this.setMoney(money);
        this.setPassword(password);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() == 2 || name.length() == 3 || name.length() == 4 ) {
            this.name = name;
        }else {
            System.out.println("Invalid name,默认：无名");
            this.name = "无名";
        }
    }

    public long getMoney() {
        return money;
    }

    public void setMoney(long money) {
        if(money >= 20) {
            this.money = money;
        }else {
            System.out.println("Invalid money，默认：20");
            this.money = 20;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(password.length() == 6) {
            this.password = password;
        }else{
            System.out.println("Invalid password，默认：123456");
            this.password = "123456";
        }

    }

    public String getInfo(){
        return "Name: " + getName() + ", Money: " + getMoney() + ", Password: " + getPassword();
    }
}
