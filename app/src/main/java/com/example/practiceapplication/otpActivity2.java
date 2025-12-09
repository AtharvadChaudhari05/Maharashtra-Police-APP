package com.example.practiceapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class otpActivity2 extends AppCompatActivity {

    Button otpbtn,setpassbtn;
    EditText phoneno,enterotp,enterpassword,enterconformpass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_otp2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        otpbtn=findViewById(R.id.otpbtn);
        setpassbtn=findViewById(R.id.setpassbtn);
        phoneno=findViewById(R.id.phoneno);
        enterotp=findViewById(R.id.enterotp);
        enterpassword=findViewById(R.id.enterpassword);
        enterconformpass=findViewById(R.id.enterconformpass);

        otpbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phone = phoneno.getText().toString();
                if (phone.isBlank()) {
                    Toast.makeText(otpActivity2.this, "Phone No is Required", Toast.LENGTH_SHORT).show();
                    return;
                }
            }
        });


        setpassbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String otp1 = enterotp.getText().toString();
                if (otp1.isBlank())
                {
                    Toast.makeText(otpActivity2.this, "OTP is Required", Toast.LENGTH_SHORT).show();
                    return;
                }

                String pass = enterpassword.getText().toString();
                if(pass.isBlank())
                {
                    Toast.makeText(otpActivity2.this,"pass is Required",Toast.LENGTH_SHORT).show();
                    return;
                }

                String cpass = enterconformpass.getText().toString();
                if(cpass.isBlank())
                {
                    Toast.makeText(otpActivity2.this,"cpass is Required",Toast.LENGTH_SHORT).show();
                    return;
                }

                if(!pass.equals(cpass))
                {

                    Toast.makeText(otpActivity2.this,"Pass and Cpass not same",Toast.LENGTH_SHORT).show();
                    return;
                }
                Intent i=new Intent(otpActivity2.this,loginActivity2.class);
                startActivity(i);

                Toast.makeText(otpActivity2.this,"Password Updated SuccessFully",Toast.LENGTH_SHORT).show();
                return;

            }
        });



    }
}