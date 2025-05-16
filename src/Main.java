public class Main {
    public static void main(String[] args) {
        SistemaSoporte sistema = new SistemaSoporte();

        // Crear usuarios
        Usuario usuario1 = new Usuario(1001, "Francisco", "fran@example.com");
        Usuario usuario2 = new Usuario(1002, "Ciro", "ciro@gmail.com");

        // Crear técnicos
        Tecnico tecnico1 = new Tecnico(101, "Carlos", "Soporte de Hardware");
        Tecnico tecnico2 = new Tecnico(102, "Manolo", "Redes");

        // Crear tickets sin usuario
        TicketSoporte ticket1 = new TicketSoporte(1, "No funciona el teclado");
        TicketSoporte ticket2 = new TicketSoporte(2, "Problemas con la conexión Wi-Fi");

        // Crear tickets con usuario
        TicketSoporte ticket3 = new TicketSoporte(3, "Pantalla en negro", usuario1);
        TicketSoporte ticket4 = new TicketSoporte(4, "No hay sonido", usuario2);

        // Agregar tickets al sistema
        sistema.agregarTicket(ticket1);
        sistema.agregarTicket(ticket2);
        sistema.agregarTicket(ticket3);
        sistema.agregarTicket(ticket4);

        // Asignar técnicos a los tickets
        sistema.asignarTecnico(ticket1, tecnico1);
        sistema.asignarTecnico(ticket3, tecnico2);

        // Mostrar detalles de los tickets antes de cerrar
        System.out.println("Detalles d tickets:");
        System.out.println(ticket1.mostrarDetalle());
        System.out.println(ticket2.mostrarDetalle());
        System.out.println(ticket3.mostrarDetalle());
        System.out.println(ticket4.mostrarDetalle());

        // Listar tickets abiertos
        System.out.println("\nTickets abiertos:");
        sistema.listarTicketsAbiertos();

        // Cerrar algunos tickets
        ticket1.cerrarTicket();
        ticket3.cerrarTicket();

        // Listar tickets cerrados
        System.out.println("\nTickets cerrados después actualizar:");
        sistema.listarTicketsCerrados();

        // Listar nuevamente los tickets abiertos
        System.out.println("\nTickets abiertos después de cerrar algunos:");
        sistema.listarTicketsAbiertos();

        // Verificación de sobrecarga de constructores
        System.out.println("\nCreación de ticket sin usuario:");
        TicketSoporte ticket5 = new TicketSoporte(5, "Error de software");
        sistema.agregarTicket(ticket5);
        System.out.println(ticket5.mostrarDetalle());

        System.out.println("\nCreación de ticket con usuario:");
        TicketSoporte ticket6 = new TicketSoporte(6, "Error de configuración", usuario1);
        sistema.agregarTicket(ticket6);
        System.out.println(ticket6.mostrarDetalle());
    }
}