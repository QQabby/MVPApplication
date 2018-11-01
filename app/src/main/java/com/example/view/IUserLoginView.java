package com.example.view;

import com.example.bean.User;

public interface IUserLoginView {

    public String getUserName();
    public String getPassword();
    public void login(User user);
}
