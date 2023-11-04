package com.akhilj33.pokemonapp.data.remote.responses


import com.google.gson.annotations.SerializedName

data class GenerationViii(
    @SerializedName("icons")
    val icons: IconsX? = IconsX()
)