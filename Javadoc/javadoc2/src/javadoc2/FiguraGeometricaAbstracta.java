package javadoc2;
/**
 * Clase abstracta que representa una figura geométrica.
 *
 * @author [Iván]
 * @version 1.0
 * @since 2023-10-17
 */
public class FiguraGeometricaAbstracta implements FiguraGeometrica {

    /**
     * Radio de la figura geométrica.
     */
    protected double radio;

    /**
     * Crea una nueva figura geométrica abstracta.
     *
     * @param radio Radio de la figura geométrica.
     */
    public FiguraGeometricaAbstracta(double radio) {
        this.radio = radio;
    }

    /**
     * Devuelve el radio de la figura geométrica.
     *
     * @return El radio de la figura geométrica.
     */
    public double getRadio() {
        return radio;
    }

    /**
     * Establece el radio de la figura geométrica.
     *
     * @param radio Nuevo radio de la figura geométrica.
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }

    /**
     * Calcula el área de la figura geométrica.
     *
     * @return El área de la figura geométrica.
     */
    @Override
    public double calcularArea() {
        throw new UnsupportedOperationException("Este método debe ser implementado por las clases que hereden de FiguraGeometricaAbstracta");
    }
}