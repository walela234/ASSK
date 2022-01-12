package com.association.assk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import com.example.assk.R;


public class MainActivity extends AppCompatActivity {
    private TextView assk_txt,about_txt;
    Animation top,bottom;
    private static int SPLASH_SCREEN=5000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        instatiate();


        top= AnimationUtils.loadAnimation(this,R.anim.top_anim);
        bottom= AnimationUtils.loadAnimation(this,R.anim.bottom_anim);
        //hooks
        assk_txt.setAnimation(top);
        about_txt.setAnimation(bottom);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(MainActivity.this, Components.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_SCREEN);

    }
    public void instatiate(){

        assk_txt=findViewById(R.id.assk_txt);//instatiate of textview in main
        about_txt=findViewById(R.id.about_txt);//instatiation of the saying

    }
}