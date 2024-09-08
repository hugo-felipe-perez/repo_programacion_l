package co.edu.uniquindio.programacion2trabajos.hotel;

import co.edu.uniquindio.programacion2trabajos.hotel.model.Cliente;
import co.edu.uniquindio.programacion2trabajos.hotel.model.Habitacion;
import co.edu.uniquindio.programacion2trabajos.hotel.model.Hotel;
import co.edu.uniquindio.programacion2trabajos.hotel.model.Reserva;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class MainHotel {
    public static void main(String[] args) {
        Hotel hotel = inicializarDatos();
        Habitacion habitacion1 = hotel.getListaHabitaciones().get(0);
        Habitacion habitacion2 = hotel.getListaHabitaciones().get(1);
        System.out.println("--------CREAR CLIENTE--------");
        Cliente cliente1 = hotel.crearCliente(
                leerString("Ingrese el nombre del cliente: "),
                leerString("Ingrese el DNI del cliente: ")
        );
        System.out.println("-------CREAR RESERVA----");
        Reserva reserva1 = hotel.crearReserva(
                leerFecha("Introduce la fecha de entrada (dd/MM/yyyy): "),
                leerFecha("Introduce la fecha de salida (dd/MM/yyyy): ")
        );
        hotel.asociarReservaCliente(reserva1,cliente1);
        hotel.asociarReservaHabitacion(reserva1,hotel.getListaHabitaciones().get(0));
        System.out.println("al clinte "+cliente1.getNombre() + " se le a asociado la habitacion: "+
                reserva1.getHabitacionAsociada());
        System.out.println("-------crear otro cliente----");
        Cliente cliente2 = hotel.crearCliente(
                leerString("Ingrese el nombre del cliente: "),
                leerString("Ingrese el DNI del cliente: ")
        );
        System.out.println("-------CREAR RESERVA----");
        Reserva reserva2 = hotel.crearReserva(
                leerFecha("Introduce la fecha de entrada (dd/MM/yyyy): "),
                leerFecha("Introduce la fecha de salida (dd/MM/yyyy): ")
        );
        hotel.asociarReservaCliente(reserva2,cliente2);
        hotel.asociarReservaHabitacion(reserva2,hotel.getListaHabitaciones().get(1));
        System.out.println("al clinte "+cliente2.getNombre() + " se le a asociado la habitacion: "+
                reserva2.getHabitacionAsociada());
    }

    private static Hotel inicializarDatos (){

        Hotel hotel = new Hotel("Atlantis");

        Habitacion habitacion1 = new Habitacion();
        habitacion1.setNumero("1234");
        habitacion1.setPrecio(100.000);
        hotel.getListaHabitaciones().add(habitacion1);

        Habitacion habitacion2 = new Habitacion();
        habitacion2.setNumero("1237");
        habitacion2.setPrecio(150.000);
        hotel.getListaHabitaciones().add(habitacion2);
        System.out.println("---------HABITACIONES DISPONIBLES--------");
        System.out.println("- "+ habitacion1.getNumero() );
        System.out.println("- "+ habitacion2.getNumero() );
        return hotel;
    }


    public static String leerString (String mensaje){

        String captura;
        System.out.printf(mensaje);
        Scanner teclado = new Scanner(System.in);
        captura = teclado.nextLine();
        return captura;
    }

    public static int leerInt (String mensaje){

        int captura;
        System.out.printf(mensaje);
        Scanner leer = new Scanner(System.in);
        captura = leer.nextInt();
        return captura;
    }

    public static Double leerDouble (String mensaje){

        Double captura;
        System.out.printf(mensaje);
        Scanner leer = new Scanner(System.in);
        captura = leer.nextDouble();
        return captura;
    }

    public static LocalDate leerFecha(String mensaje) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // Formato: día/mes/año
        LocalDate fecha = null;
        boolean fechaValida = false;

        while (!fechaValida) {
            System.out.print(mensaje);
            String entrada = scanner.nextLine();

            try {
                fecha = LocalDate.parse(entrada, formato);
                fechaValida = true;
            } catch (DateTimeParseException e) {
                System.out.println("Fecha no válida, por favor intenta de nuevo.");
            }
        }
        return fecha;
    }

}
