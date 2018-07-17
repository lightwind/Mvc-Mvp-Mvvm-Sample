package com.ly.mvvm_sample;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.ly.mvvm_sample.callback.Callback1;
import com.ly.mvvm_sample.contract.MainContract;
import com.ly.mvvm_sample.databinding.ActivityMainMvvmBinding;
import com.ly.mvvm_sample.model.MainModel;
import com.ly.mvvm_sample.viewholder.MainViewModel;

public class MainActivity extends AppCompatActivity {

    private MainViewModel mMainViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainMvvmBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main_mvvm);
        mMainViewModel = new MainViewModel(binding);
        setDataToView();
    }

    private void setDataToView() {
        mMainViewModel.getUserInfo("uid", new Callback1<MainModel.UserInfo>() {
            @Override
            public void onCallback(MainModel.UserInfo userInfo) {
                mMainViewModel.mViewDataBinding.setUser(userInfo);
            }
        });
    }
}
