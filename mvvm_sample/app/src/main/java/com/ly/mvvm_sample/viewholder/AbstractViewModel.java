package com.ly.mvvm_sample.viewholder;

import android.databinding.ViewDataBinding;

/**
 * Create by LiuYang on 2018/7/5 15:48
 */
public abstract class AbstractViewModel<T extends ViewDataBinding> implements BaseViewModel {
    public T mViewDataBinding;

    public AbstractViewModel(T viewDataBinding) {
        mViewDataBinding = viewDataBinding;
    }

    @Override
    public void onDestroy() {
        mViewDataBinding.unbind();
    }
}
