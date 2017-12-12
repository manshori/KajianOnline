package com.mrabid.kajianonline.Fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mrabid.kajianonline.Adapter.ArtikelAdapter;
import com.mrabid.kajianonline.Model.Artikel;
import com.mrabid.kajianonline.R;

import java.util.ArrayList;

public class NewsFragment extends Fragment {

    RecyclerView listArtikel;
    ArrayList<Artikel> artikels = new ArrayList<>();

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        listArtikel = (RecyclerView)getActivity().findViewById(R.id.rcy_list_artikel_news);
        for(int i =0;i<10;i++){
            artikels.add(new Artikel(" ","Video Hot Mia Kgalifah","Saat itu malam pukul 7 dan aku memutuskan untuk menemui idolaku"));
        }
        listArtikel.setHasFixedSize(true);
        listArtikel.setLayoutManager(new LinearLayoutManager(getActivity()));
        listArtikel.setAdapter(new ArtikelAdapter(getActivity(), artikels));


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_news, container, false);
    }
}
