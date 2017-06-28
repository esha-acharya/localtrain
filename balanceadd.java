package com.example.administrator.myapplication;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static android.R.attr.id;
import static android.R.attr.name;

/**
 * Created by Administrator on 4/5/2017.
 */

public class balanceadd extends menu {
    DBHelper Dhelper;
    EditText number, amt;
    Button baddData;
    String card_no,amount;
    Context context=this;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.balanceadd);

        Dhelper = new DBHelper(this);
        number = (EditText) findViewById(R.id.ETcard);
       amt = (EditText) findViewById(R.id.ETamount);
        baddData = (Button) findViewById(R.id.badd);
       // AddBal();
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.


    baddData.setOnClickListener(new View.OnClickListener()

    {

        @Override

        public void onClick(View v) {
            // boolean isInserted = helper.insertData(
            number.getText().toString();
            amt.getText().toString();
           //if(amount == null){

              //  Toast.makeText(getBaseContext(), "please insert amount", Toast.LENGTH_LONG).show();


          //  }
           // else{
                DBHelper Dhelper=new DBHelper(context);
                Dhelper.addBalance(Dhelper,card_no,amount);
                Toast.makeText(getBaseContext(), "balance inserted successfully", Toast.LENGTH_LONG).show();
           // }
    }

    }
    );
}
           // user_id= id.getText().toString();

           // user_name= name.getText().toString();
           // user_address= address.getText().toString();
           // user_age=age.getText().toString();
          //  user_username=username.getText().toString();
           // user_Pass1=Pass1.getText().toString();
           // user_Pass2=Pass2.getText().toString();
    /**public void AddBal() {
        badd.setOnClickListener(
                new View.OnClickListener() {

                    @Override

                    public void onClick(View v) {
                        boolean isInserted = helper.insertBal(
                                cardno.getText().toString(),
                                amount.getText().toString());
                        //age.getText().toString(),
                        // username.getText().toString(),
                        // Pass1.getText().toString());
                        if (isInserted = true)
                            Toast.makeText(balanceadd.this, "Balance Inserted successfully", Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(balanceadd.this, "Insert failed", Toast.LENGTH_LONG).show();

                    }
                }
        );
    }**/

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */

}