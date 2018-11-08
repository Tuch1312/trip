package com.quattroventi.trip.Core.Servizio.persistence;

import android.content.ContentValues;
import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

public abstract class GenericAdapter {

    protected SQLiteDatabase database;
    protected DbHelper dbHelper;
    protected Context context;


    protected GenericAdapter(Context context) {
        this.context = context;
    }

    protected void open() throws SQLException {
        dbHelper = new DbHelper(context);
        database = dbHelper.getWritableDatabase();
        ContentValues c = new ContentValues();

    }

    protected void close() {
        dbHelper.close();
        database.close();
    }


}
