package co.edu.uniquindio.biblioteca.model;

import java.time.LocalDate;

public class Prestamo {
    private Libro libroAsociado;
    private Miembro miembroAsociado;
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;
}
