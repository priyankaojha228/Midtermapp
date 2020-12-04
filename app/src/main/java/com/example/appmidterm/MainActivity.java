package com.example.appmidterm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText email;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email=findViewById(R.id.editTextTextEmailAddress);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
                public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                validateEmailaddress(email);

            }
        });
    }
    private boolean validateEmailaddress(EditText email){
        String emailinput=email.getText().toString();
        if(!emailinput.isEmpty() && Patterns.EMAIL_ADDRESS.matcher(emailinput).matches()){
            Toast.makeText(this,"Email id verified sucessfully",Toast.LENGTH_SHORT).show();
            return true;
        }else{
            Toast.makeText(this,"Invalid Email id",Toast.LENGTH_SHORT).show();
            return false;
        }
    }
}