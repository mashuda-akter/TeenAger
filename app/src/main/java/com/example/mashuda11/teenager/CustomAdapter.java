package com.example.mashuda11.teenager;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {

    private static final View  imageView = null;
    
    private static final int[] TeenagerGuidelines = new int[0];
    int[] picture;
String[] guidelines;
Context context;
private LayoutInflater inflater;

CustomAdapter(Context context,String[] guidelines,int[]picture){

    this.context = context;
    this.guidelines = guidelines;
    this.picture = picture;
}


    @Override
    public int getCount() {
        return guidelines.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


    if(convertView==null) {


        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        convertView = inflater.inflate(R.layout.habit_sample_view, parent, false);


        }

        View imageView = convertView.findViewById(R.id.imageView1);

        TextView textView = convertView.findViewById(R.id.TeenagerGuidelines);
      //  ImageView imageView;

       // imageView.setImageResource(imageView[position]);
     //   textView.setText(TeenagerGuidelines[position]);
        return convertView;
    }
}
