package com.ly.mvp_sample.model;

import com.ly.mvp_sample.callback.Callback1;
import com.ly.mvp_sample.http.HttpUtil;

/**
 * Create by LiuYang on 2018/7/5 11:05
 */
public class MainModel {
    public class UserInfo {
        private int age;
        private String name;

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
