package com.ly.mvc_sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.ly.mvc_sample.callback.Callback1;
import com.ly.mvc_sample.model.MainModel;

public class MainActivity extends AppCompatActivity {

    private MainModel mMainModel;
    Button mButton;
    EditText mTextView;
    TextView mTvAge, mTvName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mMainModel = new MainModel();
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getUserInfo(mTextView.getText().toString());
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mMainModel.onDestroy();
    }

    /**
     * 获取用户信息
     */
    private void getUserInfo(String uid) {
        mMainModel.getUserInfo(uid, new Callback1<MainModel.UserInfo>() {
            @Override
            public void onCallback(MainModel.UserInfo userInfo) {
                setDataToView(userInfo);
            }
        });
    }

    /**
     * 设置用户信息到相应的View
     */
    private void setDataToView(MainModel.UserInfo userInfo) {
        mTvAge.setText(userInfo.getAge());
        mTvName.setText(userInfo.getName());
    }
}
