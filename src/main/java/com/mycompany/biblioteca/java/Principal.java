package com.mycompany.biblioteca.java;

public class Principal {
    public static void main(String[] args) {
        Publicacion libro1 = new Libro("libro bueno", 2005, "escritor1", 867);
        Publicacion revista1 = new Revista("revista buena", 2004, 123, "cientifico1");
        Publicacion libro2 = new Libro("libro malo", 1999, "escritor2", 555);
        Publicacion revista2 = new Revista("revista mala", 1998, 321, "cientifico2");
        
        
        System.out.println(libro1); 
        System.out.println(revista1);
        System.out.println(libro2);
        System.out.println(revista2);
    }
}
