package com.example.travellingapp.ui.login;

import androidx.lifecycle.ViewModel;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.example.travellingapp.models.Usuario;
import com.example.travellingapp.adapters.ApiClient;
import com.example.travellingapp.adapters.ApiService;
import com.example.travellingapp.R;


import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginViewModel extends ViewModel {

    private ApiService apiService;

    public LoginViewModel() {
        // Inicializamos Retrofit
        apiService = ApiClient.getClient().create(ApiService.class);
    }

    public void login(String email, String password, NavController navController) {
        Usuario loginUser = new Usuario();
        loginUser.setEmail(email);
        loginUser.setContraseña(password);

        Call<Usuario> call = apiService.loginUser(loginUser);

        call.enqueue(new Callback<Usuario>() {
            @Override
            public void onResponse(Call<Usuario> call, Response<Usuario> response) {
                if (response.isSuccessful()) {
                    System.out.println("Login exitoso");
                    // Navegamos al HomeFragment una vez que el login es exitoso
                    navController.navigate(R.id.nav_home);
                } else {
                    System.out.println("Error en el login: " + response.code());
                }
            }

            @Override
            public void onFailure(Call<Usuario> call, Throwable t) {
                System.out.println("Error en la conexión: " + t.getMessage());
            }
        });
    }
}
