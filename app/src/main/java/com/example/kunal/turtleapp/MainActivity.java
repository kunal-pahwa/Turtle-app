package com.example.kunal.turtleapp;

import android.support.annotation.DrawableRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void radioclick(View view) {
        int id=view.getId();
        ImageView imgv;
        imgv=(ImageView) findViewById(R.id.image);
        if(id==R.id.Mike){
            imgv.setImageResource(R.drawable.mike);
        }
        if(id==R.id.Leo){
            imgv.setImageResource(R.drawable.leo);
        }
        if(id==R.id.Don){
            imgv.setImageResource(R.drawable.don);
        }
        if(id==R.id.Raph){
            imgv.setImageResource(R.drawable.raph);
        }
    }
}
