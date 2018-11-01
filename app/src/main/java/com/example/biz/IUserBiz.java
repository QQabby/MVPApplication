package com.example.biz;

public interface IUserBiz {

    public void login(String username,String password,OnLoginListener onLoginListener);

}
