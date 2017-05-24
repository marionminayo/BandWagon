package com.example.android.bandwagon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class login extends AppCompatActivity implements View.OnClickListener{

    Button btnlogin;
    EditText editpassword, editusername;
    TextView editsignup;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editusername = (EditText) findViewById(R.id.editusername);
        editpassword = (EditText) findViewById(R.id.editpassword);
        btnlogin = (Button) findViewById(R.id.btnlogin);
        editsignup = (TextView) findViewById(R.id.editsignup);

        btnlogin.setOnClickListener(this);
        editsignup.setOnClickListener(this);
    }
//when button is clicked this method is notified
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnlogin:


                break;

            case R.id.editsignup:

                startActivity(new Intent(this, Register.class ));

                break;
        }

    }
}
