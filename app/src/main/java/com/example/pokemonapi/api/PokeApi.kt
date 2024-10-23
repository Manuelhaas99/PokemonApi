package com.example.pokemonapi.api

import com.example.pokemonapi.model.Pokemon
import okhttp3.Call
import retrofit2.http.GET
import java.util.jar.Attributes.Name

interface PokeApi {
    @GET("pokemon-species/")
    suspend fun getPokemons(): Pokemon
}