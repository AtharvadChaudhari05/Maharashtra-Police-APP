package com.example.practiceapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.Toast;


import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class addcriminalActivity2 extends AppCompatActivity {

    EditText nameet,details2;
    Spinner crimetypec;
    DatePicker date2;
    Button submitbutton;

    ImageButton backbutton;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_addcriminal2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        nameet = findViewById(R.id.nameet);
        details2 = findViewById(R.id.details2);
        crimetypec = findViewById(R.id.crimetypec);
        date2 = findViewById(R.id.date2);
        submitbutton = findViewById(R.id.submitbutton);
        backbutton = findViewById(R.id.backbutton);

        String criminal[] = {"Murder (IPC 302)", "Attempt to Murder (IPC 307)", "Assault / Beating (IPC 323)",
                "Kidnapping / Abduction (IPC 363)", "Rape (IPC 376)", "Gang Rape (IPC 376D)", "Acid Attack (IPC 326A)",
                "Dowry Death (IPC 304B)", "Domestic Violence", "Rioting (IPC 147)", "Sexual Harassment (IPC 354)",
                "Theft (IPC 379)", "Vehicle Theft", "House Break-in (IPC 457)", "Robbery (IPC 392)", "Dacoity (IPC 395)",
                "Snatching (IPC 356)", "Trespassing (IPC 447)", "Arson (IPC 435)", "Cheating / Fraud (IPC 420)",
                "Forgery (IPC 465)", "Counterfeit Currency (IPC 489A)", "Bribery / Corruption", "Cyber Fraud / UPI Scam",
                "Hacking / Unauthorized Access", "Online Harassment", "Phishing / Fake Email",
                "Social Media Abuse", "Eve Teasing", "Molestation", "Dowry Harassment", "Honor Killing",
                "Child Kidnapping", "Child Sexual Abuse (POCSO)", "Child Labour", "Child Trafficking",
                "Drug Possession (NDPS)", "Drug Smuggling", "Drug Peddling", "Terrorism", "Extortion", "Human Trafficking",
                "Illegal Betting / Gambling", "Hit and Run", "Drunk Driving", "Rash Driving (IPC 279)"};


        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(addcriminalActivity2.this, android.R.layout.simple_spinner_item, criminal);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        crimetypec.setAdapter(arrayAdapter);
        crimetypec.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String crime = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        submitbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = nameet.getText().toString();
                if (name.isBlank()) {
                    Toast.makeText(addcriminalActivity2.this, "Name is Required", Toast.LENGTH_SHORT).show();
                    return;
                }

                String details = details2.getText().toString();
                if (details.isBlank()) {
                    Toast.makeText(addcriminalActivity2.this, "Details is Required", Toast.LENGTH_SHORT).show();
                    return;
                }

                String crime = crimetypec.getSelectedItem().toString();
                if (crime.isBlank()) {
                    Toast.makeText(addcriminalActivity2.this, "Crimetype is Required", Toast.LENGTH_SHORT).show();
                    return;
                }

                Toast.makeText(addcriminalActivity2.this, "Data Submitted Successfully", Toast.LENGTH_SHORT).show();

                Criminal c = new Criminal(name,crime,"123",details);
                AppData.criminalArrayList.add(c);
                AppData.saveUsers(addcriminalActivity2.this);


            }
        });
        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(addcriminalActivity2.this, interfaceActivity2.class);
                startActivity(i);
            }
        });

    }
}