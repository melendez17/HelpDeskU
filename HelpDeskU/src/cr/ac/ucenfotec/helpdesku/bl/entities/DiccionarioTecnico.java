package cr.ac.ucenfotec.helpdesku.bl.entities;

/**
 * Representa un diccionario especializado en palabras técnicas dentro del sistema HelpDesk U.
 * Esta clase hereda de {@link DiccionarioGeneral} y permite manejar palabras
 * técnicas con su categoría asociada para análisis o clasificación.
 */
public class DiccionarioTecnico extends DiccionarioGeneral {

    /**
     * Constructor vacío.
     * Llama al constructor vacío de la clase padre {@link DiccionarioGeneral}.
     */
    public DiccionarioTecnico() {
        super(); // Llama al constructor vacío del padre
    }

    /**
     * Constructor que recibe una palabra técnica y su categoría asociada.
     * Llama al constructor correspondiente de la clase padre.
     *
     * @param palabra Palabra técnica que se registrará en el diccionario.
     * @param categoria Categoría o clasificación de la palabra técnica.
     */
    public DiccionarioTecnico(String palabra, String categoria) {
        super(palabra, categoria); // Llama al constructor del padre
    }
}
