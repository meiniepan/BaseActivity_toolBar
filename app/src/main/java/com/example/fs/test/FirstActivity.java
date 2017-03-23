package com.example.fs.test;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * Created by Solang on 2017/3/21.
 */

public class FirstActivity extends AppCompatActivity implements View.OnClickListener {


    private Toolbar mToolBar;
    /**
     * sdff
     */
    private Button mBt;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ac_first);
        initView();
        findViewById(R.id.bt).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FirstActivity.this, MainActivity.class));
            }
        });
        mToolBar.setTitle(R.string.button);
        mToolBar.setSubtitle(R.string.button);
        mToolBar.setNavigationIcon(R.mipmap.ic_launcher);
        mToolBar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e("TAG", "setNavigationOnclickListener");
            }
        });

        //rxjava 防止按钮重复点击
        


    }

    private void initView() {
        mToolBar = (Toolbar) findViewById(R.id.toolBar);
        mBt = (Button) findViewById(R.id.bt);
        mBt.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt:
                break;
        }
    }


//    @Override
//    public int getLayoutId() {
//        return R.layout.ac_first;
//    }
}
