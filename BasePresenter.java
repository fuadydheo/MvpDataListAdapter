package com.example.dheo.mvplisthero.Base;

public interface BasePresenter<V extends BaseView> {

    void onAttach(V view);
    void onDettach();
}
