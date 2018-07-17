package com.ly.mvp_sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.ly.mvp_sample.callback.Callback1;
import com.ly.mvp_sample.contract.MainContract;
import com.ly.mvp_sample.model.MainModel;

public class MainActivity extends AppCompatActivity implements MainContract.View {

    private MainContract.Presenter mPresenter;
    Button mButton;
    EditText mTextView;
    TextView mTvAge, mTvName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setPresenter(new MainContract.Presenter());

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPresenter.getUserInfo(mTextView.getText().toString(), new Callback1<MainModel.UserInfo>() {
                    @Override
                    public void onCallback(MainModel.UserInfo userInfo) {
                        setDataToView(userInfo);
                    }
                });
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mPresenter.onDestroy();
    }

    @Override
    public void setDataToView(MainModel.UserInfo userInfo) {
        mTvAge.setText(userInfo.getAge());
        mTvName.setText(userInfo.getName());
    }

    @Override
    public void setPresenter(MainContract.Presenter presenter) {
        mPresenter = presenter;
    }
}
