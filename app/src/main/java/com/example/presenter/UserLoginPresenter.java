package com.example.presenter;

import android.os.Handler;

import com.example.bean.User;
import com.example.biz.IUserBiz;
import com.example.biz.OnLoginListener;
import com.example.biz.UserBizImpl;
import com.example.mvp.MainActivity;
import com.example.view.IUserLoginView;



public class UserLoginPresenter {

    private IUserBiz userBiz;
    private IUserLoginView userLoginView;

    Handler handler = new Handler();

    public  UserLoginPresenter(IUserLoginView userLoginView){
        this.userLoginView = userLoginView;
        this.userBiz = new UserBizImpl();
    }

    public void login(){

        userBiz.login(userLoginView.getUserName(), userLoginView.getPassword(), new OnLoginListener() {
            @Override
            public void loginSuccess(final User user) {

                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        userLoginView.login(user);
                    }
                });
            }

            @Override
            public void loginFailed() {

            }
        });
    }

}
