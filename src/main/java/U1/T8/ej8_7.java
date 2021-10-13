package U1.T8;

public class ej8_7 {
  public static void main(String[] args) {
    int impar = 1;
    int producto = 1;
    while (impar < 20) {
      producto = impar * producto;
      impar += 2;
    }
    System.out.println(producto);
  }
}
