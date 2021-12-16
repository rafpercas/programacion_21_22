package U3.Examen_U3;
// Crea una función con la siguiente cabecera:
//
// public String convierteEnPalabras(int n)
//
// Esta función convierte los dígitos del número n en las correspondientes palabras y lo devuelve
// todo en una cadena de caracteres. Por ejemplo, el 470213 convertido a palabras sería:
//
// cuatro, siete, cero, dos, uno, tres
//
// Utiliza esta función en un programa para comprobar que funciona bien. Desde la función no se debe
// mostrar nada por pantalla, solo se debe usar print desde el programa principal. Fíjate que hay
// una coma detrás de cada palabra salvo al final.
public class ej4 {
  public static void main(String[] args) {
    int a = 123456;
    System.out.println(convierteEnPalabras(a));
  }

  public static String convierteEnPalabras(int n) {
    String resultado = "";
    String numero = "";
    numero = String.valueOf(n);

    String [] cadenanumero = new String[numero.length()];
    for (int i = 0; i < cadenanumero.length; i++) {
        if(cadenanumero[i].equalsIgnoreCase("1")){

        }
    }
    return resultado;
  }
}
