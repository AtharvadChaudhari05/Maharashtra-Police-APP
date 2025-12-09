package com.example.practiceapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class addstolenvehicleActivity2 extends AppCompatActivity {

    EditText vehiclenumber,ownername,lastseen,description1;
    Button submitbutton;

    ImageButton backbutton1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_addstolenvehicle2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        vehiclenumber=findViewById(R.id.vehiclenumber);
        ownername=findViewById(R.id.ownername);
        lastseen=findViewById(R.id.lastseen);
        description1=findViewById(R.id.description1);
        backbutton1=findViewById(R.id.backbutton1);
        submitbutton=findViewById(R.id.submitbutton);

        submitbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = ownername.getText().toString();
                if (name.isBlank())
                {
                    Toast.makeText(addstolenvehicleActivity2.this, "Name is Required", Toast.LENGTH_SHORT).show();
                    return;
                }
                String number = vehiclenumber.getText().toString();
                if (number.isBlank())
                {
                    Toast.makeText(addstolenvehicleActivity2.this, "Vehicle Number is Required", Toast.LENGTH_SHORT).show();
                    return;
                }

                String descript = description1.getText().toString();
                if (descript.isBlank())
                {
                    Toast.makeText(addstolenvehicleActivity2.this, "Name is Required", Toast.LENGTH_SHORT).show();
                    return;
                }

            }
        });

        backbutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(addstolenvehicleActivity2.this,interfaceActivity2.class);
                startActivity(i);
            }
        });

    }
}