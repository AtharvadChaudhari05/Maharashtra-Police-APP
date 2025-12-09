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

public class numberverifyActivity2 extends AppCompatActivity {

    ImageButton backbutton2;
    EditText numbertext;
    Button vehiclebtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_numberverify2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        backbutton2=findViewById(R.id.backbutton2);
        numbertext=findViewById(R.id.numbertext);
        vehiclebtn=findViewById(R.id.vehiclebtn);


        vehiclebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number = numbertext.getText().toString();
                if (number.isBlank())
                {
                    Toast.makeText(numberverifyActivity2.this, "Vehicle Number is Required", Toast.LENGTH_SHORT).show();
                    return;
                }
                Toast.makeText(numberverifyActivity2.this, "Data Entered Successfully", Toast.LENGTH_SHORT).show();
                return;

            }
        });

        backbutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(numberverifyActivity2.this, interfaceActivity2.class);
                startActivity(i);
            }
        });
    }
}