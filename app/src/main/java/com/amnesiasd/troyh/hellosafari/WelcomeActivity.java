package com.amnesiasd.troyh.hellosafari;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        Intent intent = getIntent();
        String name = ((Intent) intent).getStringExtra("user");
        TextView welcomeView = findViewById(R.id.welcomeText);
        welcomeView.setText(String.format("Hello, %s!", name));
    }
}
