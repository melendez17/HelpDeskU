package cr.ac.ucenfotec.helpdesku.bl.entities;

import java.util.UUID;

/**
 * Representa un departamento dentro del sistema HelpDesk U.
 * Cada departamento contiene información básica como nombre,
 * descripción, correo de contacto y extensión telefónica.
 * La identificación se genera automáticamente mediante UUID.
 */
public class Departamento {
    /**
     * Identificador único del departamento generado con UUID.
     */
    private String identificacion;

    /**
     * Nombre del departamento.
     */
    private String nombre;

    /**
     * Descripción general del departamento.
     */
    private String descripcion;

    /**
     * Correo electrónico de contacto del departamento.
     */
    private String correo;

    /**
     * Extensión telefónica del departamento.
     */
    private String extensionTelefono;

    /**
     * Constructor vacío requerido para ciertos procesos como serialización
     * o frameworks que requieren instancias sin parámetros.
     */
    public Departamento() {

    }

    /**
     * Crea un nuevo departamento con la información proporcionada
     * y genera automáticamente una identificación única utilizando UUID.
     *
     * @param nombre Nombre del departamento.
     * @param descripcion Descripción del departamento.
     * @param correo Correo electrónico de contacto del departamento.
     * @param extensionTelefono Extensión telefónica del departamento.
     */
    public Departamento(String nombre, String descripcion, String correo, String extensionTelefono) {
        this.identificacion = UUID.randomUUID().toString();
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.correo = correo;
        this.extensionTelefono = extensionTelefono;
    }

    /**
     * Obtiene la identificación única del departamento.
     *
     * @return Identificación del departamento.
     */
    public String getIdentificacion() {
        return identificacion;
    }

    /**
     * Establece la identificación del departamento.
     *
     * @param identificacion Nueva identificación del departamento.
     */
    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    /**
     * Obtiene el nombre del departamento.
     *
     * @return Nombre del departamento.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del departamento.
     *
     * @param nombre Nuevo nombre del departamento.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la descripción del departamento.
     *
     * @return Descripción del departamento.
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Establece la descripción del departamento.
     *
     * @param descripcion Nueva descripción del departamento.
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Obtiene el correo electrónico del departamento.
     *
     * @return Correo de contacto del departamento.
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Establece el correo electrónico del departamento.
     *
     * @param correo Nuevo correo del departamento.
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * Obtiene la extensión telefónica del departamento.
     *
     * @return Extensión telefónica del departamento.
     */
    public String getExtensionTelefono() {
        return extensionTelefono;
    }

    /**
     * Establece la extensión telefónica del departamento.
     *
     * @param extensionTelefono Nueva extensión telefónica.
     */
    public void setExtensionTelefono(String extensionTelefono) {
        this.extensionTelefono = extensionTelefono;
    }

    /**
     * Devuelve una representación en texto del departamento,
     * útil para depuración o visualización.
     *
     * @return Cadena con los atributos del departamento.
     */
    @Override
    public String toString() {
        return "Departamento{" +
                "identificacion='" + identificacion + '\'' +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", correo='" + correo + '\'' +
                ", extensionTelefono='" + extensionTelefono + '\'' +
                '}';
    }
}
