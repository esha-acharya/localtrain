package com.example.administrator.myapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.nfc.Tag;
import android.util.Log;

import java.util.ArrayList;

//import static com.example.administrator.myapplication.tabledata.tableInfo.DATABASE_NAME;
//import static com.example.administrator.myapplication.tabledata.tableInfo.TABLE_NAME;

/**
 * Created by Administrator on 3/4/2017.
 */

public  class DBHelper extends SQLiteOpenHelper {
    public static final int database_version=1;
    public String CREATE_QUERY3 = "CREATE TABLE "+balancedata.table3Info.TABLE_BALANCE +"("+ balancedata.table3Info.CARD_NO+" integer,"+ balancedata.table3Info.AMOUNT+" integer);";

    public DBHelper(Context context) {
        super(context,balancedata.table3Info.DATABASE_NAME,null,database_version );
        Log.d("database operations","Database created");
    }
    public void onCreate(SQLiteDatabase sdb)
    {
        // db.execSQL("create table "+TABLE_NAME+"(ID INTEGER PRIMARY KEY AUTOINCREMENT,name text not null,address text not null,age integer not null,username text not null,pass text not null,cardno string not null,amount string not null)");

        //db.execSQL("create table "+TABLE_BALANCE+"(ID INTEGER PRIMARY KEY AUTOINCREMENT,cardno integer not null,amount integer not null)");
        // db.execSQL(CREATE_TABLE_BALANCE);
        sdb.execSQL(CREATE_QUERY3);
        //  db.execSQL(CREATE_QUERY2);
        // db.execSQL(CREATE_QUERY3);

        Log.d("database operations","table created");
        // Log.d("database operations","ticket table created");


        // this.db=db;


    }
    @Override
    public void onUpgrade(SQLiteDatabase sdb,int oldVersion,int newVersion)
    {

        String CREATE_QUERY3="DROP TABLE IF EXISTS USER_DETAILS";
        // String CREATE_QUERY3="DROP TABLE IF EXISTS add_balance";
        sdb.execSQL(CREATE_QUERY3);
        // db.execSQL(CREATE_QUERY3);

        //  Log.w(Tag,
        //        "Upgrading the database from version " + oldVersion + "to" + newVersion);

        //   db.execSQL("DROP TABLE IF EXISTS"+TABLE_NAME);
        // db.execSQL("DROP TABLE IF EXISTS"+TABLE_BALANCE);

        this.onCreate(sdb);
    }

    public void addBalance(DBHelper Dhelper,String number,String amount)
    {
        SQLiteDatabase sdb=Dhelper.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(balancedata.table3Info.CARD_NO,number);
        contentValues.put(balancedata.table3Info.AMOUNT,amount);
        // contentValues.put(ticketdata.table2Info.TICKET_FROM,fromstation);
        // contentValues.put(ticketdata.table2Info.TICKET_TYPE,type);
        // contentValues.put(ticketdata.table2Info.TICKET_RS,rs);
        //contentValues.put(ticketdata.table2Info.USER_PASS,pass);
        long k3= sdb.insert(balancedata.table3Info.TABLE_BALANCE,null,contentValues);
        Log.d("database operations","records inserted");

    }

}

