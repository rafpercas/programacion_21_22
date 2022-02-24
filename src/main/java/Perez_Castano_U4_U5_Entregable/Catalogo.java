package Perez_Castano_U4_U5_Entregable;

import java.util.Arrays;

public class Catalogo {
  private Multimedia[] cat = new Multimedia[0];
  private Integer indiceCat = 0;

  public void add_multimedia(Multimedia elemento) {
    this.cat = Arrays.copyOf(this.cat, this.cat.length + 1);
    this.cat[indiceCat] = elemento;
    indiceCat++;
  }

  public void eliminar_multimedia(Multimedia elemento) {
    Multimedia[] nuevoArrayCat = new Multimedia[this.cat.length - 1];
    for (int i = 0; i < cat.length; i++) {
      if (elemento.equals(cat[i])) {
        cat[i] = null;
      }
    }
  }

  public void ordenar_por_id() {
  }

  public void ordenar_por_titulo() {}

  public void ordenar_por_anyo() {}

  public void numero_de_elementos() {
    System.out.println(cat.length);
  }

  @Override
  public String toString() {
    return "Catalogo{" +
            "cat=" + Arrays.toString(cat) +
            ", indiceCat=" + indiceCat +
            '}';
  }
}
