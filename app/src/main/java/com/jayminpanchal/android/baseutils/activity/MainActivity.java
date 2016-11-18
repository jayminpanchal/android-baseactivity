package com.jayminpanchal.android.baseutils.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.jayminpanchal.android.baseutils.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
