package com.example.vivekpratapsingh.vivek;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.sql.ResultSet;

public class MainActivity extends AppCompatActivity {
     TextView An;
     Button tv1,tv2,tv3;
     int Answer=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


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
                    it = new Intent(MainActivity.this,Linearlayout.class);
                    startActivity(it);
                }
            }
        };td.start();


        An=(TextView)findViewById(R.id.Answer);
         tv1=(Button)findViewById(R.id.Login);
         tv2=(Button)findViewById(R.id.Reset);
         tv3=(Button)findViewById(R.id.Back);

        tv1.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View v) {
                                       Answer++;
                                       An.setText("Result= "+Answer);

                                   }

                               });
         tv2.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                   public void onClick(View v) {
                                     Answer=0;
                                     An.setText("Reset ="+Answer);
                                    }
                               });
         tv3.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        Answer--;
                                        if(Answer>=0) {

                                            An.setText("Result="+Answer);


                                        }                                    }
                                });
        }
}


