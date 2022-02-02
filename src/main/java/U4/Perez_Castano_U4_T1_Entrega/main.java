package U4.Perez_Castano_U4_T1_Entrega;

public class main {
  public static void main(String[] args) {

    // En el programa principal, para probar todas las clases, deberemos crear 3 obras,
    // en 3 viviendas diferentes. Una de las viviendas tendrá dos baños. El resto de estancias y
    // datos de las viviendas, se configurarán como se prefiera. En todas las obras, tendremos que
    // insertar materiales
    // y borrar algunos, además de, obviamente, crear la ManoDeObra necesaria. También cambiaremos
    // el IVA.

    Vivienda vivienda1 = new Vivienda("Calle manolito 71", 250);
    //AÑADO ESTANCIAS
    vivienda1.addEstancia(Vivienda.enumEstanciasVivienda.balcon);
    vivienda1.addEstancia(Vivienda.enumEstanciasVivienda.bano);
    vivienda1.addEstancia(Vivienda.enumEstanciasVivienda.bano);
    vivienda1.addEstancia(Vivienda.enumEstanciasVivienda.comedor);
    vivienda1.addEstancia(Vivienda.enumEstanciasVivienda.dormitorio);
    vivienda1.mostrar_informacion();
    Vivienda vivienda2 = new Vivienda("Calle rafalito 71", 500);
    vivienda2.addEstancia(Vivienda.enumEstanciasVivienda.balcon);
    vivienda2.addEstancia(Vivienda.enumEstanciasVivienda.bano);
    vivienda2.addEstancia(Vivienda.enumEstanciasVivienda.comedor);
    vivienda2.addEstancia(Vivienda.enumEstanciasVivienda.dormitorio);
    vivienda2.addEstancia(Vivienda.enumEstanciasVivienda.dormitorio);
    vivienda2.addEstancia(Vivienda.enumEstanciasVivienda.dormitorio);
    //BORRO ESTANCIA
    vivienda2.removeEstancia(3);

    vivienda2.mostrar_informacion();

    Vivienda vivienda3 = new Vivienda("Calle pepito 71", 110);
    vivienda3.addEstancia(Vivienda.enumEstanciasVivienda.balcon);
    vivienda3.addEstancia(Vivienda.enumEstanciasVivienda.bano);
    vivienda3.addEstancia(Vivienda.enumEstanciasVivienda.dormitorio);
    vivienda3.addEstancia(Vivienda.enumEstanciasVivienda.comedor);
    vivienda3.addEstancia(Vivienda.enumEstanciasVivienda.dormitorio);
    vivienda3.mostrar_informacion();
    ManoDeObra manoDeObra1 = new ManoDeObra("hola", "nose", 17, 4);

    //CREO MATERIALES
    Material m1 = new Material("clavo",50,0.1F);
    Material m2 = new Material("martillo",1,25);
    Material m3 = new Material("madera",200,0.4F);

    Obra obra1 = new Obra(vivienda1, manoDeObra1, Vivienda.enumEstanciasVivienda.balcon);
    obra1.addMaterial(m2);
    obra1.removeMaterial(0);
    obra1.mostrar_informacion();

    Obra obra2 = new Obra(vivienda2, manoDeObra1, Vivienda.enumEstanciasVivienda.bano);
    Obra obra3 = new Obra(vivienda3, manoDeObra1, Vivienda.enumEstanciasVivienda.dormitorio);

    // CAMBIAR IVA
    Material.cambiarIVA(35);
  }
}
