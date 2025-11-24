package cr.ac.ucenfotec.helpdesku.bl.entities;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TicketTest {

    @Test
    public void constructorConParametrosDebeInicializarAtributos() {
        Usuario usuario = new Usuario(
                "Luis",
                "pass",
                "estudiante",
                "luis@ejemplo.com",
                "8888-0000"
        );
        Departamento dep = new Departamento(
                "Soporte",
                "Soporte técnico",
                "soporte@ejemplo.com",
                "1234"
        );

        Ticket ticket = new Ticket(
                "Sin Internet",
                "No conecta",
                usuario,
                "Abierto",
                dep
        );

        assertEquals("Sin Internet", ticket.getAsunto());
        assertEquals("No conecta", ticket.getDescripcion());
        assertEquals("Abierto", ticket.getEstado());
        assertEquals(usuario, ticket.getUsuario());
        assertEquals(dep, ticket.getDepartamento());
    }
}