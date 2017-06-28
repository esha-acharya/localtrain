package com.example.administrator.myapplication;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Administrator on 4/7/2017.
 */

public class ticketview extends menu {
    //  DataHelper dataHelper;
    Spinner spFirst, spSecond, spThird, spFour;
    RadioButton rsingle;
    RadioButton rreturn;
    Button Baddinfo;
    String sp2, sp3, single, ret, ticketid;
    Context context = this;
    EditText TFticketid;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ticketview);
        spSecond = (Spinner) findViewById(R.id.spSecond);
        spThird = (Spinner) findViewById(R.id.spThird);
        rsingle = (RadioButton) findViewById(R.id.rsingle);
        rreturn = (RadioButton) findViewById(R.id.rreturn);
        Baddinfo = (Button) findViewById(R.id.bsearch);
        final EditText TFticketid = (EditText) findViewById(R.id.TFticketid);

      /*  Baddinfo.setOnClickListener(new View.OnClickListener()

                                 {

                                     @Override

                                     public void onClick(View v) {
                                         // boolean isInserted = helper.insertData(
                                         ticketid= TFticketid.getText().toString();

                                         sp2=  spSecond.getSelectedItem().toString();
                                         sp3= spThird.getSelectedItem().toString();

                                         //  rsingle.getText().toStirng();
                                         Integer id = rsingle.getId();
                                         single = id.toString();
                                         Integer id2 = rreturn.getId();
                                         ret = id2.toString();
                                         //if(amount == null){

                                         //  Toast.makeText(getBaseContext(), "please insert amount", Toast.LENGTH_LONG).show();


                                         //  }
                                         // else{
                                         DataHelper datahelper=new DataHelper(context);
                                         datahelper.putTicketInfo(datahelper, ticketid,sp2,sp3,single,ret);
                                         Toast.makeText(getBaseContext(), "balance inserted successfully", Toast.LENGTH_LONG).show();
                                         // }
                                     }

                                 }
        );*/


    }

    public void onClickAddBal(View v) {
        if (v.getId() == R.id.Bbalance) {
            Intent i = new Intent(ticketview.this, ticketinfo.class);
            startActivity(i);
        }
    }

    public void onClick(View v) {
        if (v.getId() == R.id.bviewticket) {
            //   int number;
            EditText a = (EditText) findViewById(R.id.TFticketid);
            String str = a.getText().toString();
            // Spinner  spSecond,spThird;
            // if(view.getId()==R.id.Bbook){
            // spSecond = (Spinner) findViewById(R.id.spSecond);
            // spThird = (Spinner) findViewById(R.id.spThird);
            // Spinner sp = (Spinner) findViewById(R.id.spSecond);
            // String name = spSecond.getSelectedItem().toString();
            //String name2 = spThird.getSelectedItem().toString();
            // String strsp = spSecond.getSelectedItem().toString();

            //   Spinner sp2 = (Spinner) findViewById(R.id.spThird);
            // String strsp2 = sp2.getSelectedItem().toString();


            // TextView myText=(TextView)findViewById(R.id.TVrandom);
            // String mystring=String.valueOf(number);
            //  String str = myText.getText().toString();

            Intent i = new Intent(ticketview.this, ticketinfo.class);
            i.putExtra("ticketid", str);
            //i.putExtra("tostation",name);
            //i.putExtra("fromstation",name2);


            startActivity(i);
               }
    }


    }
