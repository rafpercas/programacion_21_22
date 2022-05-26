package Perez_Castano_U8U9_Examen.ejercicio3;

public class Main {
  public static void main(String[] args) {
    System.out.println(Consultas.mostrarEmpleados(3));

    Consultas.listToJson();

    ConexionBD.close();
  }
}
