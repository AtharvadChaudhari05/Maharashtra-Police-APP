package com.example.practiceapplication;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class interfaceActivity2 extends AppCompatActivity {

    ImageButton criminalbutton,viewcriminalbutton,addfirbutton,viewfirbutton,trafficfinebutton,crimemapaccessbutton,
            numberplatebutton,rtoofficebutton,stolenvehiclebutton,viewstolenbutton;

    TextView userTV;

    ImageView police,policebg1,policebg2,profileBtn,call,noticeBtn;

    int[] images={R.drawable.police,R.drawable.policebg1,R.drawable.policebg2};
    int i=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_interface2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        criminalbutton=findViewById(R.id.criminalbutton);
        viewcriminalbutton=findViewById(R.id.viewcriminalbutton);
        addfirbutton=findViewById(R.id.addfirbutton);
        viewfirbutton=findViewById(R.id.viewfirbutton);
        trafficfinebutton=findViewById(R.id.trafficfinebutton);
        crimemapaccessbutton=findViewById(R.id.crimemapaccessbutton);
        numberplatebutton=findViewById(R.id.numberplatebutton);
        rtoofficebutton=findViewById(R.id.rtoofficebutton);
        stolenvehiclebutton=findViewById(R.id.stolenvehiclebutton);
        viewstolenbutton=findViewById(R.id.viewstolenbutton);
        police=findViewById(R.id.police);
        profileBtn=findViewById(R.id.profileBtn);
        call=findViewById(R.id.call);
        noticeBtn=findViewById(R.id.noticeBtn);
        userTV = findViewById(R.id.userTV);


        if(AppData.currentUser !=null)
        {

            userTV.setText(AppData.currentUser.getFname());
        }


        Handler handler = new Handler();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                police.setImageResource(images[i]);
                i = (i + 1) % images.length;
                handler.postDelayed(this, 3000);
            }
        };
        handler.post(runnable);

        criminalbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(interfaceActivity2.this,addcriminalActivity2.class);
                startActivity(i);
            }
        });
        viewcriminalbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(interfaceActivity2.this,ViewAllCriminalActivity.class);
                startActivity(i);
            }
        });
        addfirbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(interfaceActivity2.this,addfirActivity2.class);
                startActivity(i);
            }
        });
        viewfirbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(interfaceActivity2.this,viewallfir.class);
                startActivity(i);
            }
        });
        trafficfinebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(interfaceActivity2.this,TrafficfineActivity2.class);
                startActivity(i);
            }
        });
        crimemapaccessbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(interfaceActivity2.this,crimemapActivity2.class);
                startActivity(i);
            }
        });
        numberplatebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(interfaceActivity2.this,numberverifyActivity2.class);
                startActivity(i);
            }
        });
        rtoofficebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(interfaceActivity2.this,rtolocationActivity2.class);
                startActivity(i);
            }
        });
        stolenvehiclebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(interfaceActivity2.this,addstolenvehicleActivity2.class);
                startActivity(i);
            }
        });
        viewstolenbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(interfaceActivity2.this,viewstolenvehicleActivity2.class);
                startActivity(i);
            }
        });

        profileBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(interfaceActivity2.this,ProfileActivity2.class);
                startActivity(i);
            }
        });

        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(interfaceActivity2.this,callActivity2.class);
                startActivity(i);
            }
        });

        noticeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(interfaceActivity2.this,noticeActivity2.class);
                startActivity(i);

            }
        });





    }
}