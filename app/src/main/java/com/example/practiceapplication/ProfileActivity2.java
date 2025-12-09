package com.example.practiceapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.lang.reflect.Array;

public class ProfileActivity2 extends AppCompatActivity {

Button logoutbtn,savebtn,editbtn;

EditText officername;
Spinner rankspinner,policestationspinner;

ImageView profile;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_profile2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        logoutbtn=findViewById(R.id.logoutbtn);
        savebtn=findViewById(R.id.savebtn);
        editbtn=findViewById(R.id.editbtn);
        officername=findViewById(R.id.officername);
        rankspinner=findViewById(R.id.rankspinner);
        policestationspinner=findViewById(R.id.policestationspinner);
        profile=findViewById(R.id.profile);

        if(AppData.currentUser!=null)
        {
            officername.setText(AppData.currentUser.getFname());
        }


        String list[]={"Police Constable","Police Naik","Police Head Constable",
                "Assistant Police Inspect (API)","Police Sub Inspector (PSI)",
                "Deputy Superintedent of Police (DYSP)","Assistant Commissioner of Police (ACP)",
                "Additional Superintedent of Police (Addl.SP)","Deputy Commissioner of Police (DCP)",
                "Superintedent of Police (SP)","Deputy Inspector General (DIG)","Inspector General of Police (IGP)",
                "Additional Director General of Police (ADGP)","Director General of Police (DIG)"};

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(ProfileActivity2.this, android.R.layout.simple_spinner_item,list);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);


        rankspinner.setAdapter(arrayAdapter);

        rankspinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String rank=parent.getItemAtPosition(position).toString();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        String station []={ "Colaba Police Station", "Cuffe Parade Police Station", "Marine Drive Police Station",
                "Malabar Hill Police Station", "Gamdevi Police Station", "Mumbai CST Railway Police Station",
                "Nagpada Police Station", "Byculla Police Station", "Tardeo Police Station", "Worli Police Station",
                "Dadar Police Station", "Matunga Police Station", "Bandra Police Station", "Santacruz Police Station",
                "Andheri Police Station", "Jogeshwari Police Station", "Goregaon Police Station", "Malad Police Station",
                "Kandivali Police Station", "Borivali Police Station", "Dahisar Police Station", "Chembur Police Station",
                "Powai Police Station", "Ghatkopar Police Station", "Vikhroli Police Station", "Bhandup Police Station", "Mulund Police Station",
                "Churchgate GRP Police Station", "Mumbai Central GRP", "Dadar GRP", "Andheri GRP", "Borivali GRP" };

        ArrayAdapter<String> arrayAdapter1=new ArrayAdapter<>(ProfileActivity2.this, android.R.layout.simple_spinner_item,station);
        arrayAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        policestationspinner.setAdapter(arrayAdapter1);

        policestationspinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String police=parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        logoutbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppData.currentUser=null;
                Intent i=new Intent(ProfileActivity2.this,loginActivity2.class);
                startActivity(i);
            }
        });

        editbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editbtn.setVisibility(View.GONE);
                savebtn.setVisibility(View.VISIBLE);

                officername.setEnabled(true);
                String name=officername.getText().toString();
                officername.setText(name);
                rankspinner.setEnabled(true);
                policestationspinner.setEnabled(true);

            }
        });
        savebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                savebtn.setVisibility(View.GONE);
                editbtn.setVisibility(View.VISIBLE);

                officername.setEnabled(false);
                String name=officername.getText().toString();
                if(AppData.currentUser!=null)
                {
                    AppData.currentUser.setFname(name);
                    AppData.saveUsers(ProfileActivity2.this);
                }
                officername.setText(name);
                rankspinner.setEnabled(false);
                policestationspinner.setEnabled(false);

            }
        });
    }
}