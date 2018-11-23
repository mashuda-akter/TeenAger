package com.example.mashuda11.teenager;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;


public class Secondactivity extends Activity {

Button button1;
Button button2;
Button button3;
Button button4;
Button button5;
Button button6;
Button button7;
Button previous;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);

        button1 = (Button)findViewById(R.id.btnHome1);
        button2 = (Button)findViewById(R.id.btnchange2);

        button3 = (Button)findViewById(R.id.btnProblem3);
        button4 = (Button)findViewById(R.id.btnGuid4);
        button5 = (Button)findViewById(R.id.btnSugg5);
        button6 = (Button)findViewById(R.id.btnDep6);
        button7 = (Button)findViewById(R.id.btnEnter7);
        previous = (Button)findViewById(R.id.btnPre8);



        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Secondactivity.this,Question.class);
                startActivity(intent);



            }
        });


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(Secondactivity.this,Change.class);
                startActivity(intent2);



            }
        });





        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Secondactivity.this,Problems.class);
                startActivity(intent);



            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Secondactivity.this,Guidelines.class);
                startActivity(intent);



            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Secondactivity.this,Suggestion.class);
                startActivity(intent);



            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Secondactivity.this,Depration.class);
                startActivity(intent);



            }
        });


        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Secondactivity.this,MainActivvity1.class);
                startActivity(intent);



            }
        });



    }




    }


