package com.example.user.zimmbertest;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvCircle;
    private List<Color> circle = new ArrayList<Color>();
    private CircleAdapater cAdapter;
    private int[] colors = new int[] { Color.parseColor("#F0F0F0"), Color.parseColor("#D2E4FC"),Color.parseColor() };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //prepareCircleItem();
        rvCircle = (RecyclerView)findViewById(R.id.rvCircle);
        cAdapter = new CircleAdapater(colors);
        LinearLayoutManager cLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        rvCircle.setLayoutManager(cLayoutManager);
        rvCircle.setItemAnimator(new DefaultItemAnimator());
        rvCircle.setAdapter(cAdapter);



    }

    private void prepareCircleItem() {
      /*  circle.add(new Color(Blu);
        circle.add();
        circle.add(R.color.blue);
        circle.add(R.color.brown);
        circle.add(R.color.darkBlue);*/
    }


}
