package U4.T1.a6;

import java.util.Scanner;

// Actividad 1: Diseñar la clase CuentaCorriente, sabiendo que los datos que caracterizan a un
// objeto de ese tipo son: saldo, límite de descubrimiento (cantidad de dinero que se permite sacar
// de una cuenta que ya está a cero), nombre y DNI del titular. Las operaciones típicas con una
// cuenta corriente son:
//
//    Crear la cuenta: se necesita el nombre y DNI del titular. El saldo inicial será 0 y el límite
// de descubierto será de -50 euros.
//
//    Sacar dinero: solo se podrá sacar dinero hasta el límite de descubierto. El método debe
// indicar, por pantalla, un mensaje que indique si ha sido posible llevar a cabo la operación.
// Además, deberá devolver un valor booleano que indique lo mismo.
//
//    Ingresar dinero: se incrementa el saldo.
//
//    Mostrar información: muestra la información de la cuenta corriente.
public class CuentaCorriente {
    Scanner teclado = new Scanner(System.in);
  private long saldo;
  private int limite;
  public String nombre;
  protected String dni;
  private static String banco = "La Caixa";

    public static String getBanco() {
        return banco;
    }

    public static void setBanco(String banco) {
        CuentaCorriente.banco = banco;
    }


  public long getSaldo() {
    return saldo;
  }

  public void setSaldo(long saldo) {
    this.saldo = saldo;
  }

  public int getLimite() {
    return limite;
  }

  public void setLimite(int limite) {
    if (limite > 0 && limite < 10000) {
      this.limite = limite;
    }
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void CuentaCorriente(String nombreTitular, String dniTitular) {
    setSaldo(0);
    setLimite(-50);
    this.nombre = nombreTitular;
    this.dni = dniTitular;
  }

  public String getDni() {
    return dni;
  }

  public void setDni(String dni) {
    this.dni = dni;
  }
  // Ejercicio 2: Actividad 2: En la clase CuentaCorriente, sobrecargar los constructores para que
  // permitan crear objetos:
  //  solo con el saldo inicial, no serán necesarios los datos del titular. Por defecto el límite
  // de descubierto será 0 euros.
  //
  //    con un saldo inicial, con un límite de descubierto y con el DNI del titular de la cuenta.
  public void CuentaCorriente(String nombreTitular) {
    setSaldo(0);
    setLimite(0);
    this.nombre = nombreTitular;
    setDni("0");
  }

  public void sacar(long cantidad) {
    if (cantidad > this.saldo - this.limite) {
      System.out.println("No tiene suficiente saldo.");
    } else {
      this.saldo -= cantidad;
      System.out.println("Aqui tiene su dinero.");
    }
  }

  public void ingresar(long cantidad) {
    this.saldo += cantidad;
  }

  public void mostrarInfo() {
    System.out.println("La cantidad de saldo de la cuenta es de: " + getSaldo());
    System.out.println("El banco es: "+banco);
  }
  // Actividad 3: Modificar la visibilidad de la clase CuentaCorriente para que sea visible desde
  // clases externas, y la visibilidad de sus atributos para que:
  //
  //    saldo y limite no sean visibles para otras clases
  //
  //    nombre sea público para cualquier clase
  //
  //    dni solo sea visible por clases vecinas
  //
  // (Comprueba la visibilidad desde el programa principal comentando cada acceso o intento de
  // acceso)
  // Actividad 4: Todas las cuentas corrientes con las que vamos a trabajar pertenecen al mismo
  // banco.
  // Añadir un atributo que almacene el nombre del banco (que es único) en la clase CuentaCorriente.
  // Diseñar un método que permita modificar el nombre del banco (al que pertenecen todas las
  // cuentas
  // corrientes)
  public static void modificarBanco(String nombreBanco) {
    banco = nombreBanco;
    // Actividad 5: Diseñar la clase Texto que gestiona una cadena de caracteres con algunas
    // características:
    //
    //    La cadena de caracteres tendrá una longitud máxima, que se especifica en el constructor.
    //
    //    Permite añadir un carácter, al principio o al final, siempre y cuando exista espacio
    // disponible.
    //
    //    Igualmente, permite añadir una cadena, al principio o al final del texto, siempre y cuando
    // no se rebase el tamaño máximo establecido.
    //
    //    Es necesario saber cuántas vocales (mayúsculas y minúsculas) hay en el texto.



    // Actividad 6: Diseñar la clase Banco de la que interesa guardar su nombre, capital y la
    // dirección central. Los bancos tienen las siguientes restricciones:
    //
    //    Siempre tienen que tener un nombre, que no puede ser modificado
    //
    //    Si no se especifica, todos los bancos tienen un capital por defecto de 5.2 millones de
    // euros al crearse.
    //
    //    El capital y la dirección de un banco son modificables.
    //
    // Modificar la clase CuentaCorriente para que cada una esté vinculada a un objeto de tipo
    // Banco. Escribir los métodos necesarios en la clase CuentaCorriente para gestionar el banco al
    // que pertenece (cambiar de banco, mostrar la info de la cuenta, incluidos los datos del banco
    // si lo tiene vinculado). Existe la posibilidad de que una cuenta corriente no esté vinculada a
    // ningún banco.
  }
}
