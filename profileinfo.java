package com.example.administrator.myapplication;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Administrator on 4/10/2017.
 */

public class profileinfo extends menu {
    TextView name,add,age;
    EditText UserName;
    String username;
    DatabaseHelper helper;
    SQLiteDatabase db;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profileinfo);
        UserName=(EditText)findViewById(R.id.ETusername);
        name=(TextView) findViewById(R.id.TVname);
        add=(TextView) findViewById(R.id.TVadd);
        age=(TextView) findViewById(R.id.TVage);
        name.setVisibility(View.GONE);
        add.setVisibility(View.GONE);
        age.setVisibility(View.GONE);


       //username=(TextView) findViewById(R.id.TVusername);
}
public void onSearch(View view)
{
    username= UserName.getText().toString();
    DatabaseHelper helper=new DatabaseHelper(getApplicationContext());
    SQLiteDatabase db = helper.getReadableDatabase();
    Cursor cursor=helper.getContact(username,db);

    if(cursor.moveToFirst())
    {
        String Name=cursor.getString(0);
        String Address=cursor.getString(1);
        String Age=cursor.getString(2);
        name.setText(Name);
        add.setText(Address);
        age.setText(Age);
        name.setVisibility(View.VISIBLE);
        add.setVisibility(View.VISIBLE);
        age.setVisibility(View.VISIBLE);



    }


}
}
