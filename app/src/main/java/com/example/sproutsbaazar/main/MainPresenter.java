package com.example.sproutsbaazar.main;

public class MainPresenter implements MainContract.IPresenter{
    MainContract.IView mView;

    public MainPresenter(MainContract.IView mView) {
        this.mView = mView;
    }


}
