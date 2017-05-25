package com.example.android.bandwagon;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
public class profile extends AppCompatActivity implements View.OnClickListener{
    Button btnlogout;
    TextView textView;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        image = (ImageView) findViewById(R.id.image);
        textView = (TextView) findViewById(R.id.textView);
        btnlogout = (Button) findViewById(R.id.btnlogout);

        btnlogout.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnlogout:
                startActivity(new Intent(this, MainActivity.class));

                break;
        }
    }
}