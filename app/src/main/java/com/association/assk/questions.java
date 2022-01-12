package com.association.assk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.TextView;

import com.example.assk.R;

public class questions extends AppCompatActivity {
    private TextView faq,what_is_assk,assk_acroy,req_qtn,req_ans,ben_qtn,ben_ans,mney_qtn
            ,mney_ans,crt_qtn,crt_ans,card_qtn,card_ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_questions);
        instatiate();
    }
    public void instatiate(){
        faq=findViewById(R.id.faq);
        what_is_assk=findViewById(R.id.qtn);
        assk_acroy=findViewById(R.id.defnnn);
        req_qtn=findViewById(R.id.req_qtn);
        req_ans=findViewById(R.id.req_ans);
        ben_qtn=findViewById(R.id.ben_qtn);
        ben_ans=findViewById(R.id.ben_ans);
        mney_qtn=findViewById(R.id.mney_qtn);
        mney_ans=findViewById(R.id.mney_ans);
        crt_qtn=findViewById(R.id.crt_qtn);
        crt_ans=findViewById(R.id.crt_ans);
        card_qtn=findViewById(R.id.card_qtn);
        card_ans=findViewById(R.id.card_ans);

    }
}