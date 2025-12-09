package com.example.practiceapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.List;
import java.util.stream.Collectors;

public class ViewAllCriminalActivity extends AppCompatActivity {

    ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_view_all_criminal);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        list = findViewById(R.id.criminalList);

        // Extract only names from the criminal list
        List<String> names = AppData.criminalArrayList.stream()
                .map(Criminal::getName)
                .collect(Collectors.toList());

        // Set adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                names
        );
        list.setAdapter(adapter);

        // Correct method for ListView click handling
        list.setOnItemClickListener((parent, view, position, id) -> {
            Criminal criminalData = AppData.criminalArrayList.get(position);

            Intent i = new Intent(ViewAllCriminalActivity.this, viewcriminalActivity2.class);
            i.putExtra("CriminalName", criminalData.getName());
            i.putExtra("CriminalType", criminalData.getCrimeType());      // Assuming getter exists
            i.putExtra("CriminalDetails", criminalData.getDetails()); // Assuming getter exists
            startActivity(i);
        });
    }
}
