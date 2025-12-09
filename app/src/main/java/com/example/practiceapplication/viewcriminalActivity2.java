package com.example.practiceapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class viewcriminalActivity2 extends AppCompatActivity {

    ImageButton imgbutton1;
    EditText name1,crimetype1,crimedate1,details1;
    Button editbutton1,savebutton1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_viewcriminal2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        imgbutton1=findViewById(R.id.imgbutton1);
        name1=findViewById(R.id.name1);
        crimetype1=findViewById(R.id.crimetype1);
        crimedate1=findViewById(R.id.crimedate1);
        details1=findViewById(R.id.details1);
        editbutton1=findViewById(R.id.editbutton1);
        savebutton1=findViewById(R.id.savebutton1);
        Intent i = getIntent();
        name1.setText(i.getStringExtra("CriminalName"));
        crimetype1.setText(i.getStringExtra("CriminalType"));
        details1.setText(i.getStringExtra("CriminalDetails"));


        editbutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editbutton1.setVisibility(View.GONE);
                savebutton1.setVisibility(View.VISIBLE);
                name1.setEnabled(true);
                String name=name1.getText().toString();
                name1.setText(name);
                crimetype1.setEnabled(true);
                String crime=crimetype1.getText().toString();
                crimetype1.setText(crime);
                crimedate1.setEnabled(true);
                String crime1=crimedate1.getText().toString();
                crimedate1.setText(crime1);
                details1.setEnabled(true);
                String details=details1.getText().toString();
                details1.setText(details);

            }
        });
        savebutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                savebutton1.setVisibility(View.GONE);
                editbutton1.setVisibility(View.VISIBLE);
                name1.setEnabled(false);
                String name=name1.getText().toString();
                name1.setText(name);
                crimetype1.setEnabled(false);
                String crime=crimetype1.getText().toString();
                crimetype1.setText(crime);
                crimedate1.setEnabled(false);
                String crime1=crimedate1.getText().toString();
                crimedate1.setText(crime1);
                details1.setEnabled(false);
                String details=details1.getText().toString();
                details1.setText(details);
            }
        });
            imgbutton1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i=new Intent(viewcriminalActivity2.this,ViewAllCriminalActivity.class);
                    startActivity(i);
                }
            });




    }
}