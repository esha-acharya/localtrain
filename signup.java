package com.example.administrator.myapplication;

import android.app.Activity;

import android.content.ContentValues;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


/**
 * Created by Administrator on 3/1/2017.
 */

public class signup extends Activity {
    DatabaseHelper helper;

    EditText id, name, address, age, username, Pass1,Pass2;
    Button btnAddData;
    String user_id, user_name, user_address, user_age, user_username, user_Pass1,user_Pass2;
    Context ctx=this;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);

        helper = new DatabaseHelper(this);
        id = (EditText) findViewById(R.id.TFuserid);
        name = (EditText) findViewById(R.id.TFname);
        address = (EditText) findViewById(R.id.TFadd);
        age = (EditText) findViewById(R.id.TFage);
        username = (EditText) findViewById(R.id.TFuname);
        Pass1 = (EditText) findViewById(R.id.TFpass);
        Pass2 = (EditText) findViewById(R.id.TFrpass);
        btnAddData = (Button) findViewById(R.id.bsignup);
        //cardno = (EditText) findViewById(R.id.ETcard);


       // AddData();

   // }

  //  public void AddData() {
        btnAddData.setOnClickListener(new View.OnClickListener() {

                    @Override

                    public void onClick(View v) {
                       // boolean isInserted = helper.insertData(
                                user_id= id.getText().toString();

                                user_name= name.getText().toString();
                              user_address= address.getText().toString();
                                user_age=age.getText().toString();
                                user_username=username.getText().toString();
                                user_Pass1=Pass1.getText().toString();
                                user_Pass2=Pass2.getText().toString();
                       // cardno.getText().toString(),
                              //  cardno.getText().toString());
                        if(!(user_Pass1.equals(user_Pass2))){
                            Toast.makeText(getBaseContext(), "passwords are not matching", Toast.LENGTH_LONG).show();
                            //to clear username pass filed
                            username.setText("");
                            Pass1.setText("");
                            Pass2.setText("");
                        }
                        else{
                            DatabaseHelper helper=new DatabaseHelper(ctx);

                           helper.putInfo(helper,user_id,user_name,user_address,user_age,user_username,user_Pass1);
                            Toast.makeText(getBaseContext(), "Registered successfully", Toast.LENGTH_LONG).show();

                        }
                      //  if (isInserted = true)
                        //    Toast.makeText(signup.this, "Registered successfully", Toast.LENGTH_LONG).show();
                       // else
                           // Toast.makeText(signup.this, "Registered failed", Toast.LENGTH_LONG).show();
                    }
                }
        );
    }
}




