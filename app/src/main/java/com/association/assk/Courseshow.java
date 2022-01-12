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

public class Courseshow extends AppCompatActivity implements View.OnClickListener {

    private CardView cardONE,cardTWO,cardTHREE,cardFOUR;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_courseshow);
        initi();
        cardONE.setOnClickListener(this);
        cardTWO.setOnClickListener(this);
        cardTHREE.setOnClickListener(this);
        cardFOUR.setOnClickListener(this);
    }

    private void initi() {
        cardONE=findViewById(R.id.cardONE);
        cardTWO=findViewById(R.id.cardTWO);
        cardTHREE=findViewById(R.id.cardTHREE);
        cardFOUR=findViewById(R.id.cardFOUR);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.cardONE:
                openpdf("https://firebasestorage.googleapis.com/v0/b/pdown-1b163.appspot.com/o/QS.pdf?alt=media&token=5d4e41c7-66ad-46f2-b655-a2c4e9d21838");
            break;
            case R.id.cardTWO:
                openpdf("https://firebasestorage.googleapis.com/v0/b/pdown-1b163.appspot.com/o/LEES.pdf?alt=media&token=c03e6577-c98b-49f0-9158-4dcff3413662");
                break;
            case R.id.cardTHREE:
                openpdf("https://firebasestorage.googleapis.com/v0/b/pdown-1b163.appspot.com/o/LANDIS.pdf?alt=media&token=0dd2c387-86b5-43a2-a3dc-45069fa23359");
                break;
            case R.id.cardFOUR:
                openpdf("https://firebasestorage.googleapis.com/v0/b/pdown-1b163.appspot.com/o/isu%20student.pdf?alt=media&token=265eeba6-cd13-4f75-8176-f269c29040cc");
                break;
        }
    }
    public void openpdf(String URL){

        try {
            Uri uri = Uri.parse(URL);
            Toast.makeText(getBaseContext(), "...preparing registration form ", Toast.LENGTH_LONG).show();
            Intent pdfOpenintent = new Intent(Intent.ACTION_VIEW,uri);
            pdfOpenintent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            pdfOpenintent.setDataAndType(uri, "application/pdf"); // )
            startActivity(pdfOpenintent);
        } catch (Exception e) {
            Toast.makeText(getApplicationContext(),"You require a pdf reader on your phone",Toast.LENGTH_SHORT).show();
        }//included the tty catch using shortcut alt ctl t and then cfreated a toast to show incase the pdf cannot open


    }

}