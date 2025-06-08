package com.luizeduardobrandao.projetocurso.ui

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.luizeduardobrandao.projetocurso.utils.AppConstants
import com.luizeduardobrandao.projetocurso.R
import com.luizeduardobrandao.projetocurso.business.UserBusiness
import com.luizeduardobrandao.projetocurso.databinding.ActivityExercicio1Binding
import com.luizeduardobrandao.projetocurso.databinding.ActivityExercicio1HomeBinding
import com.luizeduardobrandao.projetocurso.databinding.ActivityExercicio1RegisterBinding

class Exercicio1 : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityExercicio1Binding
    private val userBusiness = UserBusiness()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityExercicio1Binding.inflate(layoutInflater)

        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
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

                // validação dos dados
                if (userBusiness.checkCredentials(email, password)) {

                    // Preparando Valores Para Passar
                    val bundle = Bundle()
                    bundle.putString(AppConstants.EMAIL_KEY, email)

                    // Navegação
                    val intent = Intent(this, Exercicio1HomeActivity::class.java)
                    intent.putExtras(bundle) // passando valores
                    startActivity(intent)

                } else {
                    Toast.makeText(this, "Informe os dados!", Toast.LENGTH_SHORT).show()
                    //Toast.makeText(this, R.string.data_validation, Toast.LENGTH_SHORT).show()
                }
            }

            R.id.button_register ->{
                val email = binding.edittextEmail.text.toString()
                val password = binding.edittextPassword.text.toString()

                // validação dos dados
                if (userBusiness.checkCredentials(email, password)) {

                    // Preparando Valores Para Passar
                    val bundle = Bundle()
                    bundle.putString(AppConstants.REGISTER_KEY, email)

                    // Navegação
                    val intent = Intent(this, Exercicio1RegisterActivity::class.java)
                    intent.putExtras(bundle) // passando valores
                    startActivity(intent)

                } else {
                    Toast.makeText(this, "Informe os dados!", Toast.LENGTH_SHORT).show()
                    //Toast.makeText(this, R.string.data_validation, Toast.LENGTH_SHORT).show()
                }
            }

            R.id.btnVoltar -> finish()
        }
    }
}