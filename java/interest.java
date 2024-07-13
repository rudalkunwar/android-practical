package com.example.myandroidevent;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class interest extends Activity {
    public void onCreate(Bundle b){
        super.onCreate(b);
        setContentView(R.layout.interest);

        Button btn;
        EditText txt1;
        EditText txt2;
        EditText txt3;
        TextView tv;

        btn = (Button) findViewById(R.id.btn);
        txt1 = (EditText) findViewById(R.id.amount);
        txt2 = (EditText) findViewById(R.id.rate);
        txt3 = (EditText) findViewById(R.id.time);
        tv = (TextView) findViewById(R.id.result);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int amount = Integer.parseInt(txt1.getText().toString());
                double rate = Double.parseDouble(txt2.getText().toString());
                int time = Integer.parseInt(txt3.getText().toString());


                double interest = (amount*rate*time)/100;


                tv.setText("The simple interest is :"+interest);

            }
        });



    }
}
