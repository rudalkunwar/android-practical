package com.example.myandroidevent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class intent1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intent1);

        Button btn = findViewById(R.id.btn);
        EditText txt = findViewById(R.id.name);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = txt.getText().toString();
                Intent i = new Intent(intent1.this, intent2.class);
                i.putExtra("name", name);
                startActivity(i);
            }
        });
    }
}
