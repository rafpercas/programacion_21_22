package Perez_Castano_U8U9_Examen.ejercicio4;

import Perez_Castano_U8U9_Examen.ejercicio3.ConexionBD;

public class Main {
  public static void main(String[] args) {

  Transacciones.insertarLineaProducto();

   ConexionBD.close();
  }
}
