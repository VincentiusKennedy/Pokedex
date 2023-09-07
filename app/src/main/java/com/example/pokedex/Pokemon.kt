package com.example.pokedex

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Pokemon(
    var name: String = "",
    var index: String = "",
    var type: String = "",
    var description: String = "",
    var weakness: String = "",
    var height: String = "",
    var weight: String = "",
    var category: String = "",
    var ability: String = "",
    var photo: String = ""
) : Parcelable
