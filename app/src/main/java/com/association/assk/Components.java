package com.association.assk;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.assk.R;

public class Components extends AppCompatActivity  {
    private CardView card1,card2,card3,card4,card5,cardacc,card6,cardev,cardpp;
    private GridLayout grid;
    private TextView exec,reg,about,isu,books;
    private RelativeLayout relative;
    private ImageView logo,exec1,reg1,isu1,about1,books1,logoo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_components);
        //TODO:insertion of an animation somewhere
        //TODO:was testing the vaidity of the todo placing
        Insta();//method for instatiating

        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Executive_teams.class);
                startActivity(intent);

            }
        });

        card5.setOnClickListener(v -> {
            Intent intent=new Intent(getApplicationContext(),A_FAQ.class);
            startActivity(intent);
        });
        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),ISUweb.class);
                startActivity(intent);

            }
        });

        //onclicking card two
        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Courseshow.class));
            }
        });
        cardev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Coming soon",Toast.LENGTH_SHORT).show();
            }
        });
        cardpp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Coming soon",Toast.LENGTH_SHORT).show();
            }
        });
    }


 private void Insta(){
        card1=findViewById(R.id.card1);
        cardev=findViewById(R.id.cardev);//card on events
        cardacc=findViewById(R.id.cardacc);//academic carlendr
        card2=findViewById(R.id.card2);
        cardpp=findViewById(R.id.cardpp);//card for past papers
        card4=findViewById(R.id.card4);
        card5=findViewById(R.id.card5);
        grid=findViewById(R.id.grid);//instatiated the grid layout
        relative=findViewById(R.id.relative);//instatiated the relative vie 1
        exec=findViewById(R.id.executive);//exec text
        reg=findViewById(R.id.register_text);//reg text
        isu=findViewById(R.id.isu);//text for isu home
        exec1=findViewById(R.id.exec);//image for the exec
        logoo=findViewById(R.id.faq1);
        reg1=findViewById(R.id.register);//image instatiated
        isu1=findViewById(R.id.isu1);//image for isu



    }


}