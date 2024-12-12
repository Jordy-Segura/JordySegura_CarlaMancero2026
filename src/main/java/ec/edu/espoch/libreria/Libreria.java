/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espoch.libreria;

import ec.edu.espoch.libreria.clases.Cliente;
import ec.edu.espoch.libreria.clases.Compra;
import ec.edu.espoch.libreria.clases.Libro;
import ec.edu.espoch.libreria.enumeraciones.Genero;

/**
 *
 * @author Jordy
 * @author Carla
 */
public class Libreria {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Carla Mancero", "2200084214");
        Cliente cliente2 = new Cliente("Jordy Segura", "2200512321");
  
        Libro libro1 = new Libro("El niño de la pijama de rayas", "Jhon Boyce", 20, Genero.NO_FICCION);
        Libro libro2 = new Libro("El Pianista", "Anonimatus", 25, Genero.FICCION);

        Compra compra = new Compra();

        // Mostrar los detalles de los libros con IVA
        compra.mostrarDetallesLibro(libro1);
        compra.mostrarDetallesLibro(libro2);

        // Mostrar la relación entre el cliente y los libros
        compra.mostrarClienteYlibro(cliente1, libro1);
        compra.mostrarClienteYlibro(cliente2, libro2);
    }
}