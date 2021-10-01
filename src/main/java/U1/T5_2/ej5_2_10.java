package U1.T5_2;

import java.util.Scanner;

public class ej5_2_10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int medianoche = 86400;
        System.out.println("Introduzca un numero de horas: ");
        int horas = teclado.nextInt();
        System.out.println("Introduzca un numero de minutos: ");
        int minutos = teclado.nextInt();
        int segundos = (horas * 3600) + (minutos * 60);
        int falta = medianoche - segundos;
        System.out.println("Faltan " + falta + " segundos para media noche.");

    }
}
