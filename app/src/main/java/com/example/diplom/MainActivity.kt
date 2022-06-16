package com.example.diplom

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun onClickEvent(view: View){
        val intent = Intent(this@MainActivity, AddEvent::class.java)
        startActivity(intent)
    }
    fun onClickNewEquip(view: View){
        val intent = Intent(this@MainActivity, NewEquipment::class.java)
        startActivity(intent)
    }

    fun onClickChecklist(view: View){
        val intent = Intent(this@MainActivity, ChecklistPage::class.java)
        startActivity(intent)
    }

    fun onClickStudent(view: View){
        val intent = Intent(this@MainActivity, AddStudent::class.java)
        startActivity(intent)
    }
}