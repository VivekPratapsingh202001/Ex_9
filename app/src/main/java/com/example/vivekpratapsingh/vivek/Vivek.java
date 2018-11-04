package com.example.vivekpratapsingh.vivek;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Space;

public class Vivek extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vivek);

        Thread td=new Thread(){
            public void run()
            {
                try{

                    sleep(20000);

                }catch (Exception ex) {
ex.printStackTrace();
                }finally
                {
                    Intent it;
                    it = new Intent(Vivek.this,MainActivity.class);
                    startActivity(it);
                }
            }
        };td.start();
    }
}