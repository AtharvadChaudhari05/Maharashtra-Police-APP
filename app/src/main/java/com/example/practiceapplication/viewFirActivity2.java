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

public class viewFirActivity2 extends AppCompatActivity {

    EditText complaintnameedittext, dateedittext, crimeedittext, locationedittext, suspectnameedittext,
            descriptionedittext, subareaaet, locationet;
    Button editbutton, savebutton;
    ImageButton imgbutton, downloadbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_view_fir2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        complaintnameedittext = findViewById(R.id.complaintnameedittext);
        dateedittext = findViewById(R.id.dateedittext);
        crimeedittext = findViewById(R.id.crimeedittext);
        locationedittext = findViewById(R.id.locationedittext);
        suspectnameedittext = findViewById(R.id.suspectnameedittext);
        descriptionedittext = findViewById(R.id.descriptionedittext);
        editbutton = findViewById(R.id.editbutton);
        savebutton = findViewById(R.id.savebutton);
        imgbutton = findViewById(R.id.imgbutton);
        subareaaet = findViewById(R.id.subareaaet);
        locationet = findViewById(R.id.locationet);
        downloadbtn = findViewById(R.id.downloadbtn);




        editbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editbutton.setVisibility(View.GONE);
                savebutton.setVisibility(View.VISIBLE);

                complaintnameedittext.setEnabled(true);
                dateedittext.setEnabled(true);
                crimeedittext.setEnabled(true);
                locationedittext.setEnabled(true);
                suspectnameedittext.setEnabled(true);
                descriptionedittext.setEnabled(true);
                subareaaet.setEnabled(true);
                locationet.setEnabled(true);
            }
        });

        savebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                savebutton.setVisibility(View.GONE);
                editbutton.setVisibility(View.VISIBLE);

                complaintnameedittext.setEnabled(false);
                dateedittext.setEnabled(false);
                crimeedittext.setEnabled(false);
                locationedittext.setEnabled(false);
                suspectnameedittext.setEnabled(false);
                descriptionedittext.setEnabled(false);
                subareaaet.setEnabled(false);
                locationet.setEnabled(false);

            }
        });

        imgbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(viewFirActivity2.this, interfaceActivity2.class);
                startActivity(i);
            }
        });

        downloadbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(viewFirActivity2.this, "Download feature coming soon!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

