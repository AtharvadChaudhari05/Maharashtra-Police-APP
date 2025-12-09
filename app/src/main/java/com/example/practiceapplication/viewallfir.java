package com.example.practiceapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class viewallfir extends AppCompatActivity {

    ListView firList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_view_all_firactivity);

        // Apply window insets padding to root layout with id "main"
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        firList = findViewById(R.id.firList);

//        // Safety check: Make sure firArrayList is not null or empty
//        if (AppData.firArrayList == null || AppData.firArrayList.isEmpty()) {
//            Toast.makeText(this, "No FIR data available", Toast.LENGTH_SHORT).show();
//            return;
//        }

        // Prepare list of complaint names from AppData.firArrayList
        List<String> names = new ArrayList<>();
        for (fir f : AppData.firArrayList) {
            names.add(f.getComplaintname());
        }

        // Setup adapter and attach it to ListView
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                names
        );

        firList.setAdapter(adapter);

        // On clicking an FIR name, open detail activity with FIR data
        firList.setOnItemClickListener((parent, view, position, id) -> {
            fir firdata = AppData.firArrayList.get(position);

            Intent i = new Intent(viewallfir.this, viewFirActivity2.class);
            i.putExtra("complaintname", firdata.getComplaintname());
            i.putExtra("date", firdata.getDate());
            i.putExtra("crimetype", firdata.getCrimetype());
            i.putExtra("location", firdata.getLocation());
            i.putExtra("subarea", firdata.getSubarea());
            i.putExtra("address", firdata.getAddress());
            i.putExtra("suspectname", firdata.getSuspectname());
            i.putExtra("description", firdata.getDescription());

            startActivity(i);
        });
    }
}
