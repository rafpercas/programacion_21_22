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
    int cantDigitos = 0;//cuenta cantidad de digitos del numero
    int posicion2;
    long num1 = num;
    int division=1;
    long num2;
    while(num>0){
      num=num/10;
      cantDigitos++;
    }//cuenta el numero de digitos
    posicion2 = cantDigitos-posicion;//donde se introducira el numero, contando de atras a alante
    for (int i = 0; i <= posicion2; i++) {
      division=division*10;
    }//la altura por la que se tiene que partir el numero para poder introducir el nuevo digito
    num2=num1%division;//segunda parte del numero principal roto
    num1=num1/division;//primera parte del numero principal roto
    num1=num1*10+digito;//num1 ahora es la primera parte del numero con el nuevo digito introducido
    num=num1*division+num2;//num1 * la cantidad de espacio detras que tiene que haber para poner la segunda parte
    // + la segunda parte
    System.out.println("El numero sería: "+num);
  }
}
