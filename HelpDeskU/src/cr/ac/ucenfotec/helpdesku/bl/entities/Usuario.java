package cr.ac.ucenfotec.helpdesku.bl.entities;

/**
 * Clase que representa un usuario dentro del sistema HelpDesk U.
 * Cada usuario tiene un nombre, contraseña, rol, correo y teléfono.
 */
public class Usuario {

    /**
     * Nombre completo del usuario.
     */
    private String nombre;

    /**
     * Correo electrónico del usuario.
     */
    private String correo;

    /**
     * Contraseña del usuario (ya encriptada si se requiere).
     */
    private String password;

    /**
     * Número de teléfono del usuario.
     */
    private String telefono;

    /**
     * Rol del usuario dentro del sistema (por ejemplo: estudiante, funcionario, administrador).
     */
    private String rol;

    // ================== Constructores ==================

    /**
     * Constructor vacío.
     * Se utiliza para crear un usuario sin inicializar sus atributos.
     */
    public Usuario() {

    }

    /**
     * Constructor con parámetros que permite crear un usuario completo desde el inicio.
     *
     * @param nombre Nombre completo del usuario.
     * @param password Contraseña del usuario.
     * @param rol Rol del usuario dentro del sistema.
     * @param correo Correo electrónico del usuario.
     * @param telefono Número de teléfono del usuario.
     */
    public Usuario(String nombre, String password, String rol, String correo, String telefono) {
        this.nombre = nombre;
        this.password = password;
        this.rol = rol;
        this.correo = correo;
        this.telefono = telefono;
    }

    // ================== Getters y Setters ==================

    /**
     * Obtiene el nombre del usuario.
     *
     * @return Nombre del usuario.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del usuario.
     *
     * @param nombre Nuevo nombre a asignar.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el teléfono del usuario.
     *
     * @return Número de teléfono.
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Establece el teléfono del usuario.
     *
     * @param telefono Nuevo número de teléfono.
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Obtiene el correo electrónico del usuario.
     *
     * @return Correo electrónico.
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Establece el correo electrónico del usuario.
     *
     * @param correo Nuevo correo electrónico.
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * Obtiene el rol del usuario.
     *
     * @return Rol asignado.
     */
    public String getRol() {
        return rol;
    }

    /**
     * Establece el rol del usuario.
     *
     * @param rol Nuevo rol a asignar.
     */
    public void setRol(String rol) {
        this.rol = rol;
    }

    /**
     * Obtiene la contraseña del usuario.
     *
     * @return Contraseña.
     */
    public String getPassword() {
        return password;
    }

    /**
     * Establece la contraseña del usuario.
     *
     * @param password Nueva contraseña.
     */
    public void setPassword(String password) {
        this.password = password;
    }

    // ================== Métodos ==================

    /**
     * Devuelve una representación en texto del usuario,
     * incluyendo nombre, rol, correo y teléfono.
     *
     * @return Cadena con los atributos del usuario.
     */
    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                //", identificacion='" + identificacion + '\'' +
                //"password='" + password + '\'' +
                ", rol='" + rol + '\'' +
                ", correo='" + correo + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}
