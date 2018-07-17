package com.ly.mvvm_sample.contract;

import com.ly.mvvm_sample.callback.Callback1;
import com.ly.mvvm_sample.http.HttpUtil;
import com.ly.mvvm_sample.model.MainModel;
import com.ly.mvvm_sample.presenter.BasePresenter;
import com.ly.mvvm_sample.view.BaseView;

/**
 * Create by LiuYang on 2018/7/5 13:34
 */
public class MainContract {
    public static class Presenter implements BasePresenter {
        public void getUserInfo(String uid, Callback1<MainModel.UserInfo> callback) {
            MainModel.UserInfo userInfo = new HttpUtil<MainModel.UserInfo>().get(uid);
            callback.onCallback(userInfo);
        }

        @Override
        public void onDestroy() {

        }
    }

    public interface View extends BaseView<Presenter> {
        void setDataToView(MainModel.UserInfo userInfo);
    }
}
