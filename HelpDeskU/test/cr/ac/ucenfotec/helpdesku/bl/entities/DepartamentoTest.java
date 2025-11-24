package cr.ac.ucenfotec.helpdesku.bl.entities;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import cr.ac.ucenfotec.helpdesku.bl.entities.Departamento;

public class DepartamentoTest {

    @Test
    public void constructorConParametrosDebeInicializarAtributos() {
        Departamento dep = new Departamento(
                "Soporte",
                "Soporte técnico",
                "soporte@ejemplo.com",
                "1234"
        );

        assertEquals("Soporte", dep.getNombre());
        assertEquals("Soporte técnico", dep.getDescripcion());
        assertEquals("soporte@ejemplo.com", dep.getCorreo());
        assertEquals("1234", dep.getExtensionTelefono());
    }
}