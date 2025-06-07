package com.luizeduardobrandao.projetocurso

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.luizeduardobrandao.projetocurso.databinding.ActivityMainBinding
import com.luizeduardobrandao.projetocurso.databinding.Exercicio1Binding

class Exercicio1 : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: Exercicio1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = Exercicio1Binding.inflate(layoutInflater)

        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.exercicio1)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

//        val editTextEmail = findViewById<EditText>(R.id.edittext_email)
//        val str = editTextEmail.text.toString()
//        val editTextPassword = findViewById<EditText>(R.id.edittext_password)
//
//        val buttonLogin = findViewById<Button>(R.id.button_login)
//        val buttonRegister = findViewById<Button>(R.id.button_register)

        // Pega o botão “Voltar” do layout e, ao clicar, encerra esta Activity
//        val btnVoltar = findViewById<Button>(R.id.btnVoltar)
//        btnVoltar.setOnClickListener {
//            finish()
//        }

        binding.buttonLogin.setOnClickListener(this)
        binding.buttonRegister.setOnClickListener(this)
        binding.btnVoltar.setOnClickListener(this)


    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.button_login -> {
                val email = binding.edittextEmail.text.toString()
                val password = binding.edittextPassword.text.toString()
            }

            R.id.button_register -> {

            }

            R.id.btnVoltar -> finish()
        }
    }
}