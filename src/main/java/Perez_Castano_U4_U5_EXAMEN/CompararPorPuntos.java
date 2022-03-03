package Perez_Castano_U4_U5_EXAMEN;


import java.util.Comparator;

public class CompararPorPuntos implements Comparator {
  @Override
  public int compare(Object objeto1, Object objeto2) {
    AgrupacionOficial agru1 = (AgrupacionOficial) objeto1;
    AgrupacionOficial agru2 = (AgrupacionOficial) objeto2;

    if (agru1.getPuntos() > agru2.getPuntos()) {
      return -1;
    } else if (agru1.getPuntos() < agru2.getPuntos()) {
      return 1;
    }
    return 0;
  }
}
