package U1.T8;
// Actividad8-11: Diseñar una aplicación que muestre las tablas de multiplicar del 1 al 10.
public class ej8_11 {
  public static void main(String[] args) {
    int num = 1;
    int multiplicador = 1;
    while (num > 0 && num <= 10) {
      while (multiplicador > 0 && multiplicador <= 10) {
        System.out.println(num + " x " + multiplicador + " = " + num * multiplicador);
        multiplicador++;
      }
      multiplicador = 1;
      num++;
    }
  }
}
