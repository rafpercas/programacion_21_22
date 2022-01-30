package U4.T1.a9;

import U4.T1.a9.personal.jefesEstacion;
import U4.T1.a9.personal.maquinistas;
import U4.T1.a9.personal.mecanicos;
import U4.T1.a9.maquinaria.locomotoras;
import U4.T1.a9.maquinaria.trenes;

// Actividad 9: Implementar las clases con sus atributos y constructores para gestionar una empresa
// ferroviaria, en la que se distingues dos grandes grupos: personal y maquinaria. En el primero se
// ubican todos los empleados de la empresa, que se clasifican en 3 grupos: maquinistas, mecánicos y
// jefes de estación. De cada uno de ellos hay que guardar:
//
//    Maquinistas: nombre completo, dni, sueldo mensual, rango
//
//    Mecánicos: nombre completo, tlfno y especialidad (frenos, hidráulica,...)
//
//    Jefes estación: nombre completo, dni.
//
// En cuestión de maquinaria podemos encontrar trenes, locomotoras, y vagones. De cada uno hay que
// considerar:
//
//    Vagones: tienen una capacidad máxima de carga (en kilos), una capacidad actual (carga en un
// momento dado), y el tipo de mercancía con el que están cargados.
//
//    Locomotoras: disponen de una matrícula, potencia de su motor y un año de fabricación. Cada
// locomotora tiene asignado un mecánico que se encarga de su mantenimiento.
//
//    Trenes: están formados por una locomotora y un máximo de 5 vagones. Cada tren tiene asignado
// un maquinista que es responsable de él.
//
// Todas las clases correspondientes al personal serán de uso público. Entre las clases relativas a
// la maquinaria solo será posible construir, desde clases externas, objetos tipo Tren y de tipo
// Locomotora. La clase Vagon será solo visible por sus clases vecinas.
public class main {
  public static void main(String[] args) {
    maquinistas maqui1 = new maquinistas("rafael", "20200200H", 960, "nose");
    mecanicos mec1 = new mecanicos("Manuel", 999999999, mecanicos.enumEspecialidad.frenos);
    mecanicos mec2 = new mecanicos("Daniel", 55555555, mecanicos.enumEspecialidad.hidraulica);
    jefesEstacion j1 = new jefesEstacion("kejfw", "33333333I");
    locomotoras l1 = new locomotoras("wuy7878", 280, 2015);

  }
}
