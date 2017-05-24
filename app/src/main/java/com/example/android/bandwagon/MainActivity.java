package com.example.android.bandwagon;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnlogout;
    EditText editusername, editname, edithobby;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editname = (EditText) findViewById(R.id.editname);
        editusername = (EditText) findViewById(R.id.editusername);
        edithobby = (EditText) findViewById(R.id.edithobby);
        btnlogout = (Button) findViewById(R.id.btnlogout);

        btnlogout.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnlogout:
                startActivity(new Intent(this, login.class));

                break;
        }
    }
}
