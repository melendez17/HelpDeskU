package cr.ac.ucenfotec.helpdesku.bl.entities;

/**
 * Representa un diccionario especializado para palabras relacionadas con emociones.
 * Esta clase hereda de {@link DiccionarioGeneral} y permite manejar palabras
 * junto con su emoción asociada dentro del análisis de texto del sistema HelpDesk U.
 */
public class DiccionarioEmocion extends DiccionarioGeneral {

    /**
     * Constructor vacío.
     * Llama al constructor vacío de la clase padre {@link DiccionarioGeneral}.
     */
    public DiccionarioEmocion() {
        super(); // Llama al constructor vacío del padre
    }

    /**
     * Constructor que recibe una palabra y una emoción asociada.
     * Llama al constructor correspondiente de la clase padre.
     *
     * @param palabra Palabra que se registrará en el diccionario emocional.
     * @param emocion Emoción asociada a la palabra.
     */
    public DiccionarioEmocion(String palabra, String emocion) {
        super(palabra, emocion); // Llama al constructor del padre
    }
}
