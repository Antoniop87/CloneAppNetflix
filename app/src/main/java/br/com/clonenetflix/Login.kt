package br.com.clonenetflix

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import br.com.clonenetflix.databinding.ActivityLoginBinding

class Login : AppCompatActivity() {

    val email = "pedro@gmail.com"
    val senha = "1234"

    private val binding by lazy {
        ActivityLoginBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        supportActionBar!!.hide()
        configurabtn()
    }



    private fun configurabtn() {
        val btnentrar = binding.entrar
        btnentrar.setOnClickListener {
            metodoentrar()
        }
    }

    private fun metodoentrar() {

        val inputemail = binding.inputemail.text.toString()
        val inputsenha = binding.inputsenha.text.toString()

        if (inputemail == email && inputsenha == senha) {
            Toast.makeText(this, "Email e Senha corretos!", Toast.LENGTH_SHORT).show()
            val vaipratelaprincial = Intent(this, TelaPrincipal::class.java)
            startActivity(vaipratelaprincial)
        }else{
            Toast.makeText(this, "Email ou Senha incorretos!", Toast.LENGTH_SHORT).show()
        }
    }
}