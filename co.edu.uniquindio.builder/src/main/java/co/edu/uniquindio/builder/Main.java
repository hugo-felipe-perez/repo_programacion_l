package co.edu.uniquindio.builder;

import co.edu.uniquindio.builder.model.Cliente;
import co.edu.uniquindio.builder.model.ClienteVP;

public class Main {
    public static void main(String[] args) {
        crearCliente();
    }

    private static void crearCliente() {
        Cliente cliente1 = new Cliente();
        cliente1.setNombre("Hugo Felipe");
        cliente1.setApellido("Perez Giraldo");
        cliente1.setCedula("1234567");
        cliente1.setEdad(22);
        cliente1.setPeso(64);
        cliente1.setEstatura(1.78);

        Cliente cliente2 = new Cliente();
        cliente2.setNombre("Sebastian");
        cliente2.setApellido("Torres");
        cliente2.setCedula("1252712");

        ClienteVP clienteVP1 = new ClienteVP();
        clienteVP1.setNombre("Huguito");
        clienteVP1.setApellido("Giraldo");
        clienteVP1.setCedula("8219281");
        clienteVP1.setEdad(22);
        clienteVP1.setPeso(64);
        clienteVP1.setEstatura(1.78);
        clienteVP1.setDireccion("calle 20 63-45");
        clienteVP1.setEstadoCivil("soltero");
        clienteVP1.setCorreo("hiahsuahs@gmail.com");
    }

}