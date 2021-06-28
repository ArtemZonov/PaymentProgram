package com.jkdajac.paymentprogram;

public class Account {

    private  int balance;
    private  String name;

    public Account(int balance, String name) {
        this.balance = balance;
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
