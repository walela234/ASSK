package com.association.assk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.assk.R;

public class Persons extends AppCompatActivity {
    private LinearLayout llo;
    private TextView pr_name,pr_text,kaba_name,kaba_text,wale_name,wale_text;
    private ImageView pr,nsimbe,za,kaba,wale,yeza,oula,lo,Stella,hillo,kisekwa,ap,ahimb,kituyi,david;
    String url;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_persons);


        llo=findViewById(R.id.llo);
        pr_name=findViewById(R.id.pr_name);
        pr_text=findViewById(R.id.pr_text);
        kaba_name=findViewById(R.id.kaba_name);
        kaba_text=findViewById(R.id.kaba_text);
        wale_name=findViewById(R.id.wale_name);
        wale_text=findViewById(R.id.wale_text);
        pr=findViewById(R.id.pr);
        nsimbe=findViewById(R.id.nsimbe);
        za=findViewById(R.id.za);
        kaba=findViewById(R.id.kaba);
        wale=findViewById(R.id.wale);
        yeza=findViewById(R.id.yeza);
        oula=findViewById(R.id.oula);
        lo=findViewById(R.id.lo);
        Stella=findViewById(R.id.Stella);
        hillo=findViewById(R.id.hillo);
        kisekwa=findViewById(R.id.kisekwa);
        ap=findViewById(R.id.ap);
        ahimb=findViewById(R.id.ahimb);
        kituyi=findViewById(R.id.kituyi);
        david=findViewById(R.id.david);



        displaypicture(pr,"https://firebasestorage.googleapis.com/v0/b/pdown-1b163.appspot.com/o/prez.png?alt=media&token=8374f41d-0353-4856-ab02-39f81fea93bd");
        displaypicture(nsimbe,"https://firebasestorage.googleapis.com/v0/b/pdown-1b163.appspot.com/o/eddie.png?alt=media&token=220dcb52-4662-4904-aecc-de2417faf189");
        displaypicture(za,"https://firebasestorage.googleapis.com/v0/b/pdown-1b163.appspot.com/o/zawedde.png?alt=media&token=4ed5fcb5-64f3-49c1-86d9-e657d0a254d8");
        displaypicture(kaba,"https://firebasestorage.googleapis.com/v0/b/pdown-1b163.appspot.com/o/kabango.jpg?alt=media&token=3b79e0d3-be8a-4e97-9b12-fce67607966f");
        displaypicture(wale,"https://firebasestorage.googleapis.com/v0/b/pdown-1b163.appspot.com/o/walela.png?alt=media&token=f163a65e-4d2f-4f19-a3f2-ba4c4a72423a");
        displaypicture(yeza,"https://firebasestorage.googleapis.com/v0/b/pdown-1b163.appspot.com/o/lamuel.png?alt=media&token=13b01dab-9ee9-4cec-97c9-645158f5b627");
        displaypicture(oula,"https://firebasestorage.googleapis.com/v0/b/pdown-1b163.appspot.com/o/oula.png?alt=media&token=cf05a511-ec6d-4e5a-8a8a-bf7407eb0d6a");
        displaypicture(lo,"https://firebasestorage.googleapis.com/v0/b/pdown-1b163.appspot.com/o/image_2021-12-31_131901-modified.png?alt=media&token=9d6ac71b-7dab-4176-b63d-f774c1f2ba8a");
        displaypicture(Stella,"https://firebasestorage.googleapis.com/v0/b/pdown-1b163.appspot.com/o/stella.png?alt=media&token=bb6786c1-df78-41a5-8013-ebe8d15c4be4");
        displaypicture(hillo,"https://firebasestorage.googleapis.com/v0/b/pdown-1b163.appspot.com/o/hillary.png?alt=media&token=fd8e98b2-69b4-4d28-bc8a-695d2c0e1614");
        displaypicture(kisekwa,"https://firebasestorage.googleapis.com/v0/b/pdown-1b163.appspot.com/o/furaha.png?alt=media&token=9074d1f6-2768-4a4a-ab6c-620a3f328d82");
        displaypicture(ap,"https://firebasestorage.googleapis.com/v0/b/pdown-1b163.appspot.com/o/finance.png?alt=media&token=ff26de8c-efb7-4716-a28d-2130233ca855");
        displaypicture(ahimb,"https://firebasestorage.googleapis.com/v0/b/pdown-1b163.appspot.com/o/IMG-20210728-WA0030-modified.png?alt=media&token=403a962f-97af-4db2-bc3f-aaa5b83053f2");
        displaypicture(kituyi,"https://firebasestorage.googleapis.com/v0/b/pdown-1b163.appspot.com/o/IMG-20211225-WA0002-modified%20(1).png?alt=media&token=9c44d595-f342-49f8-a1f1-e5279deb4cff");
        displaypicture(david,"https://firebasestorage.googleapis.com/v0/b/pdown-1b163.appspot.com/o/david.png?alt=media&token=99d7bff9-7e1d-4421-983a-7237a57ac351");
    }
    private void displaypicture(ImageView image,String url){
        if (internetIsConnected()){

        Glide.with(this).load(url)
                .placeholder(R.drawable.avat)
                .error(R.drawable.avat)
                .into(image);
        }else {
            Toast.makeText(getApplicationContext(),"CHECK INTERNET CONNECTION",Toast.LENGTH_SHORT).show();
        }

    }
    public boolean internetIsConnected() {
        try {
            String command = "ping -c 1 google.com";
            return (Runtime.getRuntime().exec(command).waitFor() == 0);
        } catch (Exception e) {
            return false;
        }
    }
}