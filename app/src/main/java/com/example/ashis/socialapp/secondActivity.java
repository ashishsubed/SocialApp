package com.example.ashis.socialapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class secondActivity extends AppCompatActivity {


    private Button bloodbtn;
    private Button lostbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        bloodbtn= findViewById(R.id.bloodbtn);
        lostbtn=findViewById(R.id.lostbtn);

        bloodbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(secondActivity.this, blood.class));

            }
        });


        lostbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(secondActivity.this, lost.class));
            }
        });
    }

}
