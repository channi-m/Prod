package com.example.a1

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DB(val context: Context, val factory: SQLiteDatabase.CursorFactory?) : SQLiteOpenHelper(context, "app", factory, 1) {

    override fun onCreate(db: SQLiteDatabase?) {
        val query =
            "CREATE TABLE users (user_id INTEGER PRIMARY KEY AUTOINCREMENT, first_name VARCHAR(50) NOT NULL, last_name VARCHAR(50) NOT NULL, phone VARCHAR(12) NOT NULL UNIQUE CHECK (phone GLOB '[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]'), login VARCHAR(50) NOT NULL UNIQUE CHECK (login GLOB '*[a-zA-Z0-9_]*'), password VARCHAR(255) NOT NULL CHECK (LENGTH(password) >= 8 AND password GLOB '*[A-Z]*' AND password GLOB '*[a-z]*' AND password GLOB '*[0-9]*'))";
        db!!.execSQL(query)
    }

    override fun onUpgrade(db: SQLiteDatabase?, p1: Int, p2: Int) {
        db!!.execSQL("DROP TABLE IF EXISTS users")
        onCreate(db)
    }

    fun addUser(user: User) {
        val values = ContentValues()
        values.put("login", user.login)
        values.put("pass", user.pass)

        val db = this.writableDatabase
        db.insert("users", null, values)

        db.close()
    }

    fun getUser(login: String, pass: String): Boolean {
        val db = this.readableDatabase

        val result =
            db.rawQuery("SELECT * FROM users WHERE login = '$login' AND pass = '$pass'", null)
        return result.moveToFirst()

    }

    fun getUser1(login: String): Boolean {
        val db = this.readableDatabase

        val result = db.rawQuery("SELECT * FROM users WHERE login = '$login'", null)
        return result.moveToFirst()
    }
}
