package ethan.henriquez.ejercicio2ethanzzz

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import modelo.ClaseConexion

class activity_inicio : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_inicio)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val txtNumTicket = findViewById<EditText>(R.id.txtNumTicket)
        val txtTituloT = findViewById<EditText>(R.id.txtTituloT)
        val txtDescripcion = findViewById<EditText>(R.id.txtDescripcion)
        val txtAutor = findViewById<EditText>(R.id.txtAutor)
        val txtcorreo = findViewById<EditText>(R.id.txtcorreo)
        val txtCreacionT = findViewById<EditText>(R.id.txtCreacionT)
        val txtEstadoT = findViewById<EditText>(R.id.txtEstadoT)
        val txtSolucion = findViewById<EditText>(R.id.txtSolucion)
        val btnEnviar =  findViewById<Button>(R.id.btnEnviar)

        btnEnviar.setOnClickListener{
            CoroutineScope(Dispatchers.IO).launch {
                val objConexion = ClaseConexion().cadenaConexion()
                // crear una variable que contenga un prepare statement 
            }
        }


    }
}