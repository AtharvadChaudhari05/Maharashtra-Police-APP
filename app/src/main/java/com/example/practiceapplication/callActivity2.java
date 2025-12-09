package com.example.practiceapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class callActivity2 extends AppCompatActivity {


    Spinner spinner1;
    TextView email1,phone1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_call2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        spinner1=findViewById(R.id.spinner1);
        email1=findViewById(R.id.email1);
        phone1=findViewById(R.id.phone1);



        String station []={ "Colaba Police Station", "Cuffe Parade Police Station", "Marine Drive Police Station",
                "Malabar Hill Police Station", "Gamdevi Police Station", "Mumbai CST Railway Police Station",
                "Nagpada Police Station", "Byculla Police Station", "Tardeo Police Station", "Worli Police Station",
                "Dadar Police Station", "Matunga Police Station", "Bandra Police Station", "Santacruz Police Station",
                "Andheri Police Station", "Jogeshwari Police Station", "Goregaon Police Station", "Malad Police Station",
                "Kandivali Police Station", "Borivali Police Station", "Dahisar Police Station", "Chembur Police Station",
                "Powai Police Station", "Ghatkopar Police Station", "Vikhroli Police Station", "Bhandup Police Station", "Mulund Police Station",
                "Churchgate GRP Police Station", "Mumbai Central GRP", "Dadar GRP", "Andheri GRP", "Borivali GRP" };

        String[] fakePhones = {
                "000-000-0001", "000-000-0002", "000-000-0003", "000-000-0004", "000-000-0005",
                "000-000-0006", "000-000-0007", "000-000-0008", "000-000-0009", "000-000-0010",
                "000-000-0011", "000-000-0012", "000-000-0013", "000-000-0014", "000-000-0015",
                "000-000-0016", "000-000-0017", "000-000-0018", "000-000-0019", "000-000-0020",
                "000-000-0021", "000-000-0022", "000-000-0023", "000-000-0024", "000-000-0025",
                "000-000-0026", "000-000-0027", "000-000-0028", "000-000-0029", "000-000-0030",
                "000-000-0031", "000-000-0032"
        };

        String[] fakeEmails = {
                "colaba123@police.in", "cuffeparade202@police.in", "marinedrive876@police.in", "malabarhill304@police.in", "gamdevi789@police.in",
                "cstrailway510@police.in", "nagpada154@police.in", "byculla743@police.in", "tardeo605@police.in", "worli969@police.in",
                "dadar712@police.in", "matunga871@police.in", "bandra304@police.in", "santacruz912@police.in", "andheri478@police.in",
                "jogeshwari206@police.in", "goregaon351@police.in", "malad997@police.in", "kandivali663@police.in", "borivali555@police.in",
                "dahisar188@police.in", "chembur762@police.in", "powai980@police.in", "ghatkopar419@police.in", "vikhroli834@police.in",
                "bhandup622@police.in", "mulund145@police.in", "churchgategrp399@police.in", "centralgrp882@police.in", "dadargrp673@police.in",
                "andherigrp201@police.in", "borivaligrp333@police.in"
        };


        ArrayAdapter<String> arrayAdapter1=new ArrayAdapter<>(callActivity2.this, android.R.layout.simple_spinner_item,station);
        arrayAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(arrayAdapter1);



        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                phone1.setText(fakePhones[position]);
                email1.setText(fakeEmails[position]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                phone1.setText("");
                email1.setText("");

            }
        });
    }

}