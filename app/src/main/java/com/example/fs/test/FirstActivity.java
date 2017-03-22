package com.example.fs.test;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

/**
 * Created by Solang on 2017/3/21.
 */

public class FirstActivity  extends AppCompatActivity{
    Toolbar mToolbar;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ac_first);
        initView();
        findViewById(R.id.bt).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FirstActivity.this,MainActivity.class));
            }
        });
        mToolbar.setTitle(R.string.button);
        mToolbar.setSubtitle(R.string.button);
        mToolbar.setNavigationIcon(R.mipmap.ic_launcher);
        mToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e("TAG", "setNavigationOnclickListener");
            }
        });
    }

    private void initView() {
        mToolbar = (Toolbar) findViewById(R.id.toolBar);
    }

//    @Override
//    public int getLayoutId() {
//        return R.layout.ac_first;
//    }
}
