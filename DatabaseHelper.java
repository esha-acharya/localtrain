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

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final int database_version=1;
    public String CREATE_QUERY = "CREATE TABLE "+tabledata.tableInfo.TABLE_NAME +"("+ tabledata.tableInfo.USER_ID+" integer,"+ tabledata.tableInfo.USER_NAME+" text,"+ tabledata.tableInfo.USER_ADDRESS+" text,"+ tabledata.tableInfo.USER_AGE+" integer,"+ tabledata.tableInfo.USER_USERNAME+" text,"+ tabledata.tableInfo.USER_PASS+" text);";
  //  public String CREATE_QUERY2 = "CREATE TABLE "+ticketdata.table2Info.TABLE_NAME +"("+ ticketdata.table2Info.TICKET_ID+" integer,"+ ticketdata.table2Info.TICKET_TO+" text,"+ ticketdata.table2Info.TICKET_FROM+" text,"+ ticketdata.table2Info.TICKET_TYPE+" text,"+ ticketdata.table2Info.TICKET_RS+" integer);";
   // public String CREATE_QUERY3 = "CREATE TABLE "+balancedata.table3Info.TABLE_BALANCE +"("+ balancedata.table3Info.CARD_NO+" integer,"+ balancedata.table3Info.AMOUNT+" integer);";



    /**   public static final String Tag="DATABASEHELPER";
    public static final int DATABASE_VERSION=1;
    public static final String DATABASE_NAME="user.db";
    public static final String TABLE_NAME="user_table";

    public static final String COLOUMN_ID="ID";

    public static final String COLOUMN_NAME="name";
    public static final String COLOUMN_ADDRESS="address";
    public static final String COLOUMN_AGE="age";
    public static final String COLOUMN_USERNAME="username";
    public static final String COLOUMN_PASS="pass";
    public static final String TABLE_BALANCE="balance_table";
    public static final String COLOUMN_CARDNO="cardno";
    public static final String COLOUMN_AMOUNT="amount";


      int COLOUMN_NAME_INDEX=0;
    int COLOUMN_ADDRESS_INDEX=1;
    int COLOUMN_AGE_INDEX=2;
    int COLOUMN_USERNAME_INDEX=3;
    int COLOUMN_PASS_INDEX=4;
    int COLOUMN_CARDNO_INDEX=5;
    int COLOUMN_AMOUNT_INDEX=6; */
  //  SQLiteDatabase db;

  //  private static final String CREATE_TABLE_BALANCE = "CREATE TABLE " + TABLE_BALANCE
         //   + "( " + COLOUMN_CARDNO + " INTEGER, "
           // + COLOUMN_AMOUNT + " INTEGER " + ");";





    public DatabaseHelper(Context context)
    {
        super(context, tabledata.tableInfo.DATABASE_NAME,null,database_version);
        Log.d("database operations","Database created");

      //  this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db)
    {
       // db.execSQL("create table "+TABLE_NAME+"(ID INTEGER PRIMARY KEY AUTOINCREMENT,name text not null,address text not null,age integer not null,username text not null,pass text not null,cardno string not null,amount string not null)");

        //db.execSQL("create table "+TABLE_BALANCE+"(ID INTEGER PRIMARY KEY AUTOINCREMENT,cardno integer not null,amount integer not null)");
       // db.execSQL(CREATE_TABLE_BALANCE);
        db.execSQL(CREATE_QUERY);
      //  db.execSQL(CREATE_QUERY2);
       // db.execSQL(CREATE_QUERY3);

        Log.d("database operations","table created");
       // Log.d("database operations","ticket table created");


       // this.db=db;


    }
  /**  public boolean insertData(String name,String address,String age,String username,String pass)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(COLOUMN_NAME,name);
        contentValues.put(COLOUMN_ADDRESS,address);
        contentValues.put(COLOUMN_AGE,age);
        contentValues.put(COLOUMN_USERNAME,username);
        contentValues.put(COLOUMN_PASS,pass);
        //contentValues.put(COLOUMN_CARDNO,cardno);

        //contentValues.put(COLOUMN_AMOUNT,amount);



        long result= db.insert(TABLE_NAME,null,contentValues);
        if(result==-1)
            return false;
        else
            return true;
    }**/

  /**  public String searchPass(String username)
    {
        db=this.getReadableDatabase();
        String query="select * from"+TABLE_NAME;
        Cursor cursor=db.rawQuery(query,null);
        String a,b;
        b="not found";
        if(cursor.moveToFirst())
        {
            do{
                a=cursor.getString(COLOUMN_USERNAME_INDEX);
                b=cursor.getString(COLOUMN_PASS_INDEX);

                if(a.equals(username))
                {
                    b=cursor.getString(COLOUMN_PASS_INDEX);
                    break;
                }
            }
            while (cursor.moveToNext());
        }
    return b;
    } **/


   /** public boolean insertBal(String cardno,String amount)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(COLOUMN_CARDNO,cardno);
        contentValues.put(COLOUMN_AMOUNT,amount);
        db.insert(TABLE_BALANCE,null,contentValues);
        long result=db.insert(TABLE_BALANCE,null,contentValues);
        if(result==-1)
            return false;
        else
            return true;


    }*/
    @Override
    public void onUpgrade(SQLiteDatabase db,int oldVersion,int newVersion)
    {

        String CREATE_QUERY="DROP TABLE IF EXISTS USER_DETAILS";
       // String CREATE_QUERY3="DROP TABLE IF EXISTS add_balance";
        db.execSQL(CREATE_QUERY);
       // db.execSQL(CREATE_QUERY3);

        //  Log.w(Tag,
        //        "Upgrading the database from version " + oldVersion + "to" + newVersion);

     //   db.execSQL("DROP TABLE IF EXISTS"+TABLE_NAME);
       // db.execSQL("DROP TABLE IF EXISTS"+TABLE_BALANCE);

        this.onCreate(db);
    }

    public void putInfo(DatabaseHelper helper,String id,String name,String address,String age,String username,String pass)
    {
        SQLiteDatabase db=helper.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(tabledata.tableInfo.USER_ID,id);
        contentValues.put(tabledata.tableInfo.USER_NAME,name);
        contentValues.put(tabledata.tableInfo.USER_ADDRESS,address);
        contentValues.put(tabledata.tableInfo.USER_AGE,age);
        contentValues.put(tabledata.tableInfo.USER_USERNAME,username);
        contentValues.put(tabledata.tableInfo.USER_PASS,pass);
        long k= db.insert(tabledata.tableInfo.TABLE_NAME,null,contentValues);
        Log.d("database operations","records inserted");

    }
   /* public void putTicketInfo(DatabaseHelper helper,String ticketId,String tostation,String fromstation,String type,String rs)
    {
        SQLiteDatabase db=helper.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(ticketdata.table2Info.TICKET_ID,ticketId);
        contentValues.put(ticketdata.table2Info.TICKET_TO,tostation);
        contentValues.put(ticketdata.table2Info.TICKET_FROM,fromstation);
        contentValues.put(ticketdata.table2Info.TICKET_TYPE,type);
        contentValues.put(ticketdata.table2Info.TICKET_RS,rs);
        //contentValues.put(ticketdata.table2Info.USER_PASS,pass);
        long k2= db.insert(ticketdata.table2Info.TABLE_NAME,null,contentValues);
        Log.d("database operations","records inserted");

    }
    public void addBalance(DatabaseHelper helper,String number,String amount)
    {
        SQLiteDatabase db=helper.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(balancedata.table3Info.CARD_NO,number);
        contentValues.put(balancedata.table3Info.AMOUNT,amount);
       // contentValues.put(ticketdata.table2Info.TICKET_FROM,fromstation);
       // contentValues.put(ticketdata.table2Info.TICKET_TYPE,type);
       // contentValues.put(ticketdata.table2Info.TICKET_RS,rs);
        //contentValues.put(ticketdata.table2Info.USER_PASS,pass);
        long k3= db.insert(balancedata.table3Info.TABLE_BALANCE,null,contentValues);
        Log.d("database operations","records inserted");

    } */
    public Cursor getinformation(SQLiteDatabase db)
    {
        Cursor cursor;
        String[] projections={tabledata.tableInfo.USER_NAME,tabledata.tableInfo.USER_ADDRESS,tabledata.tableInfo.USER_AGE};
        cursor=db.query(tabledata.tableInfo.TABLE_NAME,projections,null,null,null,null,null);
        return cursor;

    }
    public Cursor getContact(String username,SQLiteDatabase db)
    {
        String[] projections={tabledata.tableInfo.USER_NAME,tabledata.tableInfo.USER_ADDRESS,tabledata.tableInfo.USER_AGE};
        String selection=tabledata.tableInfo.USER_USERNAME+" LIKE ?";
        String[] selection_args= {username};
        Cursor cursor=db.query(tabledata.tableInfo.TABLE_NAME,projections,selection,selection_args,null,null,null);
        return cursor;

    }
     /**   public ArrayList<String> getAllProvinces(){
            ArrayList<String> List=new ArrayList<String>();
            SQLiteDatabase db=this.getReadableDatabase();
            db.beginTransaction();
            String selectQuery=" SELECT * FROM "
        }**/
   // public DatabaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory,int version){
     //   super(context,DATABASE_NAME,factory,DATABASE_VERSION);
   // }

}
