package com.example.hopeinhome;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }
    public void registerfunc(View view){
//        Intent intent = new Intent(this,LoginActivity.class);
//        startActivity(intent);

        EditText username = findViewById(R.id.register_username);
        String name = username.getText().toString();
        EditText email = findViewById(R.id.register_email);
        String mail = email.getText().toString();
        EditText password = findViewById(R.id.register_password);
        String pass = password.getText().toString();
        EditText confirm_password = findViewById(R.id.register_confirm_password);
        String confirmpass = confirm_password.getText().toString();

        if (name.isEmpty()) {
            Toast.makeText(getApplicationContext(),"You must enter name to register",Toast.LENGTH_SHORT).show();
//            Intent intent = new Intent(this,RegisterActivity.class);
//            startActivity(intent);
        }
        else if (mail.isEmpty()) {
            Toast.makeText(getApplicationContext(),"Enter your valid email",Toast.LENGTH_SHORT).show();
//            Intent intent = new Intent(this,RegisterActivity.class);
//            startActivity(intent);
        }
        else if (pass.isEmpty()) {
            Toast.makeText(getApplicationContext(),"Enter your password",Toast.LENGTH_SHORT).show();
//            Intent intent = new Intent(this,RegisterActivity.class);
//            startActivity(intent);
        }
        else if (confirmpass.isEmpty()) {
            Toast.makeText(getApplicationContext(),"Enter your confirmation password",Toast.LENGTH_SHORT).show();
//            Intent intent = new Intent(this,RegisterActivity.class);
//            startActivity(intent);
        }
        else if(!pass.equals(confirmpass)){
            Toast.makeText(getApplicationContext(),"Password should match with confirm password",Toast.LENGTH_SHORT).show();
//            Intent intent = new Intent(this,RegisterActivity.class);
//            startActivity(intent);
        }
        else {
            Toast.makeText(getApplicationContext(),"Registered Successfully",Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this,LoginActivity.class);
            startActivity(intent);
        }

    }
}