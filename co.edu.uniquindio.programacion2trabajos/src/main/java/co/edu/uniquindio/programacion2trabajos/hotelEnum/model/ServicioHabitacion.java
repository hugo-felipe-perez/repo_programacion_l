package co.edu.uniquindio.programacion2trabajos.hotelEnum.model;

import co.edu.uniquindio.programacion2trabajos.hotelEnum.enums.TipoServicio;
import co.edu.uniquindio.programacion2trabajos.hotelEnum.model.Servicio;

public class ServicioHabitacion extends  Servicio {


    public ServicioHabitacion(TipoServicio tipoServicio, double precio) {

        super(tipoServicio, precio);
    }

    @Override
    public void ejecutarServicio() {
        System.out.println("Ejecutando el servicio de: " + getTipoServicio());
    }
}
