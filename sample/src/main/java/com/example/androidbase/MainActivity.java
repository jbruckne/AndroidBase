package com.example.androidbase;

import android.os.Bundle;

import com.joebruckner.androidbase.ActivityLifecycleLogger;
import com.joebruckner.androidbase.BaseActivity;

import org.jetbrains.annotations.Nullable;

public class MainActivity extends BaseActivity {

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addListener(new ActivityLifecycleLogger());
    }
}
