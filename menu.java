package com.example.administrator.myapplication;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Administrator on 3/1/2017.
 */

public class menu extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
        String username = getIntent().getStringExtra("username");
        TextView tv = (TextView)findViewById(R.id.TVusername);
        tv.setText(username);
    }


    public void onClickButton(View v) {
        if (v.getId() == R.id.Bbookticket) {
            Intent i = new Intent(menu.this, ticketbook.class);
            startActivity(i);
        }

    }
    public void onClickAddBal(View v) {
        if (v.getId() == R.id.Bbalance) {
            Intent i = new Intent(menu.this, balanceadd.class);
            startActivity(i);
        }

    }
   // public void onClickViewticket(View v){
     //   if(v.getId()==R.id.Bviewticket){
       //     Intent i = new Intent(menu.this, ticketview.class);
         //   startActivity(i);
       // }
   // }
    public void onClickProfileButton(View v){
        if(v.getId()==R.id.Bprofile){
            Intent i = new Intent(menu.this, profileinfo.class);
            startActivity(i);
        }
    }

    public void clickExit(View v)
    {
        finish();
    }
   // @Override
   /* public void onBackPressed(){
        AlertDialog.Builder builder=new AlertDialog.Builder(menu.this);
        builder.setMessage("Do you want to exist:");
        builder.setCancelable(true);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int id) {
                finish();

            }
        });
        builder.setNegativeButton("Cancle", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int id) {
                dialog.cancel();
            }
        });
        AlertDialog alert=builder.create();
        alert.show();
    }*/
}
