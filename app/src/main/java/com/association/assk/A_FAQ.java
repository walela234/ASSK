package com.association.assk;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.assk.R;

public class A_FAQ extends AppCompatActivity {
    private CardView cari,cardi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_afaq);
        cari=findViewById(R.id.cari);
        cardi=findViewById(R.id.cardi);
        cari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),About.class);
                startActivity(intent);

            }
        });

        cardi.setOnClickListener(v -> {
            Intent intent=new Intent(getApplicationContext(),questions.class);
            startActivity(intent);
        });
    }
}