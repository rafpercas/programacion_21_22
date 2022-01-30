package U4.T1.a6;
// actividad 5
public class Texto {
  public String cadena;
  private int limite;

  public String getCadena() {
    return cadena;
  }

  public void Texto(int longitud, String cadenaCaracteres) {
    this.limite = longitud;
    if (cadenaCaracteres.length() > longitud) {
      System.out.println("La cadena es mayor que la longitud.");
    } else {
      this.cadena = cadenaCaracteres;
    }
  }

  public void setCadena(String cadenaCaracteres) {
    cadena = cadenaCaracteres;
  }

  public void mostrarCadena() {
    System.out.println(cadena);
  }

  public void introducirCaracter(char caracter, String pos) {
    if (cadena.length() < limite && pos.equalsIgnoreCase("final")) {
      cadena += caracter;
    } else if (cadena.length() < limite && pos.equalsIgnoreCase("principio")) {
      cadena = caracter + cadena;
    } else {
      System.out.println(
          "El caracter no cabe en la cadena, o ha introducido una posición errónea.");
    }
  }

  public void introducirCadena(String nuevaCadena, String pos) {
    if (cadena.length() + nuevaCadena.length() <= limite && pos.equalsIgnoreCase("final")) {
      cadena += nuevaCadena;
    } else if (cadena.length() + nuevaCadena.length() <= limite
        && pos.equalsIgnoreCase("principio")) {
      cadena = nuevaCadena + cadena;
    } else {
      System.out.println("La cadena no cabe, o ha introducido una posición errónea.");
    }
  }

  public void contarVocales() {
    int count = 0;
    String vocales = "aeiouáéíóú";
    for (int i = 0; i < cadena.length(); i++) {
      for (int j = 0; j < vocales.length(); j++) {
        if (cadena.charAt(i) == vocales.charAt(j)) {
          count++;
        }
      }
    }
    System.out.println("La cadena tiene "+count+" vocales.");
  }
}
