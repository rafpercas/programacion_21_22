package U1.practicaexamen;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
//Escribe un programa que sea capaz de insertar un dígito dentro de un número
//indicando la posición. El nuevo dígito se colocará en la posición indicada y el
//resto de dígitos se desplazará hacia la derecha. Las posiciones se cuentan de
//izquierda a derecha empezando por el 1. Suponemos que el usuario introduce
//correctamente los datos. Se recomienda usar long en lugar de int ya que el
//primero admite números más largos.
public class introducirnumeroposicion {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduce un número entero: ");
    long num = teclado.nextLong();

    System.out.println("Introduce un dígito: ");
    short digito = teclado.nextShort();

    System.out.println("Introduce la posición donde quiera insertarlo: ");
    short posicion = teclado.nextShort();
    int cantDigitos = 0;
    int posicion2;
    long num1 = num;
    int division=1;
    long num2;
    while(num>0){
      num=num/10;
      cantDigitos++;
    }
    posicion2 = cantDigitos-posicion;
    for (int i = 0; i <= posicion2; i++) {
      division=division*10;
    }
    num2=num1%division;
    num1=num1/division;
    num1=num1*10+digito;
    num=num1*division+num2;
    System.out.println("El numero sería: "+num);
  }
}
