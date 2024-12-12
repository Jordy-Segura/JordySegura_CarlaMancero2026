/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.libreria.clases;

/**
 *
 * @author jordy
 */
public class Compra {
    public void mostrarDetallesLibro(Libro libro) {
        double precioConIVA = libro.calcularPrecioConIVA();
        System.out.println("Libro: " + libro.getTitulo());
        System.out.println("Género: " + libro.getGenero());
        System.out.println("Precio sin IVA: " + libro.getPrecio());
        System.out.println("Precio con IVA: " + precioConIVA);
        System.out.println("");
    }
    

    public void mostrarClienteYlibro(Cliente cliente, Libro libro) {
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Libro comprado: " + libro.getTitulo());
        System.out.println("Género: " + libro.getGenero());
        System.out.println("Precio sin IVA: " + libro.getPrecio());
        System.out.println("Precio con IVA: " + libro.calcularPrecioConIVA());
        System.out.println("");
    }
}