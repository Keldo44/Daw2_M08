package javadoc;
/**
 * Clase que representa a un alumno.
 *
 * @author [Iv�n]
 * @version 1.0
 * @since 2023-10-17
 */
public class Alumno extends Persona {

    /**
     * N�mero de expediente del alumno.
     */
    private int numeroExpediente;

    /**
     * Crea un nuevo objeto de la clase `Alumno`.
     *
     * @param nombre Nombre del alumno.
     * @param apellidos Apellidos del alumno.
     * @param edad Edad del alumno.
     * @param numeroExpediente N�mero de expediente del alumno.
     */
    public Alumno(String nombre, String apellidos, int edad, int numeroExpediente) {
        super(nombre, apellidos, edad);
        this.numeroExpediente = numeroExpediente;
    }

    /**
     * Devuelve el n�mero de expediente del alumno.
     *
     * @return N�mero de expediente del alumno.
     */
    public int getNumeroExpediente() {
        return numeroExpediente;
    }

    /**
     * Establece el n�mero de expediente del alumno.
     *
     * @param numeroExpediente Nuevo n�mero de expediente del alumno.
     */
    public void setNumeroExpediente(int numeroExpediente) {
        this.numeroExpediente = numeroExpediente;
    }

    /**
     * Devuelve una representaci�n en cadena del alumno.
     *
     * @return Representaci�n en cadena del alumno.
     */
    @Override
    public String toString() {
        return super.toString() + ", numeroExpediente=" + numeroExpediente;
    }
}