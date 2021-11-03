package U1.practicaexamen;

public class dibujarrombo {
  public static void main(String[] args) {
    int altura = 15;
    for (int i = 0; i < altura; i++) {
      for (int j = 0; j < altura; j++) {
        if (j > altura / 2 - i
            && (j < altura + (altura / 2) - 1 - i)
            && j < altura / 2 + i
            && (j > i - (altura / 2))) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }

    // j==altura/2-i dibuja la diagonal arriba izquierda rombo
    // j==altura+1-i  dibuja la diagonal abajo derecha rombo
    // j==altura/2+i  dibuja diagonal arriba derecha rombo
    // j==i-altura/2  dibuja diagonal abajo izquierda rombo
  }
}
