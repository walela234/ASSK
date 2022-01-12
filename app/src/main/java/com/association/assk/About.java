package com.association.assk;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Toast;

import com.example.assk.R;

public class About extends AppCompatActivity {
    private CardView cardviz,cardm,cardtu,cardtan,cardadm,cardacc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_about);
        insta();
        cardviz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Vision.class);
                startActivity(intent);

            }
        });
        cardtu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openpdf("https://firebasestorage.googleapis.com/v0/b/pdown-1b163.appspot.com/o/ASSK%20CONSTITUTION%20FINAL.pdf?alt=media&token=22b28e5a-62d3-41f6-9be2-a30e4dfa6496");

            }
        });
        cardm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Mission.class);
                startActivity(intent);

            }
        });

        cardtan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openpdf("https://firebasestorage.googleapis.com/v0/b/pdown-1b163.appspot.com/o/Engineering%20IT%20introductory%20letter.pdf?alt=media&token=9f0dddd1-ffcd-4b49-b102-2c8c7166ea34");
            }
        });

        cardadm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openpdf("https://firebasestorage.googleapis.com/v0/b/pdown-1b163.appspot.com/o/2021-2022%20DIRECT%20ENTRY%20SCHEME%20ADMISSION%20LIST.pdf?alt=media&token=db894d74-84ce-4ac0-8d53-580738ee8d1b");
            }
        });
        cardacc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openpdf("https://firebasestorage.googleapis.com/v0/b/pdown-1b163.appspot.com/o/Academic%20Calendars%20for%20Continuing%20%20students%20and%20Frssh%20Students.pdf?alt=media&token=4c4015fb-43b3-4c22-a9cb-a97af6185a0e");
            }
        });
    }
    public void openpdf(String URL){

        try {
            Uri uri = Uri.parse(URL);
            Toast.makeText(getBaseContext(), "...just a second ", Toast.LENGTH_LONG).show();
            Intent pdfOpenintent = new Intent(Intent.ACTION_VIEW,uri);
            pdfOpenintent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            pdfOpenintent.setDataAndType(uri, "application/pdf"); // )
            startActivity(pdfOpenintent);
        } catch (Exception e) {
            Toast.makeText(getApplicationContext(),"You require a pdf reader on your phone",Toast.LENGTH_SHORT).show();
        }//included the tty catch using shortcut alt ctl t and then cfreated a toast to show incase the pdf cannot open


    }


    private void insta() {
        cardviz=findViewById(R.id.cardviz);//vision
        cardtan=findViewById(R.id.cardtan);//intern
        cardacc=findViewById(R.id.cardacc);//academic carlendar
        cardtu=findViewById(R.id.cardtu);//constitution
        cardadm=findViewById(R.id.cardadm);//admission form
        cardm=findViewById(R.id.cardm);//mission card
    }
}