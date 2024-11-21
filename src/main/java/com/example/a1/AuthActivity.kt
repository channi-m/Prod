package com.example.a1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class AuthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_auth)

        val userLogin: EditText = findViewById(R.id.user_login_auth)
        val userPass: EditText = findViewById(R.id.user_pass_auth)
        val button: Button = findViewById(R.id.button_auth)
        val Reg: TextView = findViewById(R.id.reg)

        Reg.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        button.setOnClickListener {
            val login = userLogin.text.toString().trim()
            val pass = userPass.text.toString().trim()

            if (login == "" || pass == "")
                Toast.makeText(this, "Заполните все данные", Toast.LENGTH_LONG).show()
            else {
                val db = DB(this, null)
                val isAuth = db.getUser(login, pass)

                if (isAuth) {
                    Toast.makeText(this, "Добро пожаловать!", Toast.LENGTH_LONG).show()
                    userPass.text.clear()
                    userLogin.text.clear()

                    val intent = Intent(this, DobavActivity::class.java)
                    startActivity(intent)
                } else
                    Toast.makeText(this, "Неправильный логин или пароль", Toast.LENGTH_LONG).show()
            }
        }
    }

    private fun authActivity() = this
}
