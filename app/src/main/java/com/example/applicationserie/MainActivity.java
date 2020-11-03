package com.example.applicationserie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void listeOnClick(View view) {
        startActivity(new Intent(MainActivity.this,AffListSerie.class));
    }

    public void ajoutOnClick(View view) {
        startActivity(new Intent(MainActivity.this,ajoutSerie.class));
    }
}