package com.example.biz;

import com.example.bean.User;

public interface OnLoginListener {

    public void loginSuccess(User user);
    public void loginFailed();
}
