package com.luizeduardobrandao.projetocurso.ui

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.luizeduardobrandao.projetocurso.R
import com.luizeduardobrandao.projetocurso.databinding.ActivityExercicio2Binding

class Exercicio2 : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityExercicio2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityExercicio2Binding.inflate(layoutInflater)

        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding.btnVoltar.setOnClickListener(this)

    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btnVoltar -> finish()
        }
    }
}