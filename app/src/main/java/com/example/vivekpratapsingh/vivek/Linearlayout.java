package com.example.vivekpratapsingh.vivek;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Linearlayout extends AppCompatActivity {
    EditText edtfirst, edtsecond;
    Button btnadd, btnsub, btnmul, btndiv;
    TextView Answer, tvresult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.linearlayout);

        edtfirst = (EditText) findViewById(R.id.edtfirst);
        edtsecond = (EditText) findViewById(R.id.edtsecond);

        btnadd = (Button) findViewById(R.id.btnadd);
        btnsub = (Button) findViewById(R.id.btnsub);
        btnmul = (Button) findViewById(R.id.btnmul);
        btndiv = (Button) findViewById(R.id.btndiv);

        Answer = (TextView) findViewById(R.id.Answer);

        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int first, second, result;
                first = Integer.valueOf(edtfirst.getText().toString());
                second = Integer.valueOf(edtsecond.getText().toString());
                result = first + second;
                Answer.setText("Addtion  ="+result);
            }
        });

        btnsub .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int first, second, result;
                first = Integer.valueOf(edtfirst.getText().toString());
                second = Integer.valueOf(edtsecond.getText().toString());
                result = first - second;
                Answer.setText("subtruction ="+result);
            }
        });
        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int first, second, result;
                first = Integer.valueOf(edtfirst.getText().toString());
                second = Integer.valueOf(edtsecond.getText().toString());
                result = first * second;
                Answer.setText("Mulltiplication ="+result);
            }
        });

        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double first, second, result;
                first = Integer.valueOf(edtfirst.getText().toString());
                second = Integer.valueOf(edtsecond.getText().toString());
                result = first / second;
                Answer.setText("divided ="+result);
            }
        });

    }
}