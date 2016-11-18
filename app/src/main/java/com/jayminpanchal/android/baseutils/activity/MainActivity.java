package com.jayminpanchal.android.baseutils.activity;

import android.os.Bundle;

import com.jayminpanchal.android.baseutils.R;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public int getToolbarId() {
        return 0;
    }
}
