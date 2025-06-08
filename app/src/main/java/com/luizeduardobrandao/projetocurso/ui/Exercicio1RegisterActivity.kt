package com.luizeduardobrandao.projetocurso.ui

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.luizeduardobrandao.projetocurso.R
import com.luizeduardobrandao.projetocurso.databinding.ActivityExercicio1RegisterBinding
import com.luizeduardobrandao.projetocurso.utils.AppConstants

class Exercicio1RegisterActivity : AppCompatActivity() {

    private lateinit var binding: ActivityExercicio1RegisterBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityExercicio1RegisterBinding.inflate(layoutInflater)

        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        getUserEmail()
    }

    private fun getUserEmail(){
        intent.extras?.let {
            binding.textviewEmail.text = it.getString(AppConstants.REGISTER_KEY) // chave "EMAIL" criado em Exercicio1
        }
    }
}