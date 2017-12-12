package com.mrabid.kajianonline.Adapter;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.mrabid.kajianonline.Model.Artikel;
import com.mrabid.kajianonline.R;

import java.util.List;


public class ArtikelAdapter extends RecyclerView.Adapter<ArtikelAdapter.ViewHolder> {
    Context context;
    List<Artikel> listArtikel;

    public ArtikelAdapter(Context context, List<Artikel> listArtikel) {
        this.context = context;
        this.listArtikel = listArtikel;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.list_artikel,null));
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final Artikel p = listArtikel.get(position);
        holder.judul.setText(""+p.getJudul());
        holder.abstrak.setText(""+p.getIsi().substring(0,60)+".....");
        holder.image.setImageResource(R.drawable.img_mia_k_best);

        holder.cvArtikel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "I Love Mia Khalifah", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public int getItemCount() {
        return listArtikel.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView judul,abstrak;
        public ImageView image;
        CardView cvArtikel;

        public ViewHolder(View itemView) {
            super(itemView);
            judul = (TextView)itemView.findViewById(R.id.txt_judulArtikel);
            abstrak = (TextView)itemView.findViewById(R.id.txt_sinposis);
            image = (ImageView) itemView.findViewById(R.id.img_artikel);

            cvArtikel = (CardView)itemView.findViewById(R.id.cv_artikel);
        }
    }
}
