package com.example.diplom

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class AddEquipment : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_equipment)
    }

    fun onClickChecklist(view: View){
        val intent = Intent(this@AddEquipment, ChecklistPage::class.java)
        startActivity(intent)
    }

    fun onClickStudent(view: View){
        val intent = Intent(this@AddEquipment, AddStudent::class.java)
        startActivity(intent)
    }
    fun onClickBack(view: View){
        val intent = Intent(this@AddEquipment, AddEvent::class.java)
        startActivity(intent)
    }
}