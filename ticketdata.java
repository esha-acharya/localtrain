package com.example.administrator.myapplication;

import android.provider.BaseColumns;

/**
 * Created by Administrator on 4/10/2017.
 */

public class ticketdata {
    public ticketdata(){

    }
    public static abstract class table2Info implements BaseColumns {
        public static final String TICKET_ID="ID";

        public static final String TICKET_TO="to";
        public static final String TICKET_FROM="from";
        public static final String TICKET_TYPE="type";
        public static final String TICKET_RS="rs";
       // public static final String _PASS="pass";
        public static final String DATABASE_NAME="ticket_info";
        public static final String TABLE_NAME="ticket_details";

    }
}
