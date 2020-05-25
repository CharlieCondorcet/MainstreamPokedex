package com.example.mainstreampokedex.pokeapi;

import com.example.mainstreampokedex.models.PokemonRespuesta;

import retrofit2.Call;
import retrofit2.http.GET;

public interface PokeapiService {

    @GET("pokemon")
    Call<PokemonRespuesta> obtenerListaPokemon();
}
