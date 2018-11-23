package com.example.mashuda11.teenager;

import android.os.Bundle;
import android.widget.ListView;

public class Guidelines extends Secondactivity {

    private ListView listView;
    private  String[] guidelines;

    private int[] picture = {R.drawable.gp1,R.drawable.gs2,R.drawable.hm3,R.drawable.sb4,R.drawable.ln5,R.drawable.sn6};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.guidelines);

        String[] guidelines = getResources().getStringArray(R.array.Teenager_guidelines);

        ListView listView = (ListView) findViewById(R.id.listView1);

        CustomAdapter adapter = new CustomAdapter(this,guidelines,picture);

        listView.setAdapter(adapter);


    }
}
