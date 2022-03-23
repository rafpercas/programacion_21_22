package U6.T1.a5;

import java.io.FileReader;
import java.io.IOException;

//Actividad5: En el archivo numeros.txt disponemos de una serie de números (uno por cada línea).
// Diseñar un programa que procese el fichero y nos muestre el menor y el mayor.
public class main {
  public static void main(String[] args) {
    Integer min=10000000;
    Integer max=0;
    String texto = "";
    System.out.println(min);
    System.out.println(max);
    Integer [] array = new Integer[1];
      try {
          FileReader in = new FileReader("/programacion/programacion_21_22/numeros.txt");
          int c = in.read();
          while (c != -1) {
              texto += (char) c;
              c = in.read();
          }
      for (int i = 0; i < texto.length(); i++) {
        if(texto.charAt(i)<=min){
            min=(int) texto.charAt(i);
        }
        if(texto.charAt(i)>=max){
            max=(int) texto.charAt(i);
        }
      }
      System.out.println(min);
      System.out.println(max);
          in.close();
      } catch (IOException ex) {
          System.out.println("Error al leer el archivo.");
      }
  }
  }

