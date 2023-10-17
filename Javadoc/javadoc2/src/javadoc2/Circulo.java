package javadoc2;
/**
 * Clase que representa un c�rculo.
 *
 * @author [Iv�n]
 * @version 1.0
 * @since 2023-10-17
 */
public class Circulo extends FiguraGeometricaAbstracta {

    /**
     * Crea un nuevo c�rculo.
     *
     * @param radio Radio del c�rculo.
     */
    public Circulo(double radio) {
        super(radio);
    }

    /**
     * Calcula el �rea del c�rculo.
     *
     * @return El �rea del c�rculo.
     */
    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }
}