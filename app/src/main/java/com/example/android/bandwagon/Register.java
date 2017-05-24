package com.example.android.bandwagon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.EditText;

public class Register extends AppCompatActivity implements View.OnClickListener{

    Button btnregister;
    EditText editpassword, editusername, editname, edithobby;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        editpassword = (EditText) findViewById(R.id.editpassword);
        editname = (EditText) findViewById(R.id.editname);
        edithobby = (EditText) findViewById(R.id.edithobby);
        editusername = (EditText) findViewById(R.id.editusername);
        btnregister = (Button) findViewById(R.id.btnregister);

        btnregister.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnregister:


                break;
        }
    }
}
