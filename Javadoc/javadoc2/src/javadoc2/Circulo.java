package javadoc2;
/**
 * Clase que representa un círculo.
 *
 * @author [Iván]
 * @version 1.0
 * @since 2023-10-17
 */
public class Circulo extends FiguraGeometricaAbstracta {

    /**
     * Crea un nuevo círculo.
     *
     * @param radio Radio del círculo.
     */
    public Circulo(double radio) {
        super(radio);
    }

    /**
     * Calcula el área del círculo.
     *
     * @return El área del círculo.
     */
    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }
}