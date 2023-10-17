package javadoc;

/**
 * Clase que representa a una persona.
 *
 * @author [Iván]
 * @version 1.0
 * @since 2023-10-17
 */
public class Persona {

    /**
     * Nombre de la persona.
     */
    private String nombre;

    /**
     * Apellidos de la persona.
     */
    private String apellidos;

    /**
     * Edad de la persona.
     */
    private int edad;

    /**
     * Crea un nuevo objeto de la clase `Persona`.
     *
     * @param nombre Nombre de la persona.
     * @param apellidos Apellidos de la persona.
     * @param edad Edad de la persona.
     */
    public Persona(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    /**
     * Devuelve el nombre de la persona.
     *
     * @return Nombre de la persona.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre de la persona.
     *
     * @param nombre Nuevo nombre de la persona.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve los apellidos de la persona.
     *
     * @return Apellidos de la persona.
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * Establece los apellidos de la persona.
     *
     * @param apellidos Nuevos apellidos de la persona.
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * Devuelve la edad de la persona.
     *
     * @return Edad de la persona.
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Establece la edad de la persona.
     *
     * @param edad Nueva edad de la persona.
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Devuelve una representación en cadena de la persona.
     *
     * @return Representación en cadena de la persona.
     */
    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", edad=" + edad +
                '}';
    }
}

