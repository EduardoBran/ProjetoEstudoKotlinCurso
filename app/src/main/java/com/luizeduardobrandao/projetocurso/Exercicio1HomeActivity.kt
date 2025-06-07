package com.luizeduardobrandao.projetocurso

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.luizeduardobrandao.projetocurso.databinding.ActivityExercicio1HomeBinding

class Exercicio1HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityExercicio1HomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityExercicio1HomeBinding.inflate(layoutInflater)

        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Coletando dados da outra activity  ("?.let" verifica se não é nulo)
        intent.extras?.let {
            binding.textviewEmail.text = it.getString("EMAIL")
        }

    }
}