package com.example.android.bandwagon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class login extends AppCompatActivity implements View.OnClickListener{

    Button btnlogin;
    EditText editpassword, editusername;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);

        editusername = (EditText) findViewById(R.id.editusername);
        editpassword = (EditText) findViewById(R.id.editpassword);
        btnlogin = (Button) findViewById(R.id.btnlogin);

        btnlogin.setOnClickListener(this);
    }
//when button is clicked this method is notified
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnlogin:


                break;
        }

    }
}
