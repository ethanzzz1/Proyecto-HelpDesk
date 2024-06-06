package ethan.henriquez.ejercicio2ethanzzz

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class activity_registrarse : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_registrarse)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnRegistrar1: Button = findViewById(R.id.btnRegistro)
        btnRegistrar1.setOnClickListener {
            val registro = Intent(this, activity_inicio::class.java)
            startActivity(registro)

        }
        val btnRegistrar2: Button = findViewById(R.id.btnRegresarLogin)
        btnRegistrar2.setOnClickListener {
            val registro2 = Intent(this, MainActivity::class.java)
            startActivity(registro2)

        }


    }
}