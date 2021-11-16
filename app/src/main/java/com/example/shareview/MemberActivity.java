package com.example.shareview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MemberActivity extends AppCompatActivity {

    private EditText text_name, text_mail, text_pass, text_repass;
    private Button touroku_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_member);

        text_name = (EditText) findViewById(R.id.text_name);
        text_mail = (EditText) findViewById(R.id.text_mail);
        text_pass = (EditText) findViewById(R.id.text_pass);
        text_repass = (EditText) findViewById(R.id.text_repass);
        touroku_button = (Button) findViewById(R.id.touroku_button);
    }

    

}