package com.akhilj33.pokemonapp.data.remote.api

import com.akhilj33.pokemonapp.data.remote.responses.Pokemon
import com.akhilj33.pokemonapp.data.remote.responses.PokemonList
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface PokemonApi {

    @GET("pokemon")
    suspend fun getPokemonList(
        @Query("limit") limit: Int,
        @Query("offset") offset: Int
    ): PokemonList

    @GET("pokemon/{name}")
    suspend fun getPokemon(@Path("name") name: String): Pokemon

}