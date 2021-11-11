package U3.T2;

import java.util.Scanner;

// Pedir el nombre completo (nombre y apellidos) al usuario.
// El programa debe eliminar cualquier vocal del nombre.
// Por ejemplo: "Álvaro Pérez" se mostrará como "lvr Prz". Sólo
// se eliminarán las vocales (mayúsculas, minúsculas y acentuadas). El resto de caracteres no se
// modifican.
public class U3_T2_ej5 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduce el nombre y apellidos: ");
    String datos = teclado.nextLine();
    String sinVocales = "";

    for (int i = 0; i < datos.length(); i++) {
      char caracter = datos.charAt(i);
      String carac = String.valueOf(caracter);
      if () {}
    }
  }

  static boolean esVocal(char a) {
    String vocales = "aáAÁeéEÉiíIÍoóOÓuúUÚ";
    boolean resultado;
    if (vocales.indexOf(carac)) return resultado;
  }
}
