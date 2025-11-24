package cr.ac.ucenfotec.helpdesku.dl;

import cr.ac.ucenfotec.helpdesku.bl.entities.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class RepomemoryTest {

    @Test
    public void guardarUsuarioDebeAgregarALaLista() {
        Repomemory repo = new Repomemory();
        Usuario u = new Usuario(
                "Luis",
                "pass",
                "estudiante",
                "luis@ejemplo.com",
                "8888-0000"
        );

        repo.guardarUsuario(u);
        List<Usuario> usuarios = repo.obtenerTodosUsuarios();

        assertEquals(1, usuarios.size());
        assertEquals("Luis", usuarios.get(0).getNombre());
    }

    @Test
    public void guardarDepartamentoDebeAgregarALaLista() {
        Repomemory repo = new Repomemory();
        Departamento d = new Departamento(
                "Soporte",
                "Soporte técnico",
                "soporte@ejemplo.com",
                "1234"
        );

        repo.guardarDepartamento(d);
        List<Departamento> deps = repo.obtenerTodosDepartamentos();

        assertEquals(1, deps.size());
        assertEquals("Soporte", deps.get(0).getNombre());
    }

    @Test
    public void guardarTicketDebeAgregarALaLista() {
        Repomemory repo = new Repomemory();
        Usuario u = new Usuario(
                "Luis",
                "pass",
                "estudiante",
                "luis@ejemplo.com",
                "8888-0000"
        );
        Departamento d = new Departamento(
                "Soporte",
                "Soporte técnico",
                "soporte@ejemplo.com",
                "1234"
        );
        Ticket t = new Ticket(
                "Sin Internet",
                "No conecta",
                u,
                "Abierto",
                d
        );

        repo.guardarTicket(t);
        List<Ticket> tickets = repo.obtenerTodosTickets();

        assertEquals(1, tickets.size());
        assertEquals("Sin Internet", tickets.get(0).getAsunto());
    }
}