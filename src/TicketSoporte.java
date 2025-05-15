import java.util.Date;

public class TicketSoporte {
    private int id;
    private String Descripcion;
    private Estado estado =  Estado.ABIERTO;
    private Date fecha;
    private Usuario usuario;

    public TicketSoporte(int id, String descripcion) {
        this.id = id;
        this.Descripcion = descripcion;
    }
    public TicketSoporte(int id, String descripcion, Usuario usuario) {
        this.id = id;
        this.Descripcion = descripcion;
        this.usuario = usuario;
    }

    public void cerrarTicket(){
        this.estado = Estado.CERRADO;
    }

    public String mostrarDetalle(){
        return "Id ticket: " + this.id + " \nDescripcion: " + this.Descripcion + " \nEstado: " + this.estado + " \nFecha: " + this.fecha;
    }


}
