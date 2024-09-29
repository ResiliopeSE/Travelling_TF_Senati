package com.example.travellingapp.models;

public class Vuelo {
    private String origenDestino;
    private String precio;
    private String detalles;
    private int imagen; // ID de la imagen

    public Vuelo(String origenDestino, String precio, String detalles, int imagen) {
        this.origenDestino = origenDestino;
        this.precio = precio;
        this.detalles = detalles;
        this.imagen = imagen;
    }

    public String getOrigenDestino() {
        return origenDestino;
    }

    public String getPrecio() {
        return precio;
    }

    public String getDetalles() {
        return detalles;
    }

    public int getImagen() {
        return imagen;
    }
}

