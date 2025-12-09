package com.example.practiceapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class TrafficfineActivity2 extends AppCompatActivity {

    EditText entervehicle,fine;
    ImageButton btnCapturePhoto,backbtn;

    RadioButton radiobutton1,radiobutton2,radiobutton3,radiobutton4,radiobutton5,radiobutton6, radiobutton7,
            radiobutton8,radiobutton9,radiobutton10,radiobutton11,radiobutton12,radiobutton13,radiobutton14,
            radiobutton15,radiobutton16,radiobutton17,radiobutton18,radiobutton19,radiobutton20,radiobutton21;
    Button submitfine;

    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_trafficfine2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        entervehicle=findViewById(R.id.entervehicle);
        submitfine=findViewById(R.id.submitfine);
        fine=findViewById(R.id.fine);
        btnCapturePhoto=findViewById(R.id.btnCapturePhoto);
        radiobutton1=findViewById(R.id.radiobutton1);
        radiobutton2=findViewById(R.id.radiobutton2);
        radiobutton3=findViewById(R.id.radiobutton3);
        radiobutton4=findViewById(R.id.radiobutton4);
        radiobutton5=findViewById(R.id.radiobutton5);
        radiobutton6=findViewById(R.id.radiobutton6);
        radiobutton7=findViewById(R.id.radiobutton7);
        radiobutton8=findViewById(R.id.radiobutton8);
        radiobutton9=findViewById(R.id.radiobutton9);
        radiobutton10=findViewById(R.id.radiobutton10);
        radiobutton11=findViewById(R.id.radiobutton11);
        radiobutton12=findViewById(R.id.radiobutton12);
        radiobutton13=findViewById(R.id.radiobutton13);
        radiobutton14=findViewById(R.id.radiobutton14);
        radiobutton15=findViewById(R.id.radiobutton15);
        radiobutton16=findViewById(R.id.radiobutton16);
        radiobutton17=findViewById(R.id.radiobutton17);
        radiobutton18=findViewById(R.id.radiobutton18);
        radiobutton19=findViewById(R.id.radiobutton19);
        radiobutton20=findViewById(R.id.radiobutton20);
        radiobutton21=findViewById(R.id.radiobutton21);
        backbtn=findViewById(R.id.backbtn);






        submitfine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name= entervehicle.getText().toString();
                if (name.isBlank()) {
                    Toast.makeText(TrafficfineActivity2.this, "Number is Required", Toast.LENGTH_LONG).show();
                    return;
                }
                Toast.makeText(TrafficfineActivity2.this, "Data Enter Successfully", Toast.LENGTH_LONG).show();
                return;
            }
        });
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(TrafficfineActivity2.this, interfaceActivity2.class);
                startActivity(i);
            }
        });

    }
}