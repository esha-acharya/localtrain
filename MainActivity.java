package com.example.administrator.myapplication;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

//DatabaseHelper helper=new DatabaseHelper(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


   public void onButtonClick(View v) {
       if (v.getId() == R.id.bsubmit) {
           EditText a = (EditText) findViewById(R.id.TFusername);
           String str = a.getText().toString();
           EditText b = (EditText) findViewById(R.id.TFpassword);
           String pass = b.getText().toString();

        //   String password = helper.searchPass(str);
         //  if (pass.equals(password)) {
               Intent i = new Intent(MainActivity.this, menu.class);
               i.putExtra("username", str);
               startActivity(i);
           }
       /** else {
               Toast temp = Toast.makeText(MainActivity.this, "Username and password dont match ", Toast.LENGTH_SHORT);
               temp.show();
           } **/



       if (v.getId() == R.id.Bsignup) {
           Intent i = new Intent(MainActivity.this, signup.class);
           startActivity(i);
       }
   }


    public void onButttonClickBook(View v) {
        if (v.getId() == R.id.Bbookticket) {
            Intent i = new Intent(MainActivity.this, ticketbook.class);
            startActivity(i);
        }

    }
    public void onBackPressed(){
        AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
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
    }
}
