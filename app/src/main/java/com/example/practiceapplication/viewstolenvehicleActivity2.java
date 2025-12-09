package com.example.practiceapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class viewstolenvehicleActivity2 extends AppCompatActivity {

    ImageButton backbutton1;
    EditText vehiclenumber,ownername,lastseen,description1;
    Button editbutton2,savebutton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_viewstolenvehicle2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        backbutton1=findViewById(R.id.backbutton1);

        vehiclenumber=findViewById(R.id.vehiclenumber);
        ownername =findViewById(R.id.ownername);
        lastseen=findViewById(R.id.lastseen);
        description1=findViewById(R.id.description1);
        editbutton2=findViewById(R.id.editbutton2);
        savebutton2=findViewById(R.id.savebutton2);

        editbutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                savebutton2.setVisibility(View.VISIBLE);
                editbutton2.setVisibility(View.GONE);
                vehiclenumber.setEnabled(true);
                String number=vehiclenumber.getText().toString();
                vehiclenumber.setText(number);
                ownername.setEnabled(true);
                String name=ownername.getText().toString();
                ownername.setText(name);
                lastseen.setEnabled(true);
                String seen=lastseen.getText().toString();
                lastseen.setText(seen);
                description1.setEnabled(true);
                String description=description1.getText().toString();
                description1.setText(description);
            }
        });

        savebutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                savebutton2.setVisibility(View.GONE);
                editbutton2.setVisibility(View.VISIBLE);
                vehiclenumber.setEnabled(false);
                String number=vehiclenumber.getText().toString();
                vehiclenumber.setText(number);
                ownername.setEnabled(false);
                String name=ownername.getText().toString();
                ownername.setText(name);
                lastseen.setEnabled(false);
                String seen=lastseen.getText().toString();
                lastseen.setText(seen);
                description1.setEnabled(false);
                String description=description1.getText().toString();
                description1.setText(description);

            }
        });
        backbutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(viewstolenvehicleActivity2.this, interfaceActivity2.class);
                startActivity(i);
            }
        });

    }
}