package com.example.diplom.db

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class MyDbHelper(context: Context) : SQLiteOpenHelper(context, MyDbNameClass.DATABASE_NAME,
    null, MyDbNameClass.DATABASE_VERSION
) {

    override fun onCreate(db: SQLiteDatabase?) {
    db?.execSQL(MyDbNameClass.MyDbGroups.Create_Table)
    db?.execSQL(MyDbNameClass.MyDbEquipment.Create_Table)
    db?.execSQL(MyDbNameClass.MydbEvent.Create_Table)

}

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {

        db?.execSQL(MyDbNameClass.MyDbGroups.Drop_Table)
        db?.execSQL(MyDbNameClass.MyDbEquipment.Drop_Table)
        db?.execSQL(MyDbNameClass.MydbEvent.Drop_Table)
        onCreate(db)
    }
}