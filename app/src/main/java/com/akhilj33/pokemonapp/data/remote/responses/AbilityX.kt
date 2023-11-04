package com.akhilj33.pokemonapp.data.remote.responses


import com.google.gson.annotations.SerializedName

data class AbilityX(
    @SerializedName("name")
    val name: String? = null,
    @SerializedName("url")
    val url: String? = null
)