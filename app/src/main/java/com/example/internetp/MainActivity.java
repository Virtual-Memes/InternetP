package com.example.internetp;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //设置隐藏标题栏
        ActionBar actionBar=getSupportActionBar();
        actionBar.hide();
        //设置隐藏状态栏
        Window window=getWindow();
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //加载界面
        setContentView(R.layout.activity_main);
    }
}
