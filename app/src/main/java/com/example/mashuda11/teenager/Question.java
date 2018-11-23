package com.example.mashuda11.teenager;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Question extends Secondactivity {

    private ListView listView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question);

        listView1 =  findViewById(R.id.listView);
        final String[] teenagerquestion = getResources().getStringArray(R.array.Teenager_question);

        ArrayAdapter<String>  adapter = new ArrayAdapter<String>(Question.this, R.layout.sample_view,
                R.id.textView1,teenagerquestion);


        listView1.setAdapter(adapter);


        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String value = teenagerquestion[position];
                Toast.makeText(Question.this, value, Toast.LENGTH_LONG).show();
            }
        });

    }
}
