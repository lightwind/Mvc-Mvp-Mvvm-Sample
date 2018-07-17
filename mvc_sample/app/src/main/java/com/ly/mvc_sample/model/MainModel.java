package com.ly.mvc_sample.model;

import com.ly.mvc_sample.callback.Callback1;
import com.ly.mvc_sample.http.HttpUtil;

/**
 * Create by LiuYang on 2018/7/5 11:05
 */
public class MainModel implements BaseModel {

    public void getUserInfo(String uid, Callback1<UserInfo> callback) {
        UserInfo userInfo = new HttpUtil<UserInfo>().get(uid);
        callback.onCallback(userInfo);
    }

    @Override
    public void onDestroy() {

    }

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
