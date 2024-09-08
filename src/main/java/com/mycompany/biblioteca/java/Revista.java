package com.mycompany.biblioteca.java;

public class Revista extends Publicacion {
    private int numeroDeRevista;
    private String nombreDeRevista;

    

    public int getNumeroDeRevista() {
        return numeroDeRevista;
    }

    public void setNumeroDeRevista(int numeroDeRevista) {
        this.numeroDeRevista = numeroDeRevista;
    }

    public String getNombreDeRevista() {
        return nombreDeRevista;
    }

    public void setNombreDeRevista(String nombreDeRevista) {
        this.nombreDeRevista = nombreDeRevista;
    }

    @Override
    public String toString() {
        return super.toString()+"Revista{" + "numeroDeRevista=" + numeroDeRevista + ", nombreDeRevista=" + nombreDeRevista + '}';
    }

    public Revista(int numeroDeRevista, String nombreDeRevista, String titulo, int anioDePublicacion) {
        super(titulo, anioDePublicacion);
        this.numeroDeRevista = numeroDeRevista;
        this.nombreDeRevista = nombreDeRevista;
    }
    public Revista(String titulo, int anioDePublicacion, int numeroDeRevista, String nombreDeRevista) {
        super(titulo, anioDePublicacion);
        this.numeroDeRevista = numeroDeRevista;
        this.nombreDeRevista = nombreDeRevista;
    }
}
