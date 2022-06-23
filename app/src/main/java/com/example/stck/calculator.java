package com.example.stck;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.text.DecimalFormat;

public class calculator extends AppCompatActivity {
    EditText editTextbuying,editTextselling,editTextcomision,editTextquantity;
    Button btn,btnreset;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        getSupportActionBar().hide();

        editTextbuying = findViewById(R.id.editbying);
        editTextselling = findViewById(R.id.edtselprc);
        editTextcomision = findViewById(R.id.editcommision);
        editTextquantity = findViewById(R.id.editquantity);
        btn = findViewById(R.id.btncalculatelosssprofit);
        btnreset = findViewById(R.id.btncalculatereset);


        textView = findViewById(R.id.calculatetext);

        LinearLayout l = findViewById(R.id.calculatorlayoutid);
        AnimationDrawable animationDrawable4= (AnimationDrawable) l.getBackground();


        animationDrawable4.setEnterFadeDuration(2500);
        animationDrawable4.setExitFadeDuration(5000);

        animationDrawable4.start();


        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String a = editTextbuying.getText().toString();
                String b= editTextselling.getText().toString();
                String c= editTextcomision.getText().toString();
                String d=editTextquantity.getText().toString();


                int a1 = Integer.parseInt(a);
                int b1 = Integer.parseInt(b);
                double c1 = Double.parseDouble(c);
                int d1 =Integer.parseInt(d);
                c1=c1/100;

                double res = (b1*d1)-(d1*(a1+(a1*c1)));
                double r1=(a1+(a1*c1));

                if(b1>r1){
                    textView.setText(new DecimalFormat("your profit = ").format(res));
                }else{
                    textView.setText(new DecimalFormat("your loss = ").format(res));
                }


            }
        });

        btnreset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextbuying.setText("");
                editTextcomision.setText("");
                editTextselling.setText("");
                editTextquantity.setText("");
                textView.setText("");
            }
        });
    }
    }
