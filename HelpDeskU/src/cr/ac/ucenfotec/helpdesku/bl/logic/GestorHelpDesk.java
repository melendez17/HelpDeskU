package cr.ac.ucenfotec.helpdesku.bl.logic;

import cr.ac.ucenfotec.helpdesku.bl.entities.*;
import cr.ac.ucenfotec.helpdesku.dl.Repomemory;
import java.util.List;

/**
 * Clase que actúa como gestor central del sistema HelpDesk U.
 * Se encarga de manejar operaciones relacionadas con usuarios,
 * departamentos, tickets y diccionarios (emocional y técnico).
 * Internamente utiliza {@link Repomemory} como repositorio de datos en memoria.
 */
public class GestorHelpDesk {

    /**
     * Repositorio en memoria que almacena usuarios, departamentos, tickets y diccionarios.
     */
    private Repomemory repositorio;

    /**
     * Constructor que inicializa el gestor y el repositorio en memoria.
     */
    public GestorHelpDesk() {
        this.repositorio = new Repomemory();
        //cargarDatosEjemplo();
    }

    // ================== MÉTODOS PARA USUARIOS ==================

    /**
     * Registra un nuevo usuario en el sistema.
     *
     * @param usuario Objeto {@link Usuario} a registrar.
     */
    public void registrarUsuario(Usuario usuario) {
        repositorio.guardarUsuario(usuario);
    }

    /**
     * Devuelve la lista de todos los usuarios registrados.
     *
     * @return Lista de {@link Usuario}.
     */
    public List<Usuario> listarUsuarios() {
        return repositorio.obtenerTodosUsuarios();
    }

    /**
     * Obtiene un usuario según su índice en la lista.
     *
     * @param indice Posición del usuario en la lista.
     * @return Usuario correspondiente o null si el índice es inválido.
     */
    public Usuario getUsuario(int indice) {
        List<Usuario> usuarios = repositorio.obtenerTodosUsuarios();
        if (indice >= 0 && indice < usuarios.size()) {
            return usuarios.get(indice);
        }
        return null;
    }

    /**
     * Autentica a un usuario verificando correo y contraseña.
     *
     * @param correo Correo del usuario.
     * @param password Contraseña sin encriptar.
     * @return Usuario autenticado o null si no coincide.
     */
    public Usuario autenticarUsuario(String correo, String password) {
        List<Usuario> usuarios = listarUsuarios();
        String hashedPassword = hashPassword(password); // El hashing se hace en BL

        for (Usuario usuario : usuarios) {
            if (usuario.getCorreo().equalsIgnoreCase(correo.trim()) &&
                    usuario.getPassword().equals(hashedPassword)) {
                return usuario;
            }
        }
        return null;
    }

    /**
     * Aplica hashing SHA-256 a la contraseña.
     *
     * @param password Contraseña sin cifrar.
     * @return Contraseña cifrada en formato hexadecimal.
     */
    private String hashPassword(String password) {
        try {
            java.security.MessageDigest md = java.security.MessageDigest.getInstance("SHA-256");
            byte[] hash = md.digest(password.getBytes());
            StringBuilder hexString = new StringBuilder();
            for (byte b : hash) {
                hexString.append(String.format("%02x", b));
            }
            return hexString.toString();
        } catch (Exception e) {
            throw new RuntimeException("Error al hashear password", e);
        }
    }

    /**
     * Crea y registra un usuario directamente con sus datos.
     *
     * @param nombre Nombre del usuario.
     * @param password Contraseña sin cifrar.
     * @param rol Rol del usuario.
     * @param correo Correo electrónico.
     * @param telefono Teléfono de contacto.
     */
    public void registrarUsuario(String nombre, String password, String rol, String correo, String telefono) {
        String hashedPassword = hashPassword(password);
        Usuario usuario = new Usuario(nombre, hashedPassword, rol, correo, telefono);
        registrarUsuario(usuario);
    }

    // ================== MÉTODOS PARA DEPARTAMENTOS ==================

    /**
     * Registra un departamento en el sistema.
     *
     * @param departamento Objeto {@link Departamento} a registrar.
     */
    public void registrarDepartamento(Departamento departamento) {
        repositorio.guardarDepartamento(departamento);
    }

    /**
     * Devuelve la lista de todos los departamentos registrados.
     *
     * @return Lista de {@link Departamento}.
     */
    public List<Departamento> listarDepartamentos() {
        return repositorio.obtenerTodosDepartamentos();
    }

    /**
     * Obtiene un departamento según su índice en la lista.
     *
     * @param indice Posición del departamento en la lista.
     * @return Departamento correspondiente o null si el índice es inválido.
     */
    public Departamento getDepartamento(int indice) {
        List<Departamento> departamentos = repositorio.obtenerTodosDepartamentos();
        if (indice >= 0 && indice < departamentos.size()) {
            return departamentos.get(indice);
        }
        return null;
    }

    // ================== MÉTODOS PARA TICKETS ==================

    /**
     * Registra un ticket en el sistema.
     *
     * @param ticket Objeto {@link Ticket} a registrar.
     */
    public void registrarTicket(Ticket ticket) {
        repositorio.guardarTicket(ticket);
    }

    /**
     * Devuelve la lista de todos los tickets registrados.
     *
     * @return Lista de {@link Ticket}.
     */
    public List<Ticket> listarTickets() {
        return repositorio.obtenerTodosTickets();
    }

    // ================== MÉTODOS PARA DICCIONARIOS ==================

    /**
     * Agrega una palabra emocional al diccionario de emociones.
     *
     * @param palabra Objeto {@link DiccionarioEmocion} a agregar.
     */
    public void agregarPalabraEmocion(DiccionarioEmocion palabra) {
        repositorio.guardarPalabraEmocion(palabra);
    }

    /**
     * Devuelve la lista completa del diccionario de emociones.
     *
     * @return Lista de {@link DiccionarioEmocion}.
     */
    public List<DiccionarioEmocion> listarDiccionarioEmociones() {
        return repositorio.obtenerTodasPalabrasEmocion();
    }

    /**
     * Agrega una palabra técnica al diccionario técnico.
     *
     * @param palabra Objeto {@link DiccionarioTecnico} a agregar.
     */
    public void agregarPalabraTecnica(DiccionarioTecnico palabra) {
        repositorio.guardarPalabraTecnica(palabra);
    }

    /**
     * Devuelve la lista completa del diccionario técnico.
     *
     * @return Lista de {@link DiccionarioTecnico}.
     */
    public List<DiccionarioTecnico> listarDiccionarioTecnico() {
        return repositorio.obtenerTodasPalabrasTecnicas();
    }

    // ================== DATOS DE EJEMPLO ==================
    /*
    private void cargarDatosEjemplo() {
        // Usuarios de ejemplo
        registrarUsuario(new Usuario("Ana López", "ana@ucenfotec.ac.cr", "pass123", "8888-1111", "estudiante"));
        registrarUsuario(new Usuario("Carlos Ruiz", "carlos@ucenfotec.ac.cr", "pass123", "8888-2222", "funcionario"));

        // Departamentos de ejemplo
        registrarDepartamento(new Departamento("Soporte Técnico", "Problemas de hardware y software", "soporte@ucenfotec.ac.cr"));
        registrarDepartamento(new Departamento("Redes", "Problemas de conectividad e internet", "redes@ucenfotec.ac.cr"));

        // Diccionarios de ejemplo
        agregarPalabraEmocion(new DiccionarioEmocion("enojado", "Frustración"));
        agregarPalabraEmocion(new DiccionarioEmocion("urgente", "Urgencia"));
        agregarPalabraTecnica(new DiccionarioTecnico("wifi", "Redes"));
        agregarPalabraTecnica(new DiccionarioTecnico("imprimir", "Impresoras"));
    }
    */
}
