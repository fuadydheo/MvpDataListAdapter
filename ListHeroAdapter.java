package com.example.dheo.mvplisthero.Utama;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dheo.mvplisthero.Base.BasePresenter;
import com.example.dheo.mvplisthero.Model.Hero;

import java.util.ArrayList;

public class ListHeroAdapter extends  RecyclerView.Adapter<ListHeroAdapter.ListViewHolder> implements BasePresenter<MainContract.MainView> {


    MainContract.MainView _view;
    private ArrayList<Hero> listHero;

    public ListHeroAdapter(ArrayList<Hero> list) {
        this.listHero = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    @Override
    public void onAttach(MainContract.MainView view) {

        _view = view;

    }

    public void onDettach() {

        _view = null;
    }



    public class ListViewHolder extends RecyclerView.ViewHolder {

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
