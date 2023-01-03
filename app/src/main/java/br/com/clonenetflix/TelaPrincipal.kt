package br.com.clonenetflix

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import br.com.clonenetflix.databinding.ActivityTelaPrincipalBinding

class TelaPrincipal : AppCompatActivity() {

    private lateinit var binding: ActivityTelaPrincipalBinding
    private lateinit var adapterFilme: Adapter
    private val listaFilme: MutableList<Filme> = mutableListOf()



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar!!.hide()
        binding = ActivityTelaPrincipalBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val recyclerIcons = binding.recyclerFilmes
        recyclerIcons.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerIcons.setHasFixedSize(true)
        adapterFilme = Adapter(this, listaFilme)
        recyclerIcons.adapter = adapterFilme
        listaFilmes()

        val recyclerIcons2 = binding.recyclerFilmes2
        recyclerIcons2.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerIcons2.setHasFixedSize(true)
        adapterFilme = Adapter(this, listaFilme)
        recyclerIcons2.adapter = adapterFilme
        listaFilmes2()

        val recyclerIcons3 = binding.recyclerFilmes3
        recyclerIcons3.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerIcons3.setHasFixedSize(true)
        adapterFilme = Adapter(this, listaFilme)
        recyclerIcons3.adapter = adapterFilme
        listaFilmes3()
    }

    private fun listaFilmes3() {
        val filme11 = Filme(R.drawable.filme11)
        listaFilme.add(filme11)

        val filme12 = Filme(R.drawable.filme12)
        listaFilme.add(filme12)

        val filme13 = Filme(R.drawable.filme13)
        listaFilme.add(filme13)

        val filme14 = Filme(R.drawable.filme14)
        listaFilme.add(filme14)

        val filme15 = Filme(R.drawable.filme15)
        listaFilme.add(filme15)

        val filme16 = Filme(R.drawable.filme16)
        listaFilme.add(filme16)

        val filme17 = Filme(R.drawable.filme17)
        listaFilme.add(filme17)

        val filme18 = Filme(R.drawable.filme18)
        listaFilme.add(filme18)

        val filme19 = Filme(R.drawable.filme19)
        listaFilme.add(filme19)

        val filme20 = Filme(R.drawable.filme20)
        listaFilme.add(filme20)
    }

    private fun listaFilmes2() {
        val filme11 = Filme(R.drawable.filme11)
        listaFilme.add(filme11)

        val filme12 = Filme(R.drawable.filme12)
        listaFilme.add(filme12)

        val filme13 = Filme(R.drawable.filme13)
        listaFilme.add(filme13)

        val filme14 = Filme(R.drawable.filme14)
        listaFilme.add(filme14)

        val filme15 = Filme(R.drawable.filme15)
        listaFilme.add(filme15)

        val filme16 = Filme(R.drawable.filme16)
        listaFilme.add(filme16)

        val filme17 = Filme(R.drawable.filme17)
        listaFilme.add(filme17)

        val filme18 = Filme(R.drawable.filme18)
        listaFilme.add(filme18)

        val filme19 = Filme(R.drawable.filme19)
        listaFilme.add(filme19)

        val filme20 = Filme(R.drawable.filme20)
        listaFilme.add(filme20)
    }

    private fun listaFilmes() {
        val filme1 = Filme(R.drawable.filme1)
        listaFilme.add(filme1)

        val filme2 = Filme(R.drawable.filme2)
        listaFilme.add(filme2)

        val filme3 = Filme(R.drawable.filme3)
        listaFilme.add(filme3)

        val filme4 = Filme(R.drawable.filme4)
        listaFilme.add(filme4)

        val filme5 = Filme(R.drawable.filme5)
        listaFilme.add(filme5)

        val filme6 = Filme(R.drawable.filme6)
        listaFilme.add(filme6)

        val filme7 = Filme(R.drawable.filme7)
        listaFilme.add(filme7)

        val filme8 = Filme(R.drawable.filme8)
        listaFilme.add(filme8)

        val filme9 = Filme(R.drawable.filme9)
        listaFilme.add(filme9)

        val filme10 = Filme(R.drawable.filme10)
        listaFilme.add(filme10)
    }


}