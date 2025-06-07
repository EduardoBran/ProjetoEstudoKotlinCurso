package com.luizeduardobrandao.projetocurso

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.luizeduardobrandao.projetocurso.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // 1. Recupera os botões pelo ID
        binding.btnExercicio1.setOnClickListener(this)
        binding.btnExercicio2.setOnClickListener(this)



    }

    // Implementa lógica ao clicar nos botões
    override fun onClick(v: View) {
        if (v.id == R.id.btnExercicio1) {
            // vai para a página de Exercicio 1
            val intent = Intent(this, Exercicio1::class.java)
            startActivity(intent)
        }
        else if (v.id == R.id.btnExercicio2) {
            // vai para a página de Exercicio 2
            val intent = Intent(this, Exercicio2::class.java)
            startActivity(intent)
        }
    }
}

//        // 1. Recupera os botões pelo ID
//        val btn1 = findViewById<Button>(R.id.btnExercicio1)
//        val btn2 = findViewById<Button>(R.id.btnExercicio2)
//
//        // 2. Define a ação de click para cada botão
//        btn1.setOnClickListener {
//            // Inicia Exercicio1Activity
//            val intent = Intent(this, Exercicio1::class.java)
//            startActivity(intent)
//        }
//
//        btn2.setOnClickListener {
//            // Inicia Exercicio2Activity
//            val intent = Intent(this, Exercicio2::class.java)
//            startActivity(intent)
//        }