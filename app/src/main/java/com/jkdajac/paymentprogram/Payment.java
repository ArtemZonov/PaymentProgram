package com.jkdajac.paymentprogram;

import android.util.Log;

import java.util.Random;

public class Payment implements  Runnable {

    private  Account account;
    int money;

    public Payment(Account account, int money) {
        this.account = account;
        this.money = money;
        new Thread(this).start();
    }

    @Override
    public void run() {
       synchronized (account){
           Log.d("MyLOG", "New payment");
           int oldbalance = account.getBalance();
           try{
               account.setBalance(oldbalance + money);
               Thread.sleep(new Random().nextInt(5000));
           } catch(InterruptedException e){
               e.printStackTrace();
           }
           Log.d("MyLOG", "Balance : " + oldbalance + " + " + money + " = " + account.getBalance());
       }
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
