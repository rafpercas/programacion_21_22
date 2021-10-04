package U1.T5_2;

import java.util.Scanner;

public class ej5_2_19 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduce un dia de la semana, siendo lunes '1', martes '2',etc: ");
    int dia = teclado.nextInt();
    System.out.println("Introduce una hora del dia: ");
    int hora = teclado.nextInt();
    System.out.println("Introduce los minutos: ");
    int min = teclado.nextInt();
    final int minHora = 60;
    int diaMin = dia * 1440;
    int horaMin = hora * minHora;
    final int viernes15 = 8100;
    int falta = viernes15 - diaMin - horaMin - min;
    if (falta < viernes15) {
      System.out.println("Faltan " + falta + " minutos para el fin de semana.");
    }
  }
}
