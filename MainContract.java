package com.example.dheo.mvplisthero.Utama;


import com.example.dheo.mvplisthero.Base.BaseView;
import com.example.dheo.mvplisthero.Model.Hero;

//TODO Membuat Interface
    public interface MainContract {

        interface ListHeroAdapter {

        }

    interface MainView extends BaseView {
        void success(Hero hero);
        void error();

    }


}
