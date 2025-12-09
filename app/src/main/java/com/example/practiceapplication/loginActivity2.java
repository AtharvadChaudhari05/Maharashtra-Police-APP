package com.example.practiceapplication;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class loginActivity2 extends AppCompatActivity {

    TextView t1,t2;
    Button b1;

    EditText enteremail,enterpass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AppData.loadUsers(loginActivity2.this);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        t1= findViewById(R.id.textView);
        t2= findViewById(R.id.textView2);
        b1= findViewById(R.id.button);
        enterpass= findViewById(R.id.enterpass);
        enteremail= findViewById(R.id.enteremail);

        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
                Intent i= new Intent(loginActivity2.this,otpActivity2.class);
                startActivity(i);
            }
        });
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(loginActivity2.this, signupActivity2.class);
                startActivity(i);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String email = enteremail.getText().toString();
                if(email.isBlank())
                {
                    Toast.makeText(loginActivity2.this,"email is Required",Toast.LENGTH_SHORT).show();
                    return;
                }

                String pass = enterpass.getText().toString();
                if(pass.isBlank())
                {
                    Toast.makeText(loginActivity2.this,"Password is Required",Toast.LENGTH_SHORT).show();
                    return;
                }

                for (User u :AppData.users) {
                    if(email.equals(u.getEmail()) && pass.equals(u.getPass()))
                    {
                        AppData.currentUser = u;
                        Intent i= new Intent(loginActivity2.this, interfaceActivity2.class);
                        startActivity(i);
                        Toast.makeText(loginActivity2.this, "Login Successfully", Toast.LENGTH_SHORT).show();
                        finish();
                        return;
                    }
                }
            }

        });

    }
}