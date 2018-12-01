package com.tapperware.worldlandmark;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnExplore(View view) {
        Intent pindah = new Intent(MainActivity.this ,RecyclerViewActivity.class);
        startActivity(pindah);
    }
}
