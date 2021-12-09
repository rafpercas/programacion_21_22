package U3.T5;

import java.util.Arrays;
import java.util.Scanner;

public class colores { public static void main(String[] args) {
    // Escribe un programa que pida 8 palabras y las almacene en un array. Acontinuación, las
    // palabras correspondientes a colores se deben almacenar alcomienzo y las que no son colores a
    // continuación. Puedes utilizar tantos arraysauxiliares como quieras. Los colores que conoce el
    // programa deben estar enotro array y son los siguientes: verde, rojo, azul, amarillo, naranja,
    // rosa, negro, blanco y morado.

    Scanner teclado = new Scanner(System.in);

    String usuario[] = new String[8];
    int hueco = 0;
    for (String palabras : usuario) {
        System.out.println("Introduzca la siguiente palabra:");
        usuario[hueco] = teclado.next();
        hueco++;
    }

    System.out.println(Arrays.toString(ordenador(usuario)));
}

    static String[] ordenador(String cadena[]) {

        String colores[] = {
                "verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro", "blanco", "morado"
        };
        String parteColores[] = new String[8];
        int indice_colores = 0;
        int indice_palabras = 1;

        for (int i = 0; i < cadena.length; i++) {
            boolean esta = true;
            for (int j = 0; j < colores.length; j++) {
                if (cadena[i].equalsIgnoreCase(colores[j])) {
                    esta = true;
                    break;
                } else if (!cadena[i].equalsIgnoreCase(colores[j])) {
                    esta = false;
                }
            }
            if (!esta) {
                parteColores[parteColores.length - indice_palabras] = cadena[i];
                indice_palabras++;
            } else if (esta) {
                parteColores[indice_colores] = cadena[i];
                indice_colores++;
            }
        }

        return parteColores;
    }
}
