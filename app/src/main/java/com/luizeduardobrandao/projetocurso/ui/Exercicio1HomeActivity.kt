package com.luizeduardobrandao.projetocurso.ui

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.luizeduardobrandao.projetocurso.utils.AppConstants
import com.luizeduardobrandao.projetocurso.R
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

        // Chama a Função
        getUserEmail()
    }

    // Coletando dados da outra activity  ("?.let" verifica se não é nulo)
    // Função para Receber Informações do Usuário vindo Exercicio1

    private fun getUserEmail(){
        intent.extras?.let {
            binding.textviewEmail.text = it.getString(AppConstants.EMAIL_KEY) // chave "EMAIL" criado em Exercicio1
        }
    }
}