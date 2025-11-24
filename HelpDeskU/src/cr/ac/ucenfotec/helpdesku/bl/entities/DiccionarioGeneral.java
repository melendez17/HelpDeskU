package cr.ac.ucenfotec.helpdesku.bl.entities;

import java.util.UUID;

/**
 * Representa una entrada del diccionario general utilizado por el sistema HelpDesk U.
 * Este diccionario permite almacenar palabras clasificadas según su categoría
 * (por ejemplo: emoción, recomendación, urgencia, etc.).
 * Cada entrada posee una identificación única generada mediante UUID.
 */
public class DiccionarioGeneral  {

    /**
     * Identificador único generado automáticamente con UUID.
     */
    private String identificacion;

    /**
     * Clasificación o categoría asignada a la palabra.
     */
    private String clasificacion;

    /**
     * Palabra registrada dentro del diccionario.
     */
    private String palabra;

    /**
     * Constructor vacío. Se utiliza para procesos que requieren
     * instancias sin inicializar (como serialización o frameworks).
     */
    public DiccionarioGeneral() {
    }

    /**
     * Constructor que inicializa una entrada del diccionario general.
     * La identificación se genera automáticamente.
     *
     * @param clasificacion Clasificación o categoría de la palabra.
     * @param palabra Palabra que se desea registrar.
     */
    public DiccionarioGeneral(String clasificacion, String palabra) {
        this.identificacion = UUID.randomUUID().toString();
        this.clasificacion = clasificacion;
        this.palabra = palabra;
    }

    /**
     * Obtiene la identificación única de la entrada del diccionario.
     *
     * @return Identificación generada mediante UUID.
     */
    public String getIdentificacion() {
        return identificacion;
    }

    /**
     * Establece una nueva identificación para la entrada del diccionario.
     *
     * @param identificacion Nueva identificación asignada.
     */
    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    /**
     * Obtiene la clasificación asignada a la palabra.
     *
     * @return Clasificación de la palabra.
     */
    public String getClasificacion() {
        return clasificacion;
    }

    /**
     * Establece una nueva clasificación para la palabra del diccionario.
     *
     * @param clasificacion Nueva clasificación asignada.
     */
    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    /**
     * Obtiene la palabra registrada en el diccionario.
     *
     * @return Palabra almacenada.
     */
    public String getPalabra() {
        return palabra;
    }

    /**
     * Establece una nueva palabra en la entrada del diccionario.
     *
     * @param palabra Nueva palabra a registrar.
     */
    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    /**
     * Devuelve una representación en texto de la entrada del diccionario.
     *
     * @return Cadena con los valores de los atributos.
     */
    @Override
    public String toString() {
        return "DiccionarioGeneral{" +
                "identificacion=" + identificacion +
                ", clasificacion='" + clasificacion + '\'' +
                ", palabra='" + palabra + '\'' +
                '}';
    }
}
