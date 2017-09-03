package com.example.administrator.hotelui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class DeveloperActivity extends AppCompatActivity implements View.OnClickListener
{

    private Button main;
    private Button register;
    private Button verify;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_developer);
        initView();
        addListener();
    }

    private void initView()
    {
        main = (Button) findViewById(R.id.main);
        register = (Button) findViewById(R.id.register);
        verify = (Button) findViewById(R.id.verify);
    }

    private void addListener()
    {
        main.setOnClickListener(this);
        register.setOnClickListener(this);
        verify.setOnClickListener(this);
    }

    @Override
    public void onClick(View view)
    {
        Intent intent = null;
        switch (view.getId())
        {
            case R.id.main:
                intent = new Intent(this, MainActivity.class);
                break;
            case R.id.register:
                intent = new Intent(this, RegisterActivity.class);
                break;
            case R.id.verify:
                intent = new Intent(this, VerifyRealNameActivity.class);
                break;
        }
        startActivity(intent);
    }
}
