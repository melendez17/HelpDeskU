package cr.ac.ucenfotec.helpdesku.bl.entities;
import cr.ac.ucenfotec.helpdesku.bl.entities.Usuario;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UsuarioTest {

    @Test
    public void constructorConParametrosDebeInicializarAtributos() {
        Usuario usuario = new Usuario(
                "Luis",
                "secret",
                "estudiante",
                "luis@ejemplo.com",
                "8888-0000"
        );

        assertEquals("Luis", usuario.getNombre());
        assertEquals("estudiante", usuario.getRol());
        assertEquals("luis@ejemplo.com", usuario.getCorreo());
        assertEquals("8888-0000", usuario.getTelefono());
        assertEquals("secret", usuario.getPassword());
    }
}