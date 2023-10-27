#include <iostream>

/**
 * @brief Clase para representar un punto en el plano cartesiano.
 */
class Punto {
 public:
  /**
   * @brief Constructor por defecto.
   */
  Punto() : x(0), y(0) {}

  /**
   * @brief Constructor con parámetros.
   *
   * @param x La coordenada x del punto.
   * @param y La coordenada y del punto.
   */
  Punto(int x, int y) : x(x), y(y) {}

  /**
   * @brief Devuelve la coordenada x del punto.
   *
   * @return La coordenada x del punto.
   */
  int getX() const { return x; }

  /**
   * @brief Devuelve la coordenada y del punto.
   *
   * @return La coordenada y del punto.
   */
  int getY() const { return y; }

  /**
   * @brief Mueve el punto a una nueva posición.
   *
   * @param x La nueva coordenada x del punto.
   * @param y La nueva coordenada y del punto.
   */
  void mover(int x, int y) {
    this->x = x;
    this->y = y;
  }

 private:
  int x;
  int y;
};

/**
 * @brief Calcula la distancia entre dos puntos.
 *
 * @param p1 El primer punto.
 * @param p2 El segundo punto.
 *
 * @return La distancia entre los dos puntos.
 */
double distancia(const Punto &p1, const Punto &p2) {
  return std::sqrt(
      (p1.getX() - p2.getX()) * (p1.getX() - p2.getX()) +
      (p1.getY() - p2.getY()) * (p1.getY() - p2.getY()));
}

int main() {
  Punto p1(10, 20);
  Punto p2(30, 40);

  double d = distancia(p1, p2);

  std::cout << "La distancia entre los dos puntos es: " << d << std::endl;

  return 0;
}
