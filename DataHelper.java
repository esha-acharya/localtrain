 /*package com.example.administrator.myapplication;
  */

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.nfc.Tag;
import android.util.Log;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

//import static com.example.administrator.myapplication.tabledata.tableInfo.DATABASE_NAME;
//import static com.example.administrator.myapplication.tabledata.tableInfo.TABLE_NAME;

/**
 * Created by Administrator on 3/4/2017.
 */

/*public  class DataHelper extends SQLiteOpenHelper {
    public static final int database_version=1;
   // public String CREATE_QUERY3 = "CREATE TABLE "+balancedata.table3Info.TABLE_BALANCE +"("+ balancedata.table3Info.CARD_NO+" integer,"+ balancedata.table3Info.AMOUNT+" integer);";
 public String CREATE_QUERY2 = "CREATE TABLE "+ticketdata.table2Info.TABLE_NAME +"("+ ticketdata.table2Info.TICKET_ID+" integer,"+ ticketdata.table2Info.TICKET_TO+" text,"+ ticketdata.table2Info.TICKET_FROM+" text,"+ ticketdata.table2Info.TICKET_TYPE+" text,"+ ticketdata.table2Info.TICKET_RS+" integer);";
    public DataHelper(Context context) {
        super(context,ticketdata.table2Info.DATABASE_NAME,null,database_version );
        Log.d("database operations","Database created");
    }
    public void onCreate(SQLiteDatabase sdb)
    {
        // db.execSQL("create table "+TABLE_NAME+"(ID INTEGER PRIMARY KEY AUTOINCREMENT,name text not null,address text not null,age integer not null,username text not null,pass text not null,cardno string not null,amount string not null)");

        //db.execSQL("create table "+TABLE_BALANCE+"(ID INTEGER PRIMARY KEY AUTOINCREMENT,cardno integer not null,amount integer not null)");
        // db.execSQL(CREATE_TABLE_BALANCE);
        sdb.execSQL(CREATE_QUERY2);
        //  db.execSQL(CREATE_QUERY2);
        // db.execSQL(CREATE_QUERY3);

        Log.d("database operations","table created");
        // Log.d("database operations","ticket table created");


        // this.db=db;


    }
    @Override
    public void onUpgrade(SQLiteDatabase sqdb,int oldVersion,int newVersion)
    {

        String CREATE_QUERY3="DROP TABLE IF EXISTS USER_DETAILS";
        // String CREATE_QUERY3="DROP TABLE IF EXISTS add_balance";
        sqdb.execSQL(CREATE_QUERY3);
        // db.execSQL(CREATE_QUERY3);

        //  Log.w(Tag,
        //        "Upgrading the database from version " + oldVersion + "to" + newVersion);

        //   db.execSQL("DROP TABLE IF EXISTS"+TABLE_NAME);
        // db.execSQL("DROP TABLE IF EXISTS"+TABLE_BALANCE);

        this.onCreate(sqdb);
    }

    public void putTicketInfo(DataHelper datahelper,String ticketId,String tostation,String fromstation,String type,String rs)
    {
        SQLiteDatabase sqdb=datahelper.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(ticketdata.table2Info.TICKET_ID,ticketId);
        contentValues.put(ticketdata.table2Info.TICKET_TO,tostation);
        contentValues.put(ticketdata.table2Info.TICKET_FROM,fromstation);
        contentValues.put(ticketdata.table2Info.TICKET_TYPE,type);
        contentValues.put(ticketdata.table2Info.TICKET_RS,rs);
        //contentValues.put(ticketdata.table2Info.USER_PASS,pass);
        long k2= sqdb.insert(ticketdata.table2Info.TABLE_NAME,null,contentValues);
        Log.d("database operations","records inserted");

    }
  /*  public ArrayAdapter<String> getInfo()
    {
        ArrayAdapter<String> myAdapter=new ArrayAdapter<String>();
        SQLiteDatabase sqdb=this.getReadableDatabase();
        String selectQuery=" SELECT * FROM "+ticketdata.table2Info.TABLE_NAME;
        Cursor cursor=sqdb.rawQuery(selectQuery,null);
        if(cursor.moveToFirst()){
            String ticketId=cursor.getString(cursor.getColumnIndex(("ticketId")));
            String toStation=cursor.getString(cursor.getColumnIndex(("toStation")));
            String fromStation=cursor.getString(cursor.getColumnIndex(("fromStation")));
            String type=cursor.getString(cursor.getColumnIndex(("type")));
            String rs=cursor.getString(cursor.getColumnIndex(("rs")));
            myAdapter.add(ticketId);
            myAdapter.add(toStation);
            myAdapter.add(fromStation);
            myAdapter.add(type);
            myAdapter.add(rs);
            return myAdapter;

        }*/





