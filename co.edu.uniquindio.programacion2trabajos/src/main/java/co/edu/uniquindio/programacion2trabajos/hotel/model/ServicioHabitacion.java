package co.edu.uniquindio.programacion2trabajos.hotel.model;

public class ServicioHabitacion {

    private Servicio servicio;

    public ServicioHabitacion(Servicio servicio) {

      //  super("Servicio de Habitación",);
        this.servicio = servicio;
    }

    public double getPrecio () {
        return this.servicio.getPrecio();
    }

    public String getNombre () {
        return this.servicio.getNombre();
    }



    /*@Override
    public void ejecutarServicio() {
        System.out.println("Ejecutando servicio en la habitación: " + getNombre());
        servicio.ejecutarServicio();
    }

    @Override
    public void consumir() {

    }*/
}
