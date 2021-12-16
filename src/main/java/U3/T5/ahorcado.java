package U3.T5;
import java.util.Scanner;

public class ahorcado {
    public static void main(String[] args) {
        // Crea una función llamada palabraAhorcado que reciba como parámetros dos cadenas (la cadena a
        // adivinar y el resultado parcial) y un carácter a buscar en la cadena a adivinar. Debe
        // devolver el resultado de encontrar ese character en la cadena a adivinar.
        //
        // La función tendrá el siguiente prototipo:
        //
        // public static String palabraAhorcado(String a, String b, char c)
        // En el programa principal, se debe pedir al usuario que introduzca una palabra a adivinar y un
        // carácter a buscar en la cadena. Se pedirá caracteres hasta que se consiga adivinar la palabra
        // completa.

        Scanner teclado = new Scanner(System.in);

        //Pedir datos para el juego.
        System.out.println("Introduzca la palabra a adivinar:");
        String palabraAdivinar = teclado.next();
        StringBuilder palabraJugadorBuilder = new StringBuilder(palabraAdivinar.length());
        for(int i = 0; i < palabraAdivinar.length(); i++) {
            palabraJugadorBuilder.append('_');
        }
        String palabraJugador = new String(palabraJugadorBuilder);

        //Bucle para jugar
        do {
            System.out.println("Introduzca la letra que cree que está en la palabra:");
            String letraJugador = teclado.next();
            char letra = letraJugador.charAt(0);
            System.out.println(palabraAhorcado(palabraAdivinar,palabraJugador,letra));
            palabraJugador = palabraAhorcado(palabraAdivinar, palabraJugador, letra);

        } while (!palabraAdivinar.equals(palabraJugador));

        //Solución
        System.out.println("¡ENHORABUENA! La palabra era ".concat(palabraAdivinar));
    }
    public static String palabraAhorcado(String a, String b, char c){
        // StringBuilder para facilitar el proceso de búsqueda del carácter.
        StringBuilder bBuilder = new StringBuilder(b);

        for (int i = 0; i < b.length(); i++){
            if (c == a.charAt(i)) {
                bBuilder.setCharAt(i,c);
            }
        }

        String respuesta = new String(bBuilder);

        return respuesta;
    }
}
