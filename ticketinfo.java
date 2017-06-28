package com.example.administrator.myapplication;

import android.os.Bundle;
import android.widget.Spinner;
import android.widget.TextView;

/**
 * Created by Administrator on 4/7/2017.
 */

public class ticketinfo extends ticketbook {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ticketinfo);
      //  String ticketid = getIntent().getStringExtra("ticketid");
     //   String tostation = getIntent().getStringExtra("tostation");
       // String fromstation = getIntent().getStringExtra("fromstation");
       // TextView tv = (TextView)findViewById(R.id.TVticketid);
       // TextView tv2 = (TextView)findViewById(R.id.TVtostation);
        //TextView tv3 = (TextView)findViewById(R.id.TVfromstation);
       // Spinner sp=(Spinner) findViewById (R.id.TVtostation);
       // tv.setText(ticketid);
        //tv2.setText(tostation);
        //tv3.setText(fromstation);

        String tostation=getIntent().getStringExtra("tostation");
        TextView tv2=(TextView)findViewById(R.id.TVtostation);
        tv2.setText(tostation);


        String fromstation=getIntent().getStringExtra("fromstation");
        TextView tv3=(TextView)findViewById(R.id.from);
        tv3.setText(fromstation);

        String type=getIntent().getStringExtra("type");
        TextView tv4=(TextView) findViewById(R.id.single);
        tv4.setText(type);

        String type2=getIntent().getStringExtra("type2");
        tv4=(TextView) findViewById(R.id.single);
        tv4.setText(type2);

        String rs=getIntent().getStringExtra("rs");
        TextView tv6=(TextView)findViewById(R.id.RS);
        tv6.setText(rs);


    }
    }


