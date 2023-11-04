package com.akhilj33.pokemonapp.repository

import com.akhilj33.pokemonapp.data.remote.api.PokemonApi
import com.akhilj33.pokemonapp.data.remote.responses.Pokemon
import com.akhilj33.pokemonapp.data.remote.responses.PokemonList
import com.akhilj33.pokemonapp.util.Resource
import java.lang.Exception
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class PokemonRepository @Inject constructor(
    private val api: PokemonApi
) {

    suspend fun getPokemonList(limit: Int, offset: Int): Resource<PokemonList> {
           val response =  try {
                api.getPokemonList(limit, offset)
            } catch (e: Exception) {
                return Resource.Error(message = "Something went wrong")
            }
            return Resource.Success(response)
    }

    suspend fun getPokemonInfo(name: String): Resource<Pokemon> {
        val response =  try {
            api.getPokemon(name)
        } catch (e: Exception) {
            return Resource.Error(message = "Something went wrong")
        }
        return Resource.Success(response)
    }
}