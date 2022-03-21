package U6.T1.a7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//Actividad7: En LINUX disponemos de un comando "more", al que se le pasa un
// fichero y lo muestra poco a poco (cada 24 líneas). Implementar un programa que funcione de forma similar.
public class main {
  public static void main(String[] args) {
    StringBuilder texto = new StringBuilder();
    try {
      BufferedReader in = new BufferedReader(new FileReader("/programacion_21_22/more.txt"));
      String linea = in.readLine();
      while (linea != null) {
        texto.append(linea).append("\n");
        linea = in.readLine();
      }
      in.close();
    } catch (IOException ex){
      System.out.println("Error al leer el fichero.");
    }
    System.out.println(texto);
  }
}
