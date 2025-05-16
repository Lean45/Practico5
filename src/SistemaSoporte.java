import java.util.ArrayList;
import java.util.List;

public class SistemaSoporte {
    private List<TicketSoporte> tickets;

    public SistemaSoporte() {
        this.tickets = new ArrayList<>();
    }

    public void agregarTicket(TicketSoporte ticket) {
        tickets.add(ticket);
        System.out.println("Ticket agregado: " + ticket.mostrarDetalle());
    }

    public void asignarTecnico(TicketSoporte ticket, Tecnico tecnico) {
        if (tickets.contains(ticket)) {
            System.out.println("Asignando técnico: " + tecnico + " al ticket: " + ticket.mostrarDetalle());
        } else {
            System.out.println("El ticket no existe");
        }
    }

    public void listarTicketsAbiertos() {
        System.out.println("Tickets Abiertos:");
        for (TicketSoporte ticket : tickets) {
            if (ticket.getEstado() == Estado.ABIERTO) {
                System.out.println(ticket.mostrarDetalle());
            }
        }
    }

    public void listarTicketsCerrados() {
        System.out.println("Tickets Cerrados:");
        for (TicketSoporte ticket : tickets) {
            if (ticket.getEstado() == Estado.CERRADO) {
                System.out.println(ticket.mostrarDetalle());
            }
        }
    }
}