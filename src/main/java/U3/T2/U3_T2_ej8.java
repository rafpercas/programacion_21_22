package U3.T2;

import java.util.Scanner;

// Los habitantes de Javalandia tienen un idioma algo extraño;
// cuando hablan siempre comienzan sus frases con "Javalín, javalón", para después hacer una pausa
// más o menos larga (la pausa se representa mediante espacios en blanco) y a continuación expresan
// el mensaje. Existe un dialecto que no comienza sus frases con la muletilla anterior, pero siempre
// las
// terminan con un silencio, más o menos prolongado y la coletilla "javalén, len, len". Se pide
// diseñar un
// traductor que, en primer lugar, nos diga si la frase está escrita en el idioma de
// Javalandia (en cualquiera de sus dialectos), y en caso afirmativo, nos muestre el mensaje sin
// muletillas.
public class U3_T2_ej8 {
  public static void main(String[] args) {
    String comienza = "Javalín, javalón";
    String termina = "javalén, len, len";
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduce la frase a traducir: ");
    String frase = teclado.nextLine();
    if (frase.substring(0, comienza.length()).equals(comienza)) {
      frase = frase.substring(comienza.length(), frase.length());
      System.out.println("La frase traducida es: " + frase);
    }
    if (frase.substring((frase.length() - termina.length()), frase.length()).equals(termina)) {
      frase = frase.substring(0, (frase.length() - termina.length()));
      System.out.println("La frase traducida es: " + frase);
    }
  }
}
