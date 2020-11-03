package com.example.applicationserie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class AffListSerie extends AppCompatActivity {

    ArrayList<Serie> lesSeries = new ArrayList<Serie>();
    ListView lstview;
    SerieAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) { super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_aff_list_serie);

    //JSONHelper listSerieJSON = new JSONHelper(MainActivity.this);
    // lesSeries = listSerieJSON.getLesSeries();

        SerieSqlHelper listeSerieSql = new SerieSqlHelper(AffListSerie.this);
            lesSeries = listeSerieSql.getLesSeries();

            lstview = findViewById(R.id.lstView);
            mAdapter = new SerieAdapter(AffListSerie.this, lesSeries);
            lstview.setAdapter(mAdapter);
            lstview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Object listItem = lstview.getItemAtPosition(position);
                    Serie serie=(Serie)listItem;
                    Intent detailSerieActivity = new Intent(AffListSerie.this, DetailSerie.class);
                    detailSerieActivity.putExtra("pos",serie.getId());
                    startActivity(detailSerieActivity);
                }
            });
    }
}