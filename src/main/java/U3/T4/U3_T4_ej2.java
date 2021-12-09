package U3.T4;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

// Escribe un programa que pida 8 palabras y las almacene en un array.
// Acontinuación, las palabras correspondientes a colores se deben almacenar alcomienzo y
// las que no son colores a continuación. Puedes utilizar tantos arraysauxiliares como quieras.
// Los colores que conoce el programa deben estar enotro array y son
// los siguientes: verde, rojo, azul, amarillo, naranja, rosa, negro,blanco y morado.
public class U3_T4_ej2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String[] array = new String[8];
        System.out.println("Introduce 8 palabras: ");
        String[] colores = {
                "verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro", "blanco", "morado"
        };
        String[] arrayNew = new String[8];
        String[] arraySin = new String[8];
        int ind_arraySin = 0;
        int ind_arrayNew = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = teclado.next();
        }
        for (int i = 0; i < array.length; i++) {
            boolean esta = true;
            for (int j = 0; j < colores.length; j++) {
                if (array[i].equalsIgnoreCase(colores[j])) {
                    esta = true;
                    break;
                }
                if (!array[i].equalsIgnoreCase(colores[j])) {
                    esta=false;
                }
            }
            if(esta){
                arrayNew[ind_arrayNew] = array[i];
                ind_arrayNew++;
            }
            if(!esta){
                arraySin[ind_arraySin] = array[i];
                ind_arraySin++;
            }
        }
        System.out.println(Arrays.toString(arrayNew));
        System.out.println(Arrays.toString(arraySin));
        String [] juntos = new String[8];
        juntos = Arrays.copyOfRange(arrayNew,0,3);
        System.out.println(Arrays.toString(juntos));
    }
}
