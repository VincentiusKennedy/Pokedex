package com.example.pokedex

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.pokedex.databinding.ItemPokeCardBinding

class ListPokemonAdapter(private val listPokemon: ArrayList<Pokemon>) :
    RecyclerView.Adapter<ListPokemonAdapter.ListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val binding =
            ItemPokeCardBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ListViewHolder(binding)
    }

    override fun getItemCount(): Int = listPokemon.size

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val pokemon = listPokemon[position]

        Glide.with(holder.itemView.context).load(pokemon.photo)
            .apply(RequestOptions())
            .into(holder.binding.imgItemPokemon)
        holder.binding.tvPokemonName.text = pokemon.name
        holder.binding.tvPokemonType.text = pokemon.type
        holder.binding.tvPokemonIndex.text = pokemon.index

        val pokemonContext = holder.itemView.context

//        holder.itemView.setOnClickListener {
//            Toast.makeText(
//                holder.itemView.context,
//                "Kamu memilih " + listPokemon[holder.adapterPosition].name,
//                Toast.LENGTH_SHORT
//            ).show()

        holder.itemView.setOnClickListener {
            val detailPokemon = Intent(pokemonContext, DetailPokemon::class.java)
            detailPokemon.putExtra(DetailPokemon.EXTRA_POKEMON, pokemon)
            pokemonContext.startActivity(detailPokemon)
        }
    }

    class ListViewHolder(var binding: ItemPokeCardBinding) : RecyclerView.ViewHolder(binding.root)
}