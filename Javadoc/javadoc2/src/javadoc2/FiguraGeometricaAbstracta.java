package javadoc2;
/**
 * Clase abstracta que representa una figura geom�trica.
 *
 * @author [Iv�n]
 * @version 1.0
 * @since 2023-10-17
 */
public class FiguraGeometricaAbstracta implements FiguraGeometrica {

    /**
     * Radio de la figura geom�trica.
     */
    protected double radio;

    /**
     * Crea una nueva figura geom�trica abstracta.
     *
     * @param radio Radio de la figura geom�trica.
     */
    public FiguraGeometricaAbstracta(double radio) {
        this.radio = radio;
    }

    /**
     * Devuelve el radio de la figura geom�trica.
     *
     * @return El radio de la figura geom�trica.
     */
    public double getRadio() {
        return radio;
    }

    /**
     * Establece el radio de la figura geom�trica.
     *
     * @param radio Nuevo radio de la figura geom�trica.
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }

    /**
     * Calcula el �rea de la figura geom�trica.
     *
     * @return El �rea de la figura geom�trica.
     */
    @Override
    public double calcularArea() {
        throw new UnsupportedOperationException("Este m�todo debe ser implementado por las clases que hereden de FiguraGeometricaAbstracta");
    }
}