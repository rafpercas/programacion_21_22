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
    int dia1;
    int dia2;
    int hora1;
    int hora2;
    int horas;
    Scanner teclado = new Scanner(System.in);
    do {
      System.out.println("Introduce los dias de la semana(en numero del 1 al 7): ");
      dia1 = teclado.nextInt();
      dia2 = teclado.nextInt();

      int horasDia = 24;
      if (dia2 > dia1) {
        System.out.println("Introduce la hora del dia " + dia1);
        hora1 = teclado.nextInt();
        System.out.println("Introduce la hora del dia " + dia2);
        hora2 = teclado.nextInt();
        for (int dias = 0; dia1 == dia2; dias++) {
          horas = dias * horasDia + (hora2 - hora1);
        }
        break;
      } else {
        System.out.println(
            "El segundo dia no puede ser anterior al primero, porfavor inserte un dia mayor que éste.");
      }
    } while (dia1 > 0);
    System.out.println(
        "Hay "
            + horas
            + " entre el dia "
            + dia1
            + " a las "
            + hora1
            + " y el dia "
            + dia2
            + " a las "
            + hora2);
  }
}
