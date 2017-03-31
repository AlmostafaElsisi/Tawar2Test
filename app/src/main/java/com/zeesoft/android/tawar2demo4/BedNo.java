package com.zeesoft.android.tawar2demo4;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class BedNo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bed_no);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public int AvaliableBedNO=5;

    public void increment(View view){
        AvaliableBedNO=AvaliableBedNO+1;
        displayBedNo(AvaliableBedNO);
    }
    public void decrement(View view){
        AvaliableBedNO=AvaliableBedNO-1;
        if(AvaliableBedNO < 0)
            AvaliableBedNO=0;
        displayBedNo(AvaliableBedNO);
    }
    public void displayBedNo(int no){
        TextView AvaliableBedNO_textview = (TextView) findViewById(R.id.AvaliableBedNO_textview);
        AvaliableBedNO_textview.setText(""+no);
    }


}
