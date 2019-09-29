package com.example.sproutsbaazar.register;

public class RegisterPresenter implements RegisterContract.IPresenter{
    RegisterContract.IView mView;

    public RegisterPresenter(RegisterContract.IView mView) {
        this.mView = mView;
    }
}
