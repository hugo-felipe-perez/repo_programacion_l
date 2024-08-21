package co.edu.uniquindio.empresaTransporte;

import co.edu.uniquindio.empresaTransporte.model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EmpresaTransporte empresaTransporte = inicializarDatos();

        System.out.println("-------CREAR PROPIETARIO------");
        Propietario propietario3 = empresaTransporte.crearPropietario(
                leerString("ingrese el nombre del propietarios: "),
                leerString("ingrese la cedula del propietario: "),
                leerString("ingrese el email del propietario: "),
                leerInt("ingrese la edad del propietario: "),
                leerString("ingrese el numero de celular del propietario: ")
        );

        System.out.println("-------CREAR VEHICULO CARGA------");
        Vehiculo vehiculoCarga3 = empresaTransporte.crearVehiculoCarga(
                leerString("ingrese la placa: "),
                leerString("ingrese el modelo: "),
                leerString("ingrese la marca: "),
                leerString("ingrese el color: "),
                leerString("ingrese el numero de chasis: "),
                leerDouble("ingrese la capacidad de carga: "),
                leerInt("ingrese el numero de ejes: ")
        );

        System.out.println("-------CREAR VEHICULO TRANSPORTE------");
        Vehiculo vehiculoTransporte3 = empresaTransporte.crearVehiculoTransporte(
                leerString("ingrese la placa: "),
                leerString("ingrese el modelo: "),
                leerString("ingrese la marca: "),
                leerString("ingrese el color: "),
                leerString("ingrese el numero de chasis: "),
                leerInt("ingrese el numero de pasajeros maximo: ")
        );


        //asociar vehiculos a propietario
        empresaTransporte.asociarVehiculoPropietario(propietario3,vehiculoCarga3);

        System.out.println("-------VEHICULOS ASOCIADOS--------");
        System.out.println("los vehiculos asociados al propietario " +propietario3.getNombre() +
                " son: " + propietario3.getListaVehiculosAsociados());

        //mostrar total pasajeros movidos en un dia
        calcularTotalPasajeros(empresaTransporte.getListaVehiculosTransporte(),leerString(
                "ingrese el numero de placa del vehiculo que desea conocer cuantas personas transporto: "
        ));

        //mostrar los usuarios que pesen mas de determinado peso
        System.out.println("---------USUARIOS PESO MAYOR--------");
        mostrarUsuariosMayorPeso(
                leerDouble("ingrese el peso que deseado para obtener los usuarios que sobrepasen ese peso: "),
                empresaTransporte.getListaUsuarios());

        //motrar propietarios de mas de 40 años
        System.out.println("--------PROPIETARIOS MAYORES 40 AÑOS--------");
        mostrarPropietariosMayores(empresaTransporte.getListaPropietarios());
    }

    private static EmpresaTransporte inicializarDatos (){

        // Empresa transporte
        EmpresaTransporte empresaTransporte = new EmpresaTransporte();
        empresaTransporte.setNombre("Envia");
        System.out.println("EMPRESA TRANSPORTE: "+empresaTransporte.getNombre());
        System.out.println("---------------------------------------------------------------------------------");

        // propietarios
        Propietario propietario1 = new Propietario();
        propietario1.setNombre("Hugo");
        propietario1.setNumIdentificacion("1004917336");
        propietario1.setEmail("hugo@gmail.com");
        propietario1.setEdad(22);
        propietario1.setNumCelular("3007321386");
        empresaTransporte.getListaPropietarios().add(propietario1);
        System.out.println("propietario 1: "+propietario1.getNombre());

        Propietario propietario2 = new Propietario();
        propietario2.setNombre("Andres");
        propietario2.setNumIdentificacion("34923891");
        propietario2.setEmail("andres@gmail.com");
        propietario2.setEdad(50);
        propietario2.setNumCelular("839721897");
        empresaTransporte.getListaPropietarios().add(propietario2);
        System.out.println("propietario 2: "+propietario2.getNombre());

        // Vehiculos de carga
        VehiculoCarga vehiculoCarga1 = new VehiculoCarga();
        vehiculoCarga1.setPlaca("KDJ-724");
        vehiculoCarga1.setModelo("2020");
        vehiculoCarga1.setMarca("MERCEDEZ");
        vehiculoCarga1.setColor("blanco");
        vehiculoCarga1.setCapacidadCarga(3.5);
        vehiculoCarga1.setNumeroEjes(4);
        empresaTransporte.getListaVehiculosCarga().add(vehiculoCarga1);
        System.out.println("Vehiculo de carga 1: "+vehiculoCarga1.getPlaca());

        VehiculoCarga vehiculoCarga2 = new VehiculoCarga();
        vehiculoCarga2.setPlaca("KHN-724");
        vehiculoCarga2.setModelo("2019");
        vehiculoCarga2.setMarca("MERCEDEZ");
        vehiculoCarga2.setColor("blanco");
        vehiculoCarga2.setCapacidadCarga(3.5);
        vehiculoCarga2.setNumeroEjes(4);
        empresaTransporte.getListaVehiculosCarga().add(vehiculoCarga2);
        System.out.println("Vehiculo de carga 2: "+vehiculoCarga2.getPlaca());

        // Vehiculos de transporte
        VehiculoTransporte vehiculoTransporte1 = new VehiculoTransporte();
        vehiculoTransporte1.setPlaca("JVD-724");
        vehiculoTransporte1.setModelo("2020");
        vehiculoTransporte1.setMarca("CHEVROLET");
        vehiculoTransporte1.setColor("azul");
        vehiculoTransporte1.setMaximoPasajeros(20);
        empresaTransporte.getListaVehiculosTransporte().add(vehiculoTransporte1);
        System.out.println("Vehiculo de traansporte 1: "+vehiculoTransporte1.getPlaca());

        VehiculoTransporte vehiculoTransporte2 = new VehiculoTransporte();
        vehiculoTransporte2.setPlaca("LCJ-724");
        vehiculoTransporte2.setModelo("2015");
        vehiculoTransporte2.setMarca("RENAULT");
        vehiculoTransporte2.setColor("blanco");
        vehiculoTransporte2.setMaximoPasajeros(15);
        empresaTransporte.getListaVehiculosTransporte().add(vehiculoTransporte2);
        System.out.println("Vehiculo de Transporte 2: "+vehiculoTransporte2.getPlaca());

        VehiculoTransporte vehiculoTransporte3 = new VehiculoTransporte();
        vehiculoTransporte3.setPlaca("JNC-724");
        vehiculoTransporte3.setModelo("2018");
        vehiculoTransporte3.setMarca("NISSAN");
        vehiculoTransporte3.setColor("blanco");
        vehiculoTransporte3.setMaximoPasajeros(18);
        empresaTransporte.getListaVehiculosTransporte().add(vehiculoTransporte3);
        System.out.println("Vehiculo de transporte 3: "+vehiculoTransporte3.getPlaca());

        //usuarios
        Usuario usuario1 = new Usuario();
        usuario1.setNombre("Luis");
        usuario1.setEdad(45);
        usuario1.setPeso(65.5);
        empresaTransporte.getListaUsuarios().add(usuario1);

        Usuario usuario2 = new Usuario();
        usuario2.setNombre("Diana");
        usuario2.setEdad(57);
        usuario2.setPeso(85.2);
        empresaTransporte.getListaUsuarios().add(usuario2);

        Usuario usuario3 = new Usuario();
        usuario3.setNombre("Sofia");
        usuario3.setEdad(19);
        usuario3.setPeso(80.5);
        empresaTransporte.getListaUsuarios().add(usuario3);

        return empresaTransporte;

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

    public static float leerFloat (String mensaje){

        float captura;
        System.out.printf(mensaje);
        Scanner leer = new Scanner(System.in);
        captura = leer.nextFloat();
        return captura;
    }

    private static int calcularTotalPasajeros (List<VehiculoTransporte> vehiculos,String placa){
        int numeroVueltasDias = 7;
        int totalPasajeros = 0;
        for (int i = 0; i < vehiculos.size(); i++){
            if (vehiculos.get(i).getPlaca().equalsIgnoreCase(placa)){
                totalPasajeros += vehiculos.get(i).getMaximoPasajeros() * numeroVueltasDias;
                break;
            }
        }
        System.out.println("el vehiculo con placas " + placa + " ha transportado un total de " + totalPasajeros +
                " personas el dia de hoy");
        return totalPasajeros;
    }

    private static void mostrarUsuariosMayorPeso (Double peso, List<Usuario> usuarios){
        List<String> listaUsuariosMayorPeso = new ArrayList<>();
        for (Usuario usuario : usuarios){
            if (usuario.getPeso() >= peso){
                listaUsuariosMayorPeso.add(usuario.getNombre());
            }
        }
        System.out.println("los usuarios que pensan mas de " + peso + " son: " +listaUsuariosMayorPeso);
    }

    private static void mostrarPropietariosMayores (List<Propietario> propietarios){
        int propietariosMayor = 0;
        for (Propietario propietario:propietarios){
            if ( propietario.getEdad() >= 40 ){
                propietariosMayor++;
            }
        }
        System.out.println("la cantidad de propietarios mayores de 40 años son: " + propietariosMayor);
    }

}