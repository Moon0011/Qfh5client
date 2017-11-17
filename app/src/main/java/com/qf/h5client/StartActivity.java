package com.qf.h5client;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Administrator on 2017/11/14.
 */

public class StartActivity extends AppCompatActivity {
    protected Handler mHandler = new Handler();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        mHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                StartActivity.this.finish();
                Intent in = new Intent(StartActivity.this, WebActivity.class);
                startActivity(in);
            }
        }, 3000);
    }

}
