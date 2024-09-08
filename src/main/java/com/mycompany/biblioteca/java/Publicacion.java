package com.mycompany.biblioteca.java;

public class Publicacion {
    private String titulo;
    private int anioDePublicacion;

    @Override
    public String toString() {
        return "Publicacion{" + "titulo=" + titulo + ", anioDePublicacion=" + anioDePublicacion + '}';
    }

    public Publicacion(String titulo, int anioDePublicacion) {
        this.titulo = titulo;
        this.anioDePublicacion = anioDePublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnioDePublicacion() {
        return anioDePublicacion;
    }

    public void setAnioDePublicacion(int anioDePublicacion) {
        this.anioDePublicacion = anioDePublicacion;
    }

    
}
