package com.example.re;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements
        View.OnClickListener{
    Button enterNewActivityButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        enterNewActivityButton = (Button) findViewById(R.id.loginButton);
        enterNewActivityButton.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        Intent loginIntent = new Intent(MainActivity.this, ta.class);
        startActivity(loginIntent);
    }
}
