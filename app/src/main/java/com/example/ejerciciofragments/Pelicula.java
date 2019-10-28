package com.example.ejerciciofragments;

import java.io.Serializable;

public class Pelicula implements Serializable {

    private String titulo;
    private String director;
    private Double duracion;
    private int imagen;
    private String resumen;

    public Pelicula(String titulo, String director, Double duracion, int imagen,String resumen) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
        this.imagen = imagen;
        this.resumen = resumen;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Double getDuracion() {
        return duracion;
    }

    public void setDuracion(Double duracion) {
        this.duracion = duracion;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }
}
