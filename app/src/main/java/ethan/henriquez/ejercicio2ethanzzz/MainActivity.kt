package ethan.henriquez.ejercicio2ethanzzz

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btn: Button = findViewById(R.id.btnRegistrarme)
        btn.setOnClickListener {
            val intent = Intent(this, activity_registrarse::class.java)
            startActivity(intent)

        }
        val btnIng: Button = findViewById(R.id.btnIngresar)
        btnIng.setOnClickListener{
            val pantallaInicio = Intent(this, activity_inicio::class.java)
            startActivity(pantallaInicio)
        }
    }
}