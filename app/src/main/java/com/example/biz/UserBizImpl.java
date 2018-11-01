package com.example.biz;

import com.example.bean.User;

public class UserBizImpl implements IUserBiz {

    @Override
    public void login(final String username, final String password, final OnLoginListener onLoginListener) {

        new Thread(){
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);

                    if("qq".equals(username) && "123456".equals(password)){
                        User user = new User();
                        user.setUsername(username);
                        user.setPassword(password);

                        onLoginListener.loginSuccess(user);
                    }

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();
    }

}
