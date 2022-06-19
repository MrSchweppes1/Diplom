package com.example.diplom

import android.annotation.SuppressLint
import android.content.Intent
import android.database.sqlite.SQLiteDatabase
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import com.example.diplom.db.MyDbNameClass

class AddEvent : AppCompatActivity(){
    var db: SQLiteDatabase? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_event)

    }

    fun onClickBack(view: View){
        val intent = Intent(this@AddEvent, MainActivity::class.java)
        startActivity(intent)
    }

    fun onClickChecklist(view: View){
        val intent = Intent(this@AddEvent, ChecklistPage::class.java)
        startActivity(intent)
    }

    fun onClickStudent(view: View){
        val intent = Intent(this@AddEvent, AddStudent::class.java)
        startActivity(intent)
    }

    fun onClickAddEquip(view: View){
        val intent = Intent(this@AddEvent, AddEquipment::class.java)
        startActivity(intent)
    }

}