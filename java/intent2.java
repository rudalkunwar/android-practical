package com.example.myandroidevent;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class intent2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intent2);

        Intent i = getIntent();
        String value = i.getStringExtra("name");

        TextView name = findViewById(R.id.result);
        name.setText(value);
    }
}
