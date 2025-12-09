package com.example.practiceapplication;

import android.content.Intent;
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

public class signupActivity2 extends AppCompatActivity {

    Button b1;
    TextView t1;
    EditText fullname,emailid,mobile,password,cpassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_signup2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        b1= findViewById(R.id.button);
        t1= findViewById(R.id.textView8);
        fullname=findViewById(R.id.fullname);
        emailid=findViewById(R.id.emailid);
        mobile=findViewById(R.id.mobile);
        password=findViewById(R.id.password);
        cpassword=findViewById(R.id.cpassword);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = fullname.getText().toString();
                if(name.isBlank())
                {
                   Toast.makeText(signupActivity2.this,"Name is Required",Toast.LENGTH_SHORT).show();
                   return;
                }

                String email = emailid.getText().toString();
                if(email.isBlank())
                {
                    Toast.makeText(signupActivity2.this,"email is Required",Toast.LENGTH_SHORT).show();
                    return;
                }

                String mobileno = mobile.getText().toString();
                if(mobileno.isBlank())
                {
                    Toast.makeText(signupActivity2.this,"mobileno is Required",Toast.LENGTH_SHORT).show();

                    return;
                }


                String pass = password.getText().toString();
                if(pass.isBlank())
                {
                    Toast.makeText(signupActivity2.this,"pass is Required",Toast.LENGTH_SHORT).show();
                    return;
                }

                String cpass = cpassword.getText().toString();
                if(cpass.isBlank())
                {
                    Toast.makeText(signupActivity2.this,"cpass is Required",Toast.LENGTH_SHORT).show();
                    return;
                }

                if(!pass.equals(cpass))
                {

                    Toast.makeText(signupActivity2.this,"Pass and Cpass not same",Toast.LENGTH_SHORT).show();
                    return;
                }

                User u = new User(name, email, pass, mobileno);
                AppData.users.add(u);
                AppData.saveUsers(signupActivity2.this);

                Intent i=new Intent(signupActivity2.this,loginActivity2.class);
                startActivity(i);
                finish();

                Toast.makeText(signupActivity2.this,"Signup successfully",Toast.LENGTH_SHORT).show();
            }
        });

        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(signupActivity2.this,loginActivity2.class);
                startActivity(i);


            }
        });

    }
}