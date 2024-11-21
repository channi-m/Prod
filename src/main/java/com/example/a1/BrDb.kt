package com.example.a1

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.widget.CheckBox

class BrDb(val context: Context, factory: SQLiteDatabase.CursorFactory?) : SQLiteOpenHelper(context, "app", factory, 1) {

    override fun onCreate(dbs: SQLiteDatabase?) {
        val query = """
            CREATE TABLE dbs (
                id INTEGER PRIMARY KEY AUTOINCREMENT,
                title VARCHAR(50) NOT NULL,
                kkal DOUBLE,
                belki DOUBLE,
                zhiri DOUBLE,
                yglevodi DOUBLE
            )
        """
        dbs?.execSQL(query)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {


        fun addBr(product: Br) {
            val values = ContentValues().apply {
                put("title", product.title)
                put("kkal", product.kkal)
                put("belki", product.belki)
                put("zhiri", product.zhiri)
                put("yglevodi", product.yglevodi)
            }

            val db = this.writableDatabase
            db.insert("brs", null, values)
            db.close()
        }
    }
}


