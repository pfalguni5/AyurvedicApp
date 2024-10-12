package com.example.ayurvedicapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;



import java.util.ArrayList;

public class DBhelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME="Dosha";
    private static final int DATABASE_VERSION=1;
    private static final String Table_vatainfo="vattaInfo";
    private static final String Key_info="Info";
    private static final String Table_pittainfo="pittaInfo";
    private static final String Key_pitta="Pittainfo";

    private static final String Table_kapha="kaphaInfo";

    private static final String Key_kapha="Kaphainfo";




    public DBhelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " + Table_vatainfo + "(" + Key_info + " TEXT)" );
        db.execSQL("CREATE TABLE " + Table_pittainfo + "(" + Key_pitta + " TEXT)" );
        db.execSQL("CREATE TABLE " + Table_kapha + "(" + Key_kapha + " TEXT)" );


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + Table_vatainfo);
        db.execSQL("DROP TABLE IF EXISTS " + Table_pittainfo);
        db.execSQL("DROP TABLE IF EXISTS " + Table_kapha);

        onCreate(db);

    }

    public boolean isDataExistvatinfo(String Vatinfo) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursorinfo = db.rawQuery("SELECT * FROM " + Table_vatainfo + " WHERE " + Key_info + "=?", new String[]{Vatinfo});
        boolean existinfo = (cursorinfo.getCount() > 0);
        cursorinfo.close();
        return existinfo;
    }

    public boolean isDataExistpittainfo(String Pittainfo) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursorpitta = db.rawQuery("SELECT * FROM " + Table_pittainfo + " WHERE " + Key_pitta + "=?", new String[]{Pittainfo});
        boolean existpitta = (cursorpitta.getCount() > 0);
        cursorpitta.close();
        return existpitta;
    }

    public boolean isDataExistkaphainfo(String Kaphainfo) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursorkapha = db.rawQuery("SELECT * FROM " + Table_kapha + " WHERE " + Key_kapha + "=?", new String[]{Kaphainfo});
        boolean existkapha = (cursorkapha.getCount() > 0);
        cursorkapha.close();
        return existkapha;
    }


    public void addDatainfo(String Vatinfo){
        SQLiteDatabase dbinfo=this.getWritableDatabase();

        ContentValues valuesinfo=new ContentValues();
        valuesinfo.put(Key_info,Vatinfo);


        dbinfo.insert(Table_vatainfo, null, valuesinfo);
        dbinfo.close();

    }

    public void addDatapittainfo(String pittainfo){
        SQLiteDatabase dbpitta=this.getWritableDatabase();

        ContentValues valuespitta=new ContentValues();
        valuespitta.put(Key_pitta,pittainfo);


        dbpitta.insert(Table_pittainfo, null, valuespitta);
        dbpitta.close();

    }

    public void addDatakaphainfo(String pittainfo){
        SQLiteDatabase dbkapha=this.getWritableDatabase();

        ContentValues valueskapha=new ContentValues();
        valueskapha.put(Key_kapha,pittainfo);


        dbkapha.insert(Table_kapha, null, valueskapha);
        dbkapha.close();

    }


    public ArrayList<Symptomodel> fetchdatinfo(){
        SQLiteDatabase db=this.getReadableDatabase();
        Cursor cursorinfo = db.rawQuery("SELECT * FROM "+Table_vatainfo,null);
        ArrayList<Symptomodel> arrinfo=new ArrayList<>();
        if (cursorinfo != null && cursorinfo.moveToFirst()) {
            do {
                Symptomodel model = new Symptomodel();
                model.Info = cursorinfo.getString(0); // Ensure column index is correct
                arrinfo.add(model);
            } while (cursorinfo.moveToNext());
        }

        assert cursorinfo != null;
        cursorinfo.close(); // Don't forget to close the cursor
        db.close(); // Close the database
        return arrinfo;
    }

    public ArrayList<Symptomodel> fetchdatpittainfo(){
        SQLiteDatabase db=this.getReadableDatabase();
        Cursor cursorpitta = db.rawQuery("SELECT * FROM "+Table_pittainfo,null);
        ArrayList<Symptomodel> arrpitta=new ArrayList<>();
        if (cursorpitta != null && cursorpitta.moveToFirst()) {
            do {
                Symptomodel model = new Symptomodel();
                model.Pitta = cursorpitta.getString(0); // Ensure column index is correct
                arrpitta.add(model);
            } while (cursorpitta.moveToNext());
        }

        assert cursorpitta != null;
        cursorpitta.close(); // Don't forget to close the cursor
        db.close(); // Close the database
        return arrpitta;
    }

    public ArrayList<Symptomodel> fetchdatkaphainfo(){
        SQLiteDatabase db=this.getReadableDatabase();
        Cursor cursorkapha = db.rawQuery("SELECT * FROM "+Table_kapha,null);
        ArrayList<Symptomodel> arrkapha=new ArrayList<>();
        if (cursorkapha != null && cursorkapha.moveToFirst()) {
            do {
                Symptomodel model = new Symptomodel();
                model.Kapha = cursorkapha.getString(0); // Ensure column index is correct
                arrkapha.add(model);
            } while (cursorkapha.moveToNext());
        }

        assert cursorkapha != null;
        cursorkapha.close(); // Don't forget to close the cursor
        db.close(); // Close the database
        return arrkapha;
    }
}

