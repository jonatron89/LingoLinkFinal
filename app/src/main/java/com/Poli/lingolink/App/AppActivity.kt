package com.example.loginapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.Poli.lingolink.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_app)

        //  EditTexts y botones
        val emailEditText = findViewById<EditText>(R.id.emailEditText)
        val passwordEditText = findViewById<EditText>(R.id.passwordEditText)
        val loginButton = findViewById<Button>(R.id.loginButton)
        val registerButton = findViewById<Button>(R.id.registerButton)

        // Acción del botón de login
        loginButton.setOnClickListener {
            val email = emailEditText.text.toString()
            val password = passwordEditText.text.toString()

            if (email.isNotEmpty() && password.isNotEmpty()) {
                // Lógica para validar el login
                Toast.makeText(this, "Inicio de sesión exitoso", Toast.LENGTH_SHORT).show()
                // Si es válido, puedes redirigir a otra pantalla (Activity)
                // val intent = Intent(this, DashboardActivity::class.java)
                // startActivity(intent)
            } else {
                Toast.makeText(this, "Por favor ingrese el correo y la contraseña", Toast.LENGTH_SHORT).show()
            }
        }

        // Acción del botón de registro
        registerButton.setOnClickListener {
            // redirigir a la actividad de registro
            Toast.makeText(this, "Redirigiendo a registro...", Toast.LENGTH_SHORT).show()
            // val intent = Intent(this, RegisterActivity::class.java)
            // startActivity(intent)
        }
    }
}
