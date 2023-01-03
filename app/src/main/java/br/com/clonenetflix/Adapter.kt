package br.com.clonenetflix

import android.animation.PropertyValuesHolder
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import br.com.clonenetflix.databinding.FilmeItemBinding
import java.text.FieldPosition

class Adapter (private val context: Context, private val listaFilmes: MutableList<Filme>):
    RecyclerView.Adapter<Adapter.FilmeViewHolder>(){

    override fun onBindViewHolder(holder: FilmeViewHolder, position: Int) {
        holder.filme.setBackgroundResource(listaFilmes[position].icon!!)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmeViewHolder {
        val filmelista = FilmeItemBinding.inflate(LayoutInflater.from(context), parent, false)
        return FilmeViewHolder(filmelista)
    }

    override fun getItemCount() = listaFilmes.size

    inner class FilmeViewHolder(binding: FilmeItemBinding): RecyclerView.ViewHolder(binding.root){
        val filme = binding.capafilmes
    }

}