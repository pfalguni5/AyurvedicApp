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
    private static final String Table_sym="Symptoms_vata";
    private static final String Key_name="Symptoms";

    private static final String Table_vathel="Health_vata";
    private static final String Keyvat_hel="Healthvat";






    public DBhelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " + Table_sym + "(" + Key_name + " TEXT )");
        db.execSQL("CREATE TABLE " + Table_vathel + "(" + Keyvat_hel + " TEXT)" );




    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + Table_sym);
        db.execSQL("DROP TABLE IF EXISTS " + Table_vathel);
        onCreate(db);

    }

    public boolean isDataExists(String symptom) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM " + Table_sym + " WHERE " + Key_name + "=?", new String[]{symptom});
        boolean exists = (cursor.getCount() > 0);
        cursor.close();
        return exists;
    }

    public boolean isDataExistshelVat(String helVat) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursorhel = db.rawQuery("SELECT * FROM " + Table_vathel + " WHERE " + Keyvat_hel + "=?", new String[]{helVat});
        boolean existshel = (cursorhel.getCount() > 0);
        cursorhel.close();
        return existshel;
    }

    public void addData(String Symptoms){
        SQLiteDatabase db=this.getWritableDatabase();

        ContentValues values=new ContentValues();
        values.put(Key_name,Symptoms);


        db.insert(Table_sym, null, values);
        db.close();

    }

    public void addDatahel(String Helvat){
        SQLiteDatabase dbhel=this.getWritableDatabase();

        ContentValues valueshel=new ContentValues();
        valueshel.put(Keyvat_hel,Helvat);


        dbhel.insert(Table_vathel, null, valueshel);
        dbhel.close();

    }
    public ArrayList<Symptomodel> fetchdata(){
        SQLiteDatabase db=this.getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM "+Table_sym,null);
        ArrayList<Symptomodel> arrSym=new ArrayList<>();
        if (cursor != null && cursor.moveToFirst()) {
            do {
                Symptomodel model = new Symptomodel();
                model.Symptom = cursor.getString(0); // Ensure column index is correct
                arrSym.add(model);
            } while (cursor.moveToNext());
        }

        assert cursor != null;
        cursor.close(); // Don't forget to close the cursor
        db.close(); // Close the database
        return arrSym;
    }
    public ArrayList<Symptomodel> fetchdatahel(){
        SQLiteDatabase db=this.getReadableDatabase();
        Cursor cursorhel = db.rawQuery("SELECT * FROM "+Table_vathel,null);
        ArrayList<Symptomodel> arrhel=new ArrayList<>();
        if (cursorhel != null && cursorhel.moveToFirst()) {
            do {
                Symptomodel model = new Symptomodel();
                model.Health = cursorhel.getString(0); // Ensure column index is correct
                arrhel.add(model);
            } while (cursorhel.moveToNext());
        }

        assert cursorhel != null;
        cursorhel.close(); // Don't forget to close the cursor
        db.close(); // Close the database
        return arrhel;
    }
}
