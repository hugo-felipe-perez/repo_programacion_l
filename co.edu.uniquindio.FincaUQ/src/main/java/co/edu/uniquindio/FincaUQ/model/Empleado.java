package co.edu.uniquindio.FincaUQ.model;

import java.util.ArrayList;
import java.util.List;

public class Empleado {
    private String nombre;
    private String apellido;
    private String cedula;
    private int edad;
    private double salario;
    private int numeroHorasTrabajo;
    private List<Tarea> listaTareasAsociadas = new ArrayList<>();
}
