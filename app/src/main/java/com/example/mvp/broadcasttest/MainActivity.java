package com.example.mvp.broadcasttest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.mvp.broadcasttest.ForceOffLine.BaseActivity;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void clickOffline(View view) {
        Intent intent = new Intent("com.example.broadcastbestpractice.FORCE_OFFLINE");
        sendBroadcast(intent);
    }
}
