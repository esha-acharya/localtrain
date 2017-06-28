package com.example.administrator.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.text.*;
import android.util.*;
import android.widget.Toast;

import java.util.Random;

import static android.R.attr.checked;
import static android.R.attr.max;
import static android.R.attr.text;


/**
 * Created by Administrator on 3/4/2017.
 */

public class ticketbook extends menu {
    Spinner spFirst, spSecond, spThird, spFour;
    RadioGroup rg;
    RadioButton rb;
    RadioGroup rg1;
    RadioButton rb1;
    RadioButton rsingle;
    RadioButton rreturn;
    RadioButton ayes;
    RadioButton cyes;
    TextView totalprice;
    TextView TVrandom;
    TextView TVrs;
   // Button Bbook;
   // String sp2,sp3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ticketbook);
        spFirst = (Spinner) findViewById(R.id.spFirst);
       // spSecond = (Spinner) findViewById(R.id.spSecond);
       // spThird = (Spinner) findViewById(R.id.spThird);



        spFirst.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                              @Override
                                              public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                  String name = spFirst.getSelectedItem().toString();

                                                  spSecond = (Spinner) findViewById(R.id.spSecond);
                                                  spThird = (Spinner) findViewById(R.id.spThird);
                                                  int idSpinner = getResources().getIdentifier(name, "array", ticketbook.this.getPackageName());

                                                  // create the array adapter
                                                  ArrayAdapter<String> myAdapter = new
                                                          ArrayAdapter<String>(ticketbook.this,
                                                          android.R.layout.simple_spinner_dropdown_item,
                                                          getResources().getStringArray(idSpinner));
                                                  spSecond.setAdapter(myAdapter);
                                                  spThird.setAdapter(myAdapter);

                                                //  String selected = parent.getItemAtPosition(position).toString();


                                              }


                                              @Override
                                              public void onNothingSelected(AdapterView<?> parent) {

                                              }
                                          }

        );
       /* spThird.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                              @Override
                                              public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                  String name = spThird.getSelectedItem().toString();


                                                  // create the array adapter
                                                  ArrayAdapter<String> myAdapter = new
                                                          ArrayAdapter<String>(ticketbook.this,
                                                          android.R.layout.simple_list_item_1,
                                                          getResources().getStringArray(R.array.lines));
                                                  myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                                                  spFour.setAdapter(myAdapter);
                                              }

                                              @Override
                                              public void onNothingSelected(AdapterView<?> parent) {

                                              }
                                          }

        ); */
        /* spThird = (Spinner) findViewById(R.id.spThird);
        ArrayAdapter<String> myAdapter = new
                ArrayAdapter<String>(ticketbook.this,
                android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.lines));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spThird.setAdapter(myAdapter);

        spFour = (Spinner) findViewById(R.id.spThird);
        ArrayAdapter<String> myAdapter1 = new
                ArrayAdapter<String>(ticketbook.this,
                android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.lines));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spFour.setAdapter(myAdapter1); */
    rg=(RadioGroup) findViewById(R.id.rgrup);
        rg1=(RadioGroup) findViewById(R.id.rgrup02);
    rsingle=(RadioButton) findViewById(R.id.rsingle);
        rreturn=(RadioButton) findViewById(R.id.rreturn);
        ayes=(RadioButton) findViewById(R.id.ayes);
        cyes=(RadioButton) findViewById(R.id.cyes);
        totalprice=(TextView) findViewById(R.id.totalprice);
        TVrs=(TextView) findViewById(R.id.TVrs);





    }
    public void rbclick(View v)
    {
        int radiobuttonid= rg.getCheckedRadioButtonId();
        rb =(RadioButton) findViewById(radiobuttonid);

    }
    public void rbclick2(View v)
    {
        int radiobuttonid= rg1.getCheckedRadioButtonId();
        rb1 =(RadioButton) findViewById(radiobuttonid);
    }

    public void onClick(View v)
    {
        int tax=2;
        int milesk8=3;
        int milesk12=8;
        int totalcost;
        String selec=spSecond.getSelectedItem().toString();
        String selec2=spThird.getSelectedItem().toString();

        if ((rsingle.isChecked()==true) && (ayes.isChecked()==true) &&(selec.equals("CST")) &&(selec2.equals("Masjid"))||(selec2.equals("Sandhurst Road"))||(selec2.equals("Byculla"))||(selec2.equals("Chinchpokli"))||(selec2.equals("Currey Road"))||(selec2.equals("Parel"))||(selec2.equals("Dadar")))

        {
            totalcost=tax+milesk8;
            //String stax=String.format("%.2f",totalcost);
            //String total=String.format("%.2f",milesk8+totalcost);
            String total=String.valueOf(totalcost);

            TVrs.setText(total);


        }
         if ((rsingle.isChecked()==true) && (ayes.isChecked()==true) &&(selec.equals("CST")) &&(selec2.equals("Matunga")) ||(selec2.equals("Sion"))||(selec2.equals("Kurla"))||(selec2.equals("Vidyavihar"))||(selec2.equals("Ghatkoper"))||(selec2.equals("Vikhroli"))||(selec2.equals("Kanjurmarg")))
        {

            totalcost=tax+milesk12;
            //String stax=String.format("%.2f",totalcost);
            //String total=String.format("%.2f",milesk8+totalcost);
            String total=String.valueOf(totalcost);

            TVrs.setText(total);


        }
        if ((rreturn.isChecked()==true) && (ayes.isChecked()==true) &&(selec.equals("CST")) &&(selec2.equals("Masjid"))) {
            totalcost=(tax+milesk8)*2;
            //String stax=String.format("%.2f",totalcost);
            //String total=String.format("%.2f",milesk8+totalcost);
            String total=String.valueOf(totalcost);

            TVrs.setText(total);


        }
        if ((rreturn.isChecked()==true) && (ayes.isChecked()==true) &&(selec.equals("CST")) &&(selec2.equals("Matunga")) ){
            totalcost=(tax+milesk12)*2;
            //String stax=String.format("%.2f",totalcost);
            //String total=String.format("%.2f",milesk8+totalcost);
            String total=String.valueOf(totalcost);

            TVrs.setText(total);


        }
        if ((rsingle.isChecked()==true) && (cyes.isChecked()==true) &&(selec.equals("CST")) &&(selec2.equals("Masjid")) ){
            totalcost=(tax+milesk8)-2;
            //String stax=String.format("%.2f",totalcost);
            //String total=String.format("%.2f",milesk8+totalcost);
            String total=String.valueOf(totalcost);

            TVrs.setText(total);


        }
        if ((rsingle.isChecked()==true) && (cyes.isChecked()==true) &&(selec.equals("CST")) &&(selec2.equals("Matunga"))){
            totalcost=(18-(tax+milesk12));
            //String stax=String.format("%.2f",totalcost);
            //String total=String.format("%.2f",milesk8+totalcost);
            String total=String.valueOf(totalcost);

            TVrs.setText(total);


        }
        if ((rreturn.isChecked()==true) && (cyes.isChecked()==true) &&(selec.equals("CST")) &&(selec2.equals("Masjid")) ){
            totalcost=(18-((tax+milesk8)*2));
            //String stax=String.format("%.2f",totalcost);
            //String total=String.format("%.2f",milesk8+totalcost);
            String total=String.valueOf(totalcost);

            TVrs.setText(total);


        }
        if ((rreturn.isChecked()==true) && (cyes.isChecked()==true) &&(selec.equals("CST")) &&(selec2.equals("Matunga")) ){
            totalcost=(((tax+milesk12)*2)-2);
            //String stax=String.format("%.2f",totalcost);
            //String total=String.format("%.2f",milesk8+totalcost);
            String total=String.valueOf(totalcost);

            TVrs.setText(total);


        }
    }

    public void ticketid(View view)
    {
        Random rand=new Random();
        int number=rand.nextInt(100)+1;
        TextView myText=(TextView)findViewById(R.id.TVrandom);
        String mystring=String.valueOf(number);
        myText.setText("Ticket booked succssfully, Ticket id is " +mystring);





    }
    public void onClickViewTicket(View v)
    {
        if (v.getId() == R.id.BVticket) {

            Spinner spSecond = (Spinner) findViewById(R.id.spSecond);
             String name = spSecond.getSelectedItem().toString();
            Spinner spThird = (Spinner) findViewById(R.id.spThird);
          String name2 = spThird.getSelectedItem().toString();
            TextView TVrs=(TextView)findViewById(R.id.TVrs);
            String name5=TVrs.getText().toString();

          //  RadioButton rb=(RadioButton)findViewById(R.id.rsingle);
           // String name3=rb.
           // String str; // store the text corresponding to  the RadioButton which is clicked
           // boolean checked = ((RadioButton) v).isChecked();


         //   Intent intent = new Intent(this, .class);
           // intent.putExtra("radioChosen", str);

            //final TextView tv = (TextView)findViewById(R.id.single);
           // boolean checked = ((RadioButton) v).isChecked();

                    Intent intent = new Intent(ticketbook.this,ticketinfo.class);
            int radiobuttonid= rg.getCheckedRadioButtonId();
            rb =(RadioButton) findViewById(radiobuttonid);
                   // RadioButton checkedRadioButton = (RadioButton) findViewById(checkedId);
                    String name3 = rsingle.getText().toString();
                    String name4=rreturn.getText().toString();
                    //Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT).show();
                    intent.putExtra("type",name3);
            intent.putExtra("type2",name4);


           // rg=(RadioGroup) findViewById(R.id.rgrup);
           // rg1=(RadioGroup) findViewById(R.id.rgrup02);
          //  rsingle=(RadioButton) findViewById(checkedId);
            rreturn=(RadioButton) findViewById(R.id.rreturn);


           // Intent intent = new Intent(ticketbook.this,ticketinfo.class);

            intent.putExtra("tostation", name);

            intent.putExtra("fromstation", name2);
            intent.putExtra("rs",name5);



            startActivity(intent);





        }


    }




}

       // spSecond.setAdapter((myadapter));


      /*  //create a string array
        String[] myStringArray={"Central","Western","Harbour"};
        String[] Central={"kanjur","thane"};
        String[] Harbour={"wadala","chembur"};



        //associate the array adapter with list view

       Spinner myList=
                (Spinner) findViewById(R.id.array_List1);
        Spinner myList2=
                (Spinner) findViewById(R.id.array_List2);
        myList.setAdapter((myadapter));

        myList.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            public void onItemSelected(AdapterView<?> parent, View view,int position,long id){
           String name=myStringArray.getSelectedItem().toString();
                int idSpinner=getResources().getIdentifier(name,"array",ticketbook.this.getPackageName());
                // create the array adapter
                ArrayAdapter<String> myadapter = new
                        ArrayAdapter<String>(this,
                        android.R.layout.simple_list_item_1,
                        myStringArray);


            }
        }); */
