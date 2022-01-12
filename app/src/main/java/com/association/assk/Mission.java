package com.association.assk;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;

import com.example.assk.R;

public class Mission extends AppCompatActivity {
    private CardView mission;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mission);
        mission=findViewById(R.id.mission);//cardview mission
    }
}