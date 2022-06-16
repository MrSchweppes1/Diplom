package com.example.diplom

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.diplom.db.MyDbManager

class ChecklistPage : AppCompatActivity() {
    val myDbManager = MyDbManager(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_checklist_page)
    }
    fun onClickStudent(view: View){
        val intent = Intent(this@ChecklistPage, AddStudent::class.java)
        startActivity(intent)
    }
    override fun onResume() {
        super.onResume()
        myDbManager.openDb()
    }
    fun onClickHomePage(view: View){
        val intent = Intent(this@ChecklistPage, MainActivity::class.java)
        startActivity(intent)
    }
}