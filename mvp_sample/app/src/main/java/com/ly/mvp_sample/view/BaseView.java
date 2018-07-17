package com.ly.mvp_sample.view;

import com.ly.mvp_sample.presenter.BasePresenter;

/**
 * Create by LiuYang on 2018/7/5 13:32
 */
public interface BaseView<P extends BasePresenter> {
    void setPresenter(P presenter);
}
