package com.example.a1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        val userLogin: EditText = findViewById(R.id.user_login)
        val userPass: EditText = findViewById(R.id.user_pass)
        val userPass2: EditText = findViewById(R.id.user_pass_2)
        val button: Button = findViewById(R.id.button_reg)
        val Entry: TextView = findViewById(R.id.entry)

        Entry.setOnClickListener {
            val intent = Intent(this, AuthActivity::class.java)
            startActivity(intent)
        }

        button.setOnClickListener {
            val login = userLogin.text.toString().trim()
            val pass = userPass.text.toString().trim()
            val pass2 = userPass2.text.toString().trim()

            val db = DB(this, null)
            val isAuth1 = db.getUser1(login)
            if (login == "" || pass == "") {
                Toast.makeText(this, "Заполните все данные", Toast.LENGTH_LONG).show()
            }
            else if (pass != pass2) {
                Toast.makeText(this, "Неправильный пароль", Toast.LENGTH_LONG).show()
            }
            else if (isAuth1){
                Toast.makeText(this, "Пользователь $login уже зарегестрирован", Toast.LENGTH_LONG).show()
            }
            else {
                val user = User(login, pass)
                val db = DB(this, null)
                db.addUser(user)
                Toast.makeText(this, "Пользователь $login добавлен", Toast.LENGTH_LONG).show()

                userLogin.text.clear()
                userPass.text.clear()
                userPass2.text.clear()
            }
            }
            }
    }
