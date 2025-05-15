import java.util.Date;

public class Main {
    public static void main(String[] args) {
        TicketSoporte ticket = new TicketSoporte(123, "lasdasdw");

        System.out.println(ticket.mostrarDetalle());
        ticket.cerrarTicket();
        System.out.println(ticket.mostrarDetalle());


    }
}