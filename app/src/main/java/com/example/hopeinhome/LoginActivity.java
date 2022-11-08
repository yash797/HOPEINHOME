package com.example.hopeinhome;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    public static final String MSG = "com.example.hopeinhome.input_username1";

//    TextView hide_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


    }

//    public void ShowHidePass(View view){
//
//        if(view.getId()==R.id.hidebutton){
//
//            if(login_password.getTransformationMethod().equals(PasswordTransformationMethod.getInstance())){
//                ((ImageView)(view)).setImageResource(R.drawable.ic_baseline_visibility_24);
//
//                //Show Password
//                login_password.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
//            }
//            else{
//                ((ImageView)(view)).setImageResource(R.drawable.ic_baseline_alarm_24);
//
//                //Hide Password
//                edit_password.setTransformationMethod(PasswordTransformationMethod.getInstance());
//
//            }
//        }
//    }

    public void loginfunc(View view){

//        Intent intent = new Intent(this,MainActivity.class);
        EditText username = findViewById(R.id.login_username);
        String input_username1 = username.getText().toString();
        EditText loginpass = findViewById(R.id.login_password);
        String loginpassword = loginpass.getText().toString();
        if(input_username1.isEmpty()){
            Toast.makeText(getApplicationContext(),"Enter Username to Login",Toast.LENGTH_SHORT).show();
        }
        else if(loginpassword.isEmpty()){
            Toast.makeText(getApplicationContext(),"Enter Valid Password",Toast.LENGTH_SHORT).show();
        }
        else{
            Intent intent = new Intent(this,MainActivity.class);
            EditText username2 = findViewById(R.id.login_username);
            String input_username2 = username2.getText().toString();
            intent.putExtra(MSG,input_username2);
            startActivity(intent);
        }

//        intent.putExtra(MSG,input_username1);
//        startActivity(intent);

    }
    public void registerbuttonfunc(View view){

        Intent intent = new Intent(this,RegisterActivity.class);
        startActivity(intent);
    }
}