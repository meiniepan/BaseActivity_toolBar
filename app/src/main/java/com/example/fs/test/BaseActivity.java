package com.example.fs.test;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by Solang on 2017/3/21.
 */

public abstract class BaseActivity extends AppCompatActivity{
    TextView mTextView1;
    RelativeLayout mRelativeLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.AppTheme);

        setContentView(R.layout.ac_baselayout);
        initView();
        mRelativeLayout.addView(getLayoutInflater().inflate(getLayoutId(),mRelativeLayout,false));
    }

    private void initView() {
        mTextView1 = (TextView) findViewById(R.id.tvSet);
        mRelativeLayout = (RelativeLayout) findViewById(R.id.rlContent);
    }

    public abstract int getLayoutId();
    @Override
    public void startActivity(Intent intent) {
        super.startActivity(intent);
        overridePendingTransition(R.anim.anim_in_right_left,R.anim.anim_out_right_left);
    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.anim_in_left_right,R.anim.anim_out_left_right);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        overridePendingTransition(R.anim.anim_in_right_left,R.anim.anim_out_right_left);
    }
}
