package com.example.travellingapp.ui.ViajesDisponibles;

import com.example.travellingapp.models.Vuelo;
import com.example.travellingapp.adapters.VueloAdapter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.travellingapp.R;
import java.util.ArrayList;

public class ViajesDisponiblesFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Inflar el layout correspondiente al fragmento
        View rootView = inflater.inflate(R.layout.fragment_gallery, container, false);

        // Crear una lista de vuelos
        ArrayList<Vuelo> vuelos = new ArrayList<>();
        vuelos.add(new Vuelo("Desde Huaraz a Lima", "USD 25.77 / PEN 97.23", "Solo ida - Economy", R.drawable.img_lima));
        vuelos.add(new Vuelo("Desde Puerto Maldonado a Cusco", "USD 25.92 / PEN 97.79", "Solo ida - Economy", R.drawable.img_puerto_maldonado));
        vuelos.add(new Vuelo("Desde Ayacucho a Lima", "USD 25.92 / PEN 97.79", "Solo ida - Economy", R.drawable.img_lima));
        vuelos.add(new Vuelo("Desde Trujillo a Lima", "USD 25.95 / PEN 97.90", "Solo ida - Economy", R.drawable.img_trujillo));
        vuelos.add(new Vuelo("Desde Arequipa a Cusco", "USD 26.00 / PEN 98.00", "Solo ida - Economy", R.drawable.img_arequipa));
        vuelos.add(new Vuelo("Desde Puno a Lima", "USD 25.50 / PEN 96.50", "Solo ida - Economy", R.drawable.img_puno));
        vuelos.add(new Vuelo("Desde Iquitos a Lima", "USD 30.00 / PEN 115.00", "Solo ida - Economy", R.drawable.img_iquitos));
        vuelos.add(new Vuelo("Desde Chiclayo a Lima", "USD 24.50 / PEN 95.00", "Solo ida - Economy", R.drawable.img_chiclayo));
        // Añade más vuelos según sea necesario...

        // Crear el adaptador personalizado
        VueloAdapter adapter = new VueloAdapter(getActivity(), vuelos);

        // Vincular el adaptador al ListView
        ListView listView = rootView.findViewById(R.id.list_vuelos);
        listView.setAdapter(adapter);

        return rootView;
    }
}
