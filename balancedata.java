package com.example.administrator.myapplication;

import android.provider.BaseColumns;

/**
 * Created by Administrator on 4/10/2017.
 */

public class balancedata {
    public balancedata(){

    }
    public static abstract class table3Info implements BaseColumns {
        public static final String CARD_NO="number";

        public static final String AMOUNT="amount";
      //  public static final String TICKET_FROM="address";
       // public static final String TICKET_TYPE="age";
       // public static final String TICKET_RS="username";
        // public static final String _PASS="pass";
        public static final String DATABASE_NAME="balance_info";
        public static final String TABLE_BALANCE="add_balance";

    }
}
