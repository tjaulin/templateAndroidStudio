package com.example.applicationserie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ajoutSerie extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajout_serie);
    }

    public void AjouterOnClick(View view) {
        EditText titre = findViewById(R.id.txtTitre);
        EditText resume = findViewById(R.id.editTextResume);
        EditText premiereDiffusion = findViewById(R.id.editTextDate);
        EditText duree = findViewById(R.id.editTextTime);
        EditText image = findViewById(R.id.txtImage);

        Serie serie = new Serie(0,
                titre.getText().toString(),
                resume.getText().toString(),
                duree.getText().toString(),
                premiereDiffusion.getText().toString(),
                image.getText().toString());
        SerieSqlHelper listeSerieSql = new SerieSqlHelper(ajoutSerie.this);
        listeSerieSql.addSerie(serie);

        startActivity(new Intent(ajoutSerie.this,MainActivity.class));
    }
}