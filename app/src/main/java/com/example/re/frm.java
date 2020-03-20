package com.example.re;

/*import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class frm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frm);
    }
}*/
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class frm extends AppCompatActivity implements
        View.OnClickListener{
    Button enterNewActivityButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        enterNewActivityButton = (Button) findViewById(R.id.next2);
        enterNewActivityButton.setOnClickListener(this);
    }
    @Override
    public void onClick(View x) {
        Intent loginIntent;
        loginIntent = new Intent(frm.this, abs.class);
        startActivity(loginIntent);
    }
}
