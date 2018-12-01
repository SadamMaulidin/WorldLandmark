package com.tapperware.worldlandmark;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class AdapterLandmark extends RecyclerView.Adapter<AdapterLandmark.ViewHolder> {
    //TODO 1 membuat variable
    Context context;
    int[] gambarLandmark;
    String[] namaLandmark,detailLandmark;

    public AdapterLandmark(Context context, int[] gambarLandmark, String[] namaLandmark, String[] detailLandmark) {
        this.context = context;
        this.gambarLandmark = gambarLandmark;
        this.namaLandmark = namaLandmark;
        this.detailLandmark = detailLandmark;
    }

    @NonNull
    @Override
    public AdapterLandmark.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_view, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterLandmark.ViewHolder viewHolder, final int i) {
        viewHolder.txtNama.setText(namaLandmark[i]);
        Glide.with(context).load(gambarLandmark[i]).into(viewHolder.imgLogo);

        //TODO membuat onclicklistener
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah = new Intent(context, Detail.class);
                pindah.putExtra("nc", namaLandmark[i]);
                pindah.putExtra("dc", detailLandmark[i]);
                pindah.putExtra("gc", gambarLandmark[i]);
                context.startActivity(pindah);
            }
        });
    }

    @Override
    public int getItemCount() {
        return gambarLandmark.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imgLogo;
        TextView txtNama;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgLogo = itemView.findViewById(R.id.list);
            txtNama = itemView.findViewById(R.id.ListTitle);
        }
    }
}
