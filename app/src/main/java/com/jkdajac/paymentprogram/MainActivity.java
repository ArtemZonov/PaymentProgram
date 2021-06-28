package com.jkdajac.paymentprogram;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Account account = new Account(1000, "Peter");

        try {
            new Payment(account, 1000);
            Thread.sleep(1000);
            new Payment(account, 100);
            Thread.sleep(1000);
            new Payment(account, 300);
            Thread.sleep(1000);
            new Payment(account, 400);
            Thread.sleep(1000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}