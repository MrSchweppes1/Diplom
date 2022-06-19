package com.example.diplom

import android.content.Intent
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import com.example.diplom.db.MyDbManager
import com.example.diplom.db.MyDbNameClass

class AddEquipment : AppCompatActivity() {
    val myDbManager = MyDbManager(this)
    var db: SQLiteDatabase? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_equipment)

        UpdateTable()
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

    fun UpdateTable() {
        val cursor = db?.query(MyDbNameClass.MyDbEquipment.TABLE_NAME,null,null,
            null,null,null,null)


        while (cursor?.moveToFirst()!!){

            val title = cursor.getColumnIndex(MyDbNameClass.MyDbEquipment.Equipment_TitleEquip)
            val subtitle = cursor.getColumnIndex(MyDbNameClass.MyDbEquipment.Equipment_SUBTITLE)

            var tablelayout = findViewById<TableLayout>(R.id.TabLay)
            tablelayout.removeAllViews()

            do {
                var TBrow = TableRow(this)
                TBrow.setLayoutParams(LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT))

                var params = TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT, TableRow.LayoutParams.WRAP_CONTENT)

                var checkBox = CheckBox(this)
                params.weight = 1.0f
                checkBox.setLayoutParams(params)
                checkBox.setText(cursor.getString(title))
                TBrow.addView(checkBox)

                var editText = EditText(this)
                params.weight = 1.0f
                editText.setLayoutParams(params)
                editText.setText("0")
                TBrow.addView(editText)

                tablelayout.addView(TBrow)



            }while (cursor?.moveToNext()!!)
        }
        cursor.close()
    }
}