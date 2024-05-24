package com.example.ocean_android_intro_maio_2024

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
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

        //buscar botao por ID
        // <> -> informar tipo de informacao
        // () -> informa o ID do elemento que está no layout XML
        // obter o ID usando a declaracao R.id
        // val ou var
        // var -> ua variavel que nao muda seu  valor depois de ser inicialiazada
        val btEnviar = findViewById<Button>(R.id.btEnviar)
        val tvResultado = findViewById<TextView>(R.id.tvResultado)
        val eT = findViewById<EditText>(R.id.eT)

        btEnviar.setOnClickListener {
            // dentro desse bloco {} o codigo só será executado quando o butao for clicado
            tvResultado.text = eT.text
        }



    }
}