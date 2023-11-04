package com.akhilj33.pokemonapp.data.remote.responses


import com.google.gson.annotations.SerializedName

data class GenerationIi(
    @SerializedName("crystal")
    val crystal: Crystal? = null,
    @SerializedName("gold")
    val gold: Gold? = null,
    @SerializedName("silver")
    val silver: Silver? = null
)