package com.ly.mvvm_sample.viewholder;

import com.ly.mvvm_sample.callback.Callback1;
import com.ly.mvvm_sample.databinding.ActivityMainMvvmBinding;
import com.ly.mvvm_sample.model.MainModel;

/**
 * Create by LiuYang on 2018/7/5 15:50
 */
public class MainViewModel extends AbstractViewModel<ActivityMainMvvmBinding> {
    public MainViewModel(ActivityMainMvvmBinding viewDataBinding) {
        super(viewDataBinding);
    }

    public void getUserInfo(String uid, Callback1<MainModel.UserInfo> callback) {
        //从网络或缓存获取信息
        MainModel.UserInfo userInfo = new MainModel.UserInfo();
        userInfo.setName("tom");
        userInfo.setAge(18);
        callback.onCallback(userInfo);
    }
}
