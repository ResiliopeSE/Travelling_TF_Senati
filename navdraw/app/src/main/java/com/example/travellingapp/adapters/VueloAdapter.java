package com.example.travellingapp.adapters;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.travellingapp.R;
import com.example.travellingapp.models.Vuelo;

import java.util.List;

public class VueloAdapter extends ArrayAdapter<Vuelo> {

    public VueloAdapter(Context context, List<Vuelo> vuelos) {
        super(context, 0, vuelos);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Obtener el vuelo actual
        Vuelo vuelo = getItem(position);

        // Verificar si la vista existente está siendo reutilizada, de lo contrario inflar la vista
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_vuelo, parent, false);
        }

        // Referenciar las vistas
        TextView origenDestino = convertView.findViewById(R.id.origen_destino);
        TextView precioVuelo = convertView.findViewById(R.id.precio_vuelo);
        TextView detallesVuelo = convertView.findViewById(R.id.detalles_vuelo);
        ImageView imagenVuelo = convertView.findViewById(R.id.imagen_vuelo);

        // Asignar los datos del vuelo a las vistas
        origenDestino.setText(vuelo.getOrigenDestino());
        precioVuelo.setText(vuelo.getPrecio());
        detallesVuelo.setText(vuelo.getDetalles());
        imagenVuelo.setImageResource(vuelo.getImagen());

        // Devolver la vista para mostrarla en el ListView
        return convertView;
    }
}
