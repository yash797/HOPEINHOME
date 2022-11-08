package com.example.hopeinhome;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MessangerBot extends AppCompatActivity {

    int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_messanger_bot);
    }

//    public void sendfunc2(View view){
//        EditText inputmessage2 = findViewById(R.id.bot_input2);
//        String input_message2 = inputmessage2.getText().toString();
//        if (input_message2.isEmpty()) {
//            Toast.makeText(getApplicationContext(), "You sent an empty message", Toast.LENGTH_SHORT).show();
//        }
//        else if(input_message2.equals("Hey") ||input_message2.equals("hey")  || input_message2.equals("Hi")  || input_message2.equals("hi") || input_message2.equals("Hii")
//                ||input_message2.equals("hii")  || input_message2.equals("Hello") || input_message2.equals("hello")) {
//            count += 1;
//            TextView input1 = findViewById(R.id.bot_output2);
//            input1.setText("Hello, we hope you have a good day.Relax yourself with meditation and stay focused toward your goals \uD83D\uDE04");
//            input1.setWidth(900);
//
//        }
//        else{
//            TextView input2 = findViewById(R.id.bot_output2);
//            input2.setText("Sorry for the inconvinence .The bot is not prepared for your service. Stay tune with us.");
//            input2.setWidth(900);}
//    }

    public void sendfunc(View view) {


        EditText inputmessage1 = findViewById(R.id.bot_input1);
        String input_message1 = inputmessage1.getText().toString();
        if (input_message1.isEmpty()) {
            Toast.makeText(getApplicationContext(), "You sent an empty message", Toast.LENGTH_SHORT).show();
        }
        else if(input_message1.equals("Hey") ||input_message1.equals("hey")  || input_message1.equals("Hi")  || input_message1.equals("hi") || input_message1.equals("Hii")
                ||input_message1.equals("hii")  || input_message1.equals("Hello") || input_message1.equals("hello")) {
            count += 1;
            TextView input1 = findViewById(R.id.bot_output2);
            input1.setText("Hello, we hope you have a good day.Relax yourself with meditation and stay focused toward your goals \uD83D\uDE04");
            input1.setWidth(900);
//            EditText input3 = findViewById(R.id.bot_input2);
//            input3.setWidth(900);
//            Button input4 = findViewById((R.id.sendbutton2));
//            input4.setWidth(250);
//            sendfunc2(view);
        }
//        else if(count>=1){
//
//            TextView input3 = findViewById(R.id.bot_input2);
//            input3.setWidth(900);
//            Button input4 = findViewById((R.id.sendbutton2));
//            input4.setWidth(250);
//            sendfunc2(view);
//        }
        else{
            TextView input2 = findViewById(R.id.bot_output2);
            input2.setText("Sorry for the inconvinence .The bot is not prepared for your service. Stay tune with us.");
            input2.setWidth(900);
        }
    }

}