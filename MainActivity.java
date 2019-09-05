package com.example.dheo.mvplisthero.Utama;

import android.os.Bundle;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;


import com.example.dheo.mvplisthero.HerosData;
import com.example.dheo.mvplisthero.Model.Hero;
import com.example.dheo.mvplisthero.R;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Hero> list = new ArrayList<>();
    private String title = "Mode List";
    //TODO ini butter knifenya
    @BindView(R.id.rv_heroes)
    RecyclerView rvHeroes;
    @BindView(R.id.activity_main)
    RelativeLayout activityMain;

    //TODO 1.1 Deklarasi Kelas ListHeroAdapter
    ListHeroAdapter adapter;

    //TODO 1.0 Buat butter knife
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        //TODO 1.2 Inisialisasi Kelas ListHeroAdapter


        list.addAll(HerosData.getListData());





    }

}
