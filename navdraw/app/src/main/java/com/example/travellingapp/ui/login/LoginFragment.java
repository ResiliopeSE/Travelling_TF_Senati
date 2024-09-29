package com.example.travellingapp.ui.login;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.example.travellingapp.R;

public class LoginFragment extends Fragment {

    private LoginViewModel loginViewModel;
    private EditText emailInput, passwordInput;
    private Button loginButton;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_login, container, false);

        emailInput = rootView.findViewById(R.id.emailInput);
        passwordInput = rootView.findViewById(R.id.passwordInput);
        loginButton = rootView.findViewById(R.id.loginButton);

        loginViewModel = new ViewModelProvider(this).get(LoginViewModel.class);

        NavController navController = Navigation.findNavController(requireActivity(), R.id.nav_host_fragment_content_main);

        loginButton.setOnClickListener(v -> {
            String email = emailInput.getText().toString();
            String password = passwordInput.getText().toString();
            loginViewModel.login(email, password, navController);
        });

        return rootView;
    }
}
