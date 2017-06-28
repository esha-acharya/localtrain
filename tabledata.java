package com.example.administrator.myapplication;

import android.provider.BaseColumns;

/**
 * Created by Administrator on 4/9/2017.
 */

public class tabledata {
    public tabledata(){

    }
    public static abstract class tableInfo implements BaseColumns{
        public static final String USER_ID="ID";

        public static final String USER_NAME="name";
        public static final String USER_ADDRESS="address";
        public static final String USER_AGE="age";
        public static final String USER_USERNAME="username";
        public static final String USER_PASS="pass";
        public static final String DATABASE_NAME="user_info";
        public static final String TABLE_NAME="user_details";

    }
}
