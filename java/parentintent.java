package com.example.myandroidevent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import  android.widget.*;

import androidx.appcompat.app.AppCompatActivity;

public class parent_intent extends AppCompatActivity {
    TextView txt;
    Button btn;

    public void onCreate(Bundle b){
        super.onCreate(b);
        setContentView(R.layout.parent_intent);
        btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(parent_intent.this,child_intent.class);
                // starting activity with result code 2
                startActivityForResult(i, 2);
            }
        });
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        txt = findViewById(R.id.text1);
        super.onActivityResult(requestCode, resultCode, data);
        // check if the request code is same as what is passed, here it is 2
        if (requestCode == 2 && resultCode == RESULT_OK) {
            String message = data.getStringExtra("message");
            txt.setText(message);
        }
    }

}
