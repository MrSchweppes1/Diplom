package com.example.diplom.db

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import com.example.diplom.db.MyDbHelper

class MyDbManager(context: Context) {
    val myDbHelper= MyDbHelper(context)
    var db: SQLiteDatabase? = null


    fun openDb(){
        db = myDbHelper.writableDatabase
    }

    fun closeDb(){
        myDbHelper.close()
    }
}