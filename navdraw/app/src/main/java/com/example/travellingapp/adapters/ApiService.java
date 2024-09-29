package com.example.travellingapp.adapters;

import com.example.travellingapp.models.Usuario;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ApiService {
    @POST("api/TurismoUsuario")
    Call<Usuario> loginUser(@Body Usuario usuario);
}
