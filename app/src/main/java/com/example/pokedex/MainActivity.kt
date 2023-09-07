package com.example.pokedex

import android.content.Intent
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvPokemon: RecyclerView
    private val listPokemon: ArrayList<Pokemon> = arrayListOf()
    private lateinit var layoutManager: RecyclerView.LayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvPokemon = findViewById(R.id.rv_pokedex)
        rvPokemon.setHasFixedSize(true)

        listPokemon.addAll(PokemonData.listData)
        updateRecyclerViewLayout()
        showRecyclerList()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.about_page -> {
                val profile = Intent(this@MainActivity, ProfileActivity::class.java)
                startActivity(profile)
            }
        }
        return super.onOptionsItemSelected(item)
    }

    private fun showRecyclerList() {
        val listPokemonAdapter = ListPokemonAdapter(listPokemon)
        rvPokemon.adapter = listPokemonAdapter
    }

    private fun updateRecyclerViewLayout() {
        val orientation = resources.configuration.orientation
        layoutManager = if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            GridLayoutManager(this, 2) // 2 columns in landscape
        } else {
            LinearLayoutManager(this)
        }
        rvPokemon.layoutManager = layoutManager
    }
}