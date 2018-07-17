package com.ly.mvvm_sample.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.ly.mvvm_sample.BR;

/**
 * Create by LiuYang on 2018/7/5 11:05
 */
public class MainModel {
    public static class UserInfo extends BaseObservable {
        private int age;
        private String name;

        @Bindable
        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
            notifyPropertyChanged(BR.age);
        }

        @Bindable
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
            notifyPropertyChanged(BR.name);
        }
    }
}
