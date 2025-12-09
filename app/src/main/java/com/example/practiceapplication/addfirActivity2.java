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

public class addfirActivity2 extends AppCompatActivity {

    DatePicker date1;
    EditText cname, etsuspectname, etdescription,adress;
    Spinner crimetype2, splocation, subAreaSpinner;
    Button submitbtn;
    ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_addfir2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        date1 = findViewById(R.id.date1);
        cname = findViewById(R.id.cname);
        splocation = findViewById(R.id.splocation);
        subAreaSpinner = findViewById(R.id.subAreaSpinner);
        etsuspectname = findViewById(R.id.etsuspectname);
        etdescription = findViewById(R.id.etdescription);
        crimetype2 = findViewById(R.id.crimetype2);
        submitbtn = findViewById(R.id.submitbtn);
        imageButton = findViewById(R.id.imageButton);
        adress=findViewById(R.id.adress);


        String[] crimeTypes = {
                "Murder (IPC 302)", "Attempt to Murder (IPC 307)", "Assault / Beating (IPC 323)",
                "Kidnapping / Abduction (IPC 363)", "Rape (IPC 376)", "Gang Rape (IPC 376D)",
                "Acid Attack (IPC 326A)", "Dowry Death (IPC 304B)", "Domestic Violence",
                "Rioting (IPC 147)", "Sexual Harassment (IPC 354)", "Theft (IPC 379)", "Vehicle Theft",
                "House Break-in (IPC 457)", "Robbery (IPC 392)", "Dacoity (IPC 395)", "Snatching (IPC 356)",
                "Trespassing (IPC 447)", "Arson (IPC 435)", "Cheating / Fraud (IPC 420)", "Forgery (IPC 465)",
                "Counterfeit Currency (IPC 489A)", "Bribery / Corruption", "Cyber Fraud / UPI Scam",
                "Hacking / Unauthorized Access", "Online Harassment", "Phishing / Fake Email",
                "Social Media Abuse", "Eve Teasing", "Molestation", "Dowry Harassment", "Honor Killing",
                "Child Kidnapping", "Child Sexual Abuse (POCSO)", "Child Labour", "Child Trafficking",
                "Drug Possession (NDPS)", "Drug Smuggling", "Drug Peddling", "Terrorism", "Extortion",
                "Human Trafficking", "Illegal Betting / Gambling", "Hit and Run", "Drunk Driving",
                "Rash Driving (IPC 279)"
        };

        ArrayAdapter<String> crimeAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, crimeTypes);
        crimeAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        crimetype2.setAdapter(crimeAdapter);


        String[] locations = {
                "Mumbai CST (CSTM)", "Masjid (MSD)", "Sandhurst Road (SNRD)", "Byculla (BY)",
                "Chinchpokli (CHG)", "Currey Road (CRD)", "Parel (PR)", "Dadar Central (DR)",
                "Matunga (MTN)", "Sion (SIN)", "Kurla Junction (CLA)", "Vidyavihar (VVH)",
                "Ghatkopar (GC)", "Vikhroli (VK)", "Kanjur Marg (KJMG)", "Powai", "Bhandup (BND)",
                "Nahur (NHU)", "Mulund (MLND)", "Thane (TNA)"
        };

        ArrayAdapter<String> locationAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, locations);
        locationAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        splocation.setAdapter(locationAdapter);


        String[] subAreas = {
                "Fort", "Ballard Estate", "Crawford Market", "Colaba", "Marine Lines",
                "Masjid Bunder", "Mandvi", "Pydhonie", "Chinchbunder", "Carnac Bunder",
                "Dongri", "Mazgaon", "Umerkhadi", "Mandvi (North)",
                "Byculla East", "Byculla West", "Jacob Circle", "Rani Baug", "Nagpada", "Agripada",
                "Saat Rasta", "Mahalaxmi Dhobi Ghat", "Chinchpokli East/West", "Eknath Nagar",
                "Lalbaug", "Parel (East)", "F South Ward", "Kalachowki",
                "Bhoiwada", "KEM Hospital Area", "F/South Ward", "Tata Hospital Area", "Lower Parel",
                "Dadar East", "Hindu Colony", "Parsi Colony", "Wadala (North)", "Matunga East",
                "Matunga Labour Camp", "King’s Circle", "Five Gardens",
                "Sion Koliwada", "Chunabhatti", "Guru Tegh Bahadur Nagar", "Pratiksha Nagar", "Sion Circle",
                "Kurla East", "Kurla West", "Nehru Nagar", "LBS Marg", "Qureshi Nagar",
                "Rajawadi", "Somaiya Campus", "Ghatkopar East (border)", "Garodia Nagar",
                "Ghatkopar East", "Ghatkopar West", "Pant Nagar", "Amrut Nagar",
                "Vikhroli East", "Vikhroli West", "Kannamwar Nagar", "Parksite",
                "Kanjurmarg East", "Kanjurmarg West", "Bhandup Pumping", "Hiranandani Link Road area",
                "Bhandup East", "Bhandup West", "Sarvodaya Nagar", "Dreams Mall area", "Nahur Phata",
                "Bhandup East (extension)", "Navghar", "Nahur West", "Village Road", "Eastern Express nearby",
                "Mulund East", "Mulund West", "Hari Om Nagar", "Tambe Nagar", "Nahur-Mulund Link",
                "Naupada", "Teen Hath Naka", "Vartak Nagar", "Majiwada", "Wagle Estate", "Kalwa",
                "Hiranandani Gardens", "Powai Lake Area", "Chandivali", "Raheja Vihar", "Tunga Village",
                "Nahar Amrit Shakti", "Saki Vihar Road", "JVLR (Powai Stretch)", "Tirandaz Village",
                "IIT Bombay Campus", "L&T Gate", "L&T Business Park"
        };

        ArrayAdapter<String> subAreaAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, subAreas);
        subAreaAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        subAreaSpinner.setAdapter(subAreaAdapter);

        subAreaSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedSubArea = parent.getItemAtPosition(position).toString();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        submitbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String complaintname = cname.getText().toString();
                String crimeType = crimetype2.getSelectedItem().toString();
                String locationSelected = splocation.getSelectedItem().toString();
                String subAreaSelected = subAreaSpinner.getSelectedItem().toString();
                String address1 = adress.getText().toString();
                String suspectName = etsuspectname.getText().toString();
                String description = etdescription.getText().toString();

                int day = date1.getDayOfMonth();
                int month = date1.getMonth() + 1;
                int year = date1.getYear();
                String date = day + "/" + month + "/" + year;

                if (complaintname.isEmpty() || suspectName.isEmpty() || description.isEmpty()) {
                    Toast.makeText(addfirActivity2.this, "All fields are required", Toast.LENGTH_SHORT).show();
                    return;
                }

                Toast.makeText(addfirActivity2.this, "FIR Added Successfully", Toast.LENGTH_SHORT).show();
                fir f = new fir(complaintname, date, crimeType, locationSelected, subAreaSelected , address1, suspectName, description);
                AppData.firArrayList.add(f);
                AppData.saveUsers(addfirActivity2.this);





            }
        });




        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(addfirActivity2.this, interfaceActivity2.class);
                startActivity(i);
            }
        });
    }
}
