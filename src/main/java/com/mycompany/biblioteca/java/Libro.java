package com.mycompany.biblioteca.java;

public class Libro extends Publicacion {
    private String autor;
    private int numeroDePaginas;

    public Libro(String titulo, int anioDePublicacion, String autor, int numeroDePaginas) {
        super(titulo, anioDePublicacion);
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
    }

    @Override
    public String toString() {
        return super.toString()+"Libro{" + "autor=" + autor + ", numeroDePaginas=" + numeroDePaginas + '}';
    }
    
    //gets and sets
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }
}
