package com.example.pokemonapi.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {
    private const val BASE_URL = "https://pokeapi.co/api/v2/"

   val retrofit: Retrofit by lazy{
       Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
    val api: PokeApi by lazy {
        retrofit.create(PokeApi::class.java)
    }
}