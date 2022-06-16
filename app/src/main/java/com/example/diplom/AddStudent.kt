package com.example.diplom

import android.content.ContentValues
import android.content.Intent
import android.database.sqlite.SQLiteDatabase
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import com.example.diplom.db.MyDbManager
import com.example.diplom.db.MyDbNameClass

class AddStudent : AppCompatActivity() {
    val myDbManager = MyDbManager(this)
    var db: SQLiteDatabase? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_student)
    }

    fun onClickChecklist(view: View){
        val intent = Intent(this@AddStudent, ChecklistPage::class.java)
        startActivity(intent)
    }

    fun onClickHomePage(view: View){
        val intent = Intent(this@AddStudent, MainActivity::class.java)
        startActivity(intent)
    }


    override fun onResume() {
        super.onResume()
        myDbManager.openDb()
    }

    fun insertToDb( groupname: String, surename: String, name: String, patronymic:String){
        val values = ContentValues().apply{
            put(MyDbNameClass.MyDbGroups.Groups_GROUPNAME, groupname)
            put(MyDbNameClass.MyDbGroups.Groups_SURENAME, surename)
            put(MyDbNameClass.MyDbGroups.Groups_NAME, name)
            put(MyDbNameClass.MyDbGroups.Groups_PATRONYMIC, patronymic)
        }
        db?.insert(MyDbNameClass.MyDbGroups.TABLE_NAME,null,values)
    }

    fun onClickSave(view: View) {
        myDbManager.openDb()

        try {
            insertToDb(findViewById<EditText>(R.id.groupname).text.toString(),
                findViewById<EditText>(R.id.surename).text.toString(),
                findViewById<EditText>(R.id.name).text.toString(),
                findViewById<EditText>(R.id.patronymic).text.toString())

            val toast = Toast.makeText(this@AddStudent, "Запись успешно добавлена", Toast.LENGTH_SHORT)
            toast.show()

        }
        catch (ex:Exception){
            val toast = Toast.makeText(this@AddStudent,ex.localizedMessage, Toast.LENGTH_SHORT)
            toast.show()

        }

    }

    override fun onDestroy(){
        super.onDestroy()
        myDbManager.closeDb()
    }
}