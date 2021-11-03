package U1.T8_2;

import java.util.Scanner;

public class ej8_2_8_bonito {
    public static boolean esDiaCorrecto(int dia) {
        return (dia > 0 && dia < 8);
    }
    public static boolean esHoraCorrecta(int hora){
        return (hora > 0 && hora < 25);
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int horasDia = 24;
        int dia1;
        int dia2;
        int hora1;
        int hora2;
        int horasEntre;

        do {
            System.out.println(
                    "Por favor introduzca un numero del 1 al 7: ");
            dia1 = teclado.nextInt();
            if (!esDiaCorrecto(dia1)) {
                System.out.print("Error al introducir la fecha. ");
            }
        } while (!esDiaCorrecto(dia1));

        do {
            System.out.println("Introduce la hora del primer dia(de 1 a 24): ");
            hora1 = teclado.nextInt();
            if(!esHoraCorrecta(hora1)) {
                System.out.print("La hora es incorrecta. ");
            }
        } while (!esHoraCorrecta(hora1));

        do {
            System.out.println(
                    "Por favor introduzca la fecha del segundo dia (del 1 al 7): ");
            dia2 = teclado.nextInt();
            if (!esDiaCorrecto(dia2) || dia2<dia1) {
                System.out.print("Error al introducir la fecha. ");
            }
        } while (!esDiaCorrecto(dia2) || dia2<dia1);

        int dia1horas = ((dia1 - 1) * horasDia) + hora1;

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
}
