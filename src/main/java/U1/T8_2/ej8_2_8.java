package U1.T8_2;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

// Realiza una programa que calcule las horas transcurridas entre dos horas de dos días de la
// semana.
// No se tendrán en cuenta los minutos ni los segundos. El día de la semana se puede pedir como un
// número
// (del 1 al 7) o como una cadena (de “lunes” a “domingo”). Se debe
// comprobar que el usuario introduce los datos correctamente y que el segundo día es posterior al
// primero.
public class ej8_2_8 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int horasDia = 24;
    int dia1;
    int dia2;
    int hora1;
    int hora2;
    int horasEntre;
    System.out.println("Introduce el primer dia de la semana(del 1 al 7): ");
    dia1 = teclado.nextInt();
    while (dia1 < 1 || dia1 > 7) {
      System.out.println(
          "La fecha del dia 1 es incorrecta, por favor introduzca un numero del 1 al 7: ");
      dia1 = teclado.nextInt();
    }
    if (dia1 > 0 && dia1 < 8) {
      System.out.println("Introduce la hora del primer dia(de 1 a 24): ");
      hora1 = teclado.nextInt();
      while (hora1 < 1 || hora1 > 24) {
        System.out.println("La hora debe ser de 1 a 24, introduzcala de nuevo: ");
        hora1 = teclado.nextInt();
      }
      int dia1horas = ((dia1 - 1) * horasDia) + hora1;
      System.out.println("Introduce el segundo dia de la semana(del 1 al 7): ");
      dia2 = teclado.nextInt();
      while (dia2 < 1 || dia2 > 7 || dia2 < dia1) {
        System.out.println(
            "La fecha del dia 2 es incorrecta, por favor introduzca un numero del 1 al 7 y mayor que el dia 1: ");
        dia2 = teclado.nextInt();
      }
      if (dia2 > dia1 && dia2 < 8) {
        System.out.println("Introduce la hora del segundo dia(de 1 a 24): ");
        hora2 = teclado.nextInt();
        while (hora2 < 1 || hora2 > 24) {
          System.out.println("La hora debe ser de 1 a 24, introduzcala de nuevo: ");
          hora2 = teclado.nextInt();
        }
        int dia2horas = ((dia2 - 1) * horasDia) + hora2;
        horasEntre = dia2horas - dia1horas;
        System.out.println(
            "Hay un total de " + horasEntre + " horas entre esos dias a esas horas.");
      }

      // int dia1horas = ((dia1-1) * horasDia) + hora1;
      // int dia2horas = ((dia2-2) * horasDia) + hora2;

    }
  }
}
