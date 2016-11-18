package com.jayminpanchal.android.baseutils.activity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.jayminpanchal.android.baseutils.R;

/**
 * Created by Jaymin on 11/18/2016.
 */
public abstract class BaseActivity extends AppCompatActivity {

    private Toolbar toolbar;

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(getLayoutId());

        if (getToolbarId() != 0) {
            toolbar = (Toolbar) findViewById(getToolbarId());
            setSupportActionBar(toolbar);
        }
    }

    public Toolbar getToolbar() {
        if (toolbar == null)
            throw new NullPointerException("Toolbar must be initialized");

        return toolbar;
    }

    protected void showToolbar(boolean isShow) {
        if (isShow) {
            getToolbar().setVisibility(View.VISIBLE);
        } else {
            getToolbar().setVisibility(View.GONE);
        }
    }

    @Override
    public void setTitle(CharSequence title) {
        ActionBar actionBar = getSupportActionBar();
        if (actionBar == null) {
            super.setTitle(title);
        } else {
            actionBar.setTitle(title);
        }
    }

    @Override
    public void setTitle(int titleId) {
        ActionBar actionBar = getSupportActionBar();
        if (actionBar == null) {
            super.setTitle(titleId);
        } else {
            actionBar.setTitle(titleId);
        }
    }

    public void setBackIcon(boolean isSetBackIcon) {
        if (isSetBackIcon) {
            getToolbar().setNavigationIcon(R.drawable.ic_action_nav_back);
        } else {
            getToolbar().setNavigationIcon(null);
        }
    }

    public void setBackIcon(boolean isSetBackIcon, int iconId) {
        if (isSetBackIcon) {
            getToolbar().setNavigationIcon(iconId);
        } else {
            getToolbar().setNavigationIcon(null);
        }
    }

    public abstract int getLayoutId();

    public abstract int getToolbarId();
}
