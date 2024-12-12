/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.libreria.clases;

import ec.edu.espoch.libreria.enumeraciones.Genero;

/**
 *
 * @author jordy
 */
// Clase Libro
public class Libro {
    private String titulo;
    private String autor;
    private double precio;
    private Genero genero;

    public Libro(String titulo, String autor, double precio, Genero genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public double getPrecio() {
        return precio;
    }

    public Genero getGenero() {
        return genero;
    }

    public double calcularPrecioConIVA() {
        return precio * 0.12; 
    }
    
}