package cr.ac.ucenfotec.helpdesku.bl.entities;

import java.util.UUID;

/**
 * Clase que representa un ticket dentro del sistema HelpDesk U.
 * Cada ticket contiene información sobre el asunto, descripción, estado,
 * usuario que lo crea y departamento al que está asignado.
 */
public class Ticket {

    /**
     * Identificador único del ticket generado mediante UUID.
     */
    private String identificacion;

    /**
     * Asunto del ticket.
     */
    private String asunto;

    /**
     * Descripción detallada del ticket.
     */
    private String descripcion;

    /**
     * Estado actual del ticket (por ejemplo: "Abierto", "En progreso", "Cerrado").
     */
    private String estado;

    /**
     * Usuario que creó el ticket.
     */
    private Usuario usuario;

    /**
     * Departamento al que está asignado el ticket.
     */
    private Departamento departamento;

    /**
     * Constructor vacío.
     * Se utiliza para crear un ticket sin inicializar sus atributos.
     */
    public Ticket() {

    }

    /**
     * Constructor que permite crear un ticket con todos los datos desde el inicio.
     * La identificación se genera automáticamente mediante UUID.
     *
     * @param asunto Asunto del ticket.
     * @param descripcion Descripción del ticket.
     * @param usuario Usuario que crea el ticket.
     * @param estado Estado inicial del ticket.
     * @param departamento Departamento asignado al ticket.
     */
    public Ticket(String asunto, String descripcion, Usuario usuario, String estado, Departamento departamento) {
        this.identificacion = UUID.randomUUID().toString();
        this.asunto = asunto;
        this.descripcion = descripcion;
        this.estado = estado;
        this.usuario = usuario;
        this.departamento = departamento;
    }

    // ================== Getters y Setters ==================

    /**
     * Obtiene la identificación del ticket.
     *
     * @return Identificación única del ticket.
     */
    public String getIdentificacion() {
        return identificacion;
    }

    /**
     * Establece la identificación del ticket.
     *
     * @param identificacion Nueva identificación a asignar.
     */
    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    /**
     * Obtiene el asunto del ticket.
     *
     * @return Asunto del ticket.
     */
    public String getAsunto() {
        return asunto;
    }

    /**
     * Establece el asunto del ticket.
     *
     * @param asunto Nuevo asunto del ticket.
     */
    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    /**
     * Obtiene la descripción del ticket.
     *
     * @return Descripción del ticket.
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Establece la descripción del ticket.
     *
     * @param descripcion Nueva descripción del ticket.
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Obtiene el estado del ticket.
     *
     * @return Estado actual del ticket.
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Establece el estado del ticket.
     *
     * @param estado Nuevo estado del ticket.
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * Obtiene el usuario que creó el ticket.
     *
     * @return Usuario asociado al ticket.
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * Establece el usuario que creó el ticket.
     *
     * @param usuario Nuevo usuario asociado.
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    /**
     * Obtiene el departamento asignado al ticket.
     *
     * @return Departamento asociado.
     */
    public Departamento getDepartamento() {
        return departamento;
    }

    /**
     * Establece el departamento asignado al ticket.
     *
     * @param departamento Nuevo departamento asociado.
     */
    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    // ================== Métodos ==================

    /**
     * Devuelve una representación en texto del ticket,
     * incluyendo identificación, asunto, descripción, estado, usuario y departamento.
     *
     * @return Cadena con los valores de los atributos del ticket.
     */
    @Override
    public String toString() {
        return "Ticket{" +
                "identificacion='" + identificacion + '\'' +
                ", asunto='" + asunto + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", estado='" + estado + '\'' +
                ", usuario=" + (usuario != null ? usuario.getNombre() : "N/A") +
                ", departamento=" + (departamento != null ? departamento.getNombre() : "N/A") +
                '}';
    }
}
