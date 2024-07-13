package com.example.myandroidevent;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class profitloss extends Activity {
    public void onCreate(Bundle b){
        super.onCreate(b);
        setContentView(R.layout.profitloss);

        Button btn;
        EditText txt1;
        EditText txt2;
        TextView v1;

        btn = (Button) findViewById(R.id.btn);
        txt1 = (EditText) findViewById(R.id.cp);
        txt2 = (EditText) findViewById(R.id.sp);
        v1 = (TextView) findViewById(R.id.result);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int cp = Integer.parseInt(txt1.getText().toString());
                int sp = Integer.parseInt(txt2.getText().toString());

                if(cp>sp){

                    int loss = cp - sp;
                    v1.setText("The loss is "+loss);


                }else{
                    int profit =  sp-cp;
                    v1.setText("The profit is "+profit);
                }
                if(cp==sp) {
                    v1.setText("Neiter profit nor loss");

                }
            }
        });
    }
}
