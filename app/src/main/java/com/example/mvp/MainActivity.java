package com.example.mvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.bean.User;
import com.example.presenter.UserLoginPresenter;
import com.example.view.IUserLoginView;

public class MainActivity extends AppCompatActivity implements IUserLoginView {

    UserLoginPresenter presenter;
    EditText pwd;
    EditText userName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        userName = findViewById(R.id.user_name);
        pwd = findViewById(R.id.user_pwd);

        presenter = new UserLoginPresenter(this);
    }

    public void startLogin(View view){
        presenter.login();
    }
    @Override
    public String getUserName() {
        return userName.getText().toString();
    }

    @Override
    public String getPassword() {
        return pwd.getText().toString();
    }

    @Override
    public void login(User user) {

        Toast.makeText(this,"username::"+user.getUsername(),Toast.LENGTH_LONG).show();
    }
}
