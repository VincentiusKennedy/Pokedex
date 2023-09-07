package com.example.pokedex

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.pokedex.databinding.ActivityDetailPokemonBinding

class DetailPokemon : AppCompatActivity() {
    private lateinit var binding: ActivityDetailPokemonBinding

    companion object {
        const val EXTRA_POKEMON = "extra_pokemon"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailPokemonBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val actionbar = supportActionBar
        actionbar!!.title = "Detail Pokemon"
        actionbar.setDisplayHomeAsUpEnabled(true)

        val pokemon: Pokemon = intent.getParcelableExtra(EXTRA_POKEMON)!!

        Glide.with(this)
            .load(pokemon.photo)
            .apply(RequestOptions())
            .into(binding.imgDetailPokemon)
        binding.tvDetailPokemonName.text = pokemon.name
        binding.tvDetailPokemonIndex.text = pokemon.index
        binding.tvDetailPokemonDescription.text = pokemon.description
        binding.tvDetailPokemonType.text = pokemon.type
        binding.tvDetailPokemonWeakness.text = pokemon.weakness
        binding.tvDetailPokemonHeight.text = pokemon.height
        binding.tvDetailPokemonWeight.text = pokemon.weight
        binding.tvDetailPokemonCategory.text = pokemon.category
        binding.tvDetailPokemonAbilities.text = pokemon.ability
        binding.btnShare!!.setOnClickListener {
            sharePokemonDetailss()
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    private fun sharePokemonDetailss() {
        val pokemonName = binding.tvDetailPokemonName.text.toString()
        val pokemonType = binding.tvDetailPokemonType.text.toString()

        val shareText = "Nama Pokemon: $pokemonName\nTipe Pokemon: $pokemonType"

        val shareIntent = Intent(Intent.ACTION_SEND)
        shareIntent.type = "text/plain"
        shareIntent.putExtra(Intent.EXTRA_TEXT, shareText)

        startActivity(Intent.createChooser(shareIntent, "Bagikan dengan"))
    }
}