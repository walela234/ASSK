package com.association.assk;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;

import com.example.assk.R;

public class Vision extends AppCompatActivity {
    private CardView vision;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vision);
        vision=findViewById(R.id.vision);//the vision
    }
}