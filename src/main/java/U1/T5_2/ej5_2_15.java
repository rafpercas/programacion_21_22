package U1.T5_2;

import java.util.Scanner;

public class ej5_2_15 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int num1 = 0;

    System.out.println("Utilice '1' para verdadero y '2' para falso.");
    System.out.println(
        "1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.");
    int r1 = teclado.nextInt();
    if (r1 == 1) {
      num1 += 3;
    }
    System.out.println("2. Ha aumentado sus gastos de vestuario");
    int r2 = teclado.nextInt();
    if (r2 == 1) {
      num1 += 3;
    }
    System.out.println(
        "3. Ha perdido el interés que mostraba anteriormente por ti.");
    int r3 = teclado.nextInt();
    if (r3 == 1) {
      num1 += 3;
    }
    System.out.println("4. Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer)");
    int r4 = teclado.nextInt();
    if (r4 == 1) {
      num1 += 3;
    }
    System.out.println(
        "5. No te deja que mires la agenda de su teléfono móvil");
    int r5 = teclado.nextInt();
    if (r5 == 1) {
      num1 += 3;
    }
    System.out.println("6. A veces tiene llamadas que dice no querer contestar cuando estás tú delante");
    int r6 = teclado.nextInt();
    if (r6 == 1) {
      num1 += 3;
    }
    System.out.println("7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a");
    int r7 = teclado.nextInt();
    if (r7 == 1) {
      num1 += 3;
    }
    System.out.println("8. Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo");
    int r8 = teclado.nextInt();
    if (r8 == 1) {
      num1 += 3;
    }
    System.out.println("9. Has notado que últimamente se perfuma más");
    int r9 = teclado.nextInt();
    if (r9 == 1) {
      num1 += 3;
    }
    System.out.println("10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo");
    int r10 = teclado.nextInt();
    if (r10 == 1) {
      num1 += 3;
    }
    System.out.println(num1);
    if(num1>0 && num1<=10){
      System.out.println("¡Enhorabuena! tu pareja parece ser totalmente fiel.");
    }
    if(num1>10 && num1<=22){
      System.out.println("Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");
    }
    if(num1>22 && num1<=30){
      System.out.println("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza.");
    }
  }

}
