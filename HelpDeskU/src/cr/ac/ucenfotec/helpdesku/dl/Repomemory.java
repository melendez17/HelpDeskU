package cr.ac.ucenfotec.helpdesku.dl;

import cr.ac.ucenfotec.helpdesku.bl.entities.Usuario;
import cr.ac.ucenfotec.helpdesku.bl.entities.Departamento;
import cr.ac.ucenfotec.helpdesku.bl.entities.Ticket;
import cr.ac.ucenfotec.helpdesku.bl.entities.DiccionarioEmocion;
import cr.ac.ucenfotec.helpdesku.bl.entities.DiccionarioTecnico;
import java.util.ArrayList;
import java.util.List;

/**
 * Repositorio en memoria para almacenar usuarios, departamentos, tickets y diccionarios.
 * Esta clase funciona como capa de acceso a datos en memoria para el sistema HelpDesk U.
 */
public class Repomemory {

    /**
     * Lista de usuarios registrados en el sistema.
     */
    private List<Usuario> usuarios;

    /**
     * Lista de departamentos registrados en el sistema.
     */
    private List<Departamento> departamentos;

    /**
     * Lista de tickets registrados en el sistema.
     */
    private List<Ticket> tickets;

    /**
     * Lista de palabras emocionales almacenadas en el diccionario.
     */
    private List<DiccionarioEmocion> diccionarioEmociones;

    /**
     * Lista de palabras técnicas almacenadas en el diccionario.
     */
    private List<DiccionarioTecnico> diccionarioTecnico;

    /**
     * Constructor que inicializa todas las listas internas.
     */
    public Repomemory() {
        this.usuarios = new ArrayList<>();
        this.departamentos = new ArrayList<>();
        this.tickets = new ArrayList<>();
        this.diccionarioEmociones = new ArrayList<>();
        this.diccionarioTecnico = new ArrayList<>();
    }

    // ================== MÉTODOS PARA USUARIOS ==================

    /**
     * Guarda un usuario en memoria.
     *
     * @param usuario Usuario a almacenar.
     */
    public void guardarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    /**
     * Devuelve todos los usuarios almacenados.
     *
     * @return Lista de usuarios.
     */
    public List<Usuario> obtenerTodosUsuarios() {
        return new ArrayList<>(usuarios);
    }

    /**
     * Verifica si un correo ya existe entre los usuarios registrados.
     *
     * @param correo Correo a verificar.
     * @return true si el correo existe, false si no.
     */
    public boolean existeCorreo(String correo) {
        for (Usuario usuario : usuarios) {
            if (usuario.getCorreo().equals(correo)) {
                return true;
            }
        }
        return false;
    }

    // ================== MÉTODOS PARA DEPARTAMENTOS ==================

    /**
     * Guarda un departamento en memoria.
     *
     * @param departamento Departamento a almacenar.
     */
    public void guardarDepartamento(Departamento departamento) {
        departamentos.add(departamento);
    }

    /**
     * Devuelve todos los departamentos almacenados.
     *
     * @return Lista de departamentos.
     */
    public List<Departamento> obtenerTodosDepartamentos() {
        return new ArrayList<>(departamentos);
    }

    // ================== MÉTODOS PARA TICKETS ==================

    /**
     * Guarda un ticket en memoria.
     *
     * @param ticket Ticket a almacenar.
     */
    public void guardarTicket(Ticket ticket) {
        tickets.add(ticket);
    }

    /**
     * Devuelve todos los tickets almacenados.
     *
     * @return Lista de tickets.
     */
    public List<Ticket> obtenerTodosTickets() {
        return new ArrayList<>(tickets);
    }

    // ================== MÉTODOS PARA DICCIONARIOS ==================

    /**
     * Agrega una palabra emocional al diccionario en memoria.
     *
     * @param palabra Palabra emocional a almacenar.
     */
    public void guardarPalabraEmocion(DiccionarioEmocion palabra) {
        diccionarioEmociones.add(palabra);
    }

    /**
     * Devuelve todas las palabras emocionales almacenadas.
     *
     * @return Lista de palabras emocionales.
     */
    public List<DiccionarioEmocion> obtenerTodasPalabrasEmocion() {
        return new ArrayList<>(diccionarioEmociones);
    }

    /**
     * Agrega una palabra técnica al diccionario en memoria.
     *
     * @param palabra Palabra técnica a almacenar.
     */
    public void guardarPalabraTecnica(DiccionarioTecnico palabra) {
        diccionarioTecnico.add(palabra);
    }

    /**
     * Devuelve todas las palabras técnicas almacenadas.
     *
     * @return Lista de palabras técnicas.
     */
    public List<DiccionarioTecnico> obtenerTodasPalabrasTecnicas() {
        return new ArrayList<>(diccionarioTecnico);
    }
}
