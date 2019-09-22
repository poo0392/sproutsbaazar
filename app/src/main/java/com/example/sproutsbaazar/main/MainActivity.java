package com.example.sproutsbaazar.main;

import android.os.Bundle;

import com.example.sproutsbaazar.R;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements MainContract.IView {

    MainPresenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainPresenter=new MainPresenter(this);
    }
}
