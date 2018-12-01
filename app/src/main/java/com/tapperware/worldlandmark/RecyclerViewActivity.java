package com.tapperware.worldlandmark;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Adapter;

import com.bumptech.glide.Glide;

import butterknife.BindView;
import butterknife.ButterKnife;


public class RecyclerViewActivity extends AppCompatActivity {


    @BindView(R.id.my_recycler_view)
    RecyclerView myRecycleView;

    String[] namaLandmark, detailLandmark;
    int[] gambarLandmark;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        ButterKnife.bind(this);

        namaLandmark = getResources().getStringArray(R.array.landmark_name);
        detailLandmark = getResources().getStringArray(R.array.landmark_detail);
        gambarLandmark = new int[]{R.drawable.monas,R.drawable.pissa,R.drawable.sphinx,R.drawable.tajmahal,R.drawable.angkor,R.drawable.colosseum,R.drawable.eiffel,R.drawable.greatwall,R.drawable.liberty};

        AdapterLandmark adapter=  new AdapterLandmark(this, gambarLandmark, namaLandmark, detailLandmark);

        myRecycleView.setHasFixedSize(true);
        myRecycleView.setLayoutManager(new LinearLayoutManager(this));
        myRecycleView.setAdapter(adapter);



    }

}
