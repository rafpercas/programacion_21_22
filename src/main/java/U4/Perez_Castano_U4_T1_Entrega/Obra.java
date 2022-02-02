package U4.Perez_Castano_U4_T1_Entrega;

import java.util.Arrays;
import java.util.Calendar;

public class Obra {
  private Vivienda vivienda;
  private Material[] material = new Material[0];
  private ManoDeObra manoDeObra;
  private Vivienda.enumEstanciasVivienda estancia;
  private Integer indiceMaterial = 0;
  private String fechaObra;


  public Obra(Vivienda vivienda, ManoDeObra manoDeObra,Vivienda.enumEstanciasVivienda estancia) {
    this.vivienda = vivienda;
    this.manoDeObra = manoDeObra;
    this.estancia = estancia;
  }

  public Vivienda getVivienda() {
    return vivienda;
  }

  public void setVivienda(Vivienda vivienda) {
    this.vivienda = vivienda;
  }

  public Material[] getMaterial() {
    return material;
  }

  public void setMaterial(Material[] material) {
    this.material = material;
  }

  public ManoDeObra getManoDeObra() {
    return manoDeObra;
  }

  public void setManoDeObra(ManoDeObra manoDeObra) {
    this.manoDeObra = manoDeObra;
  }

  public Vivienda.enumEstanciasVivienda getEstancia() {
    return estancia;
  }

  public void setEstancia(Vivienda.enumEstanciasVivienda estancia) {
    this.estancia = estancia;
  }

  public void addMaterial(Material anadirMaterial) {
    for (int i = 0; i < material.length;i++) {
          this.material = Arrays.copyOf(this.material,this.material.length+1);
          this.material[indiceMaterial]=anadirMaterial;
          indiceMaterial++;
    }

  }

  public void removeMaterial(Integer posicion) {
    Material[] nuevoArrayMateriales =
            new Material[this.material.length];
    if (posicion <= this.material.length) {
      for (int i = 0; i < posicion; i++) {
        nuevoArrayMateriales[i] = this.material[i];
      }
      for (int i = posicion; i < nuevoArrayMateriales.length; i++) {
        nuevoArrayMateriales[i] = this.material[i + 1];
      }
      this.material = nuevoArrayMateriales;
    }else{
      System.out.println("La posición introducida está fuera de rango.");
    }

  }

  private String getFechaObra() {
    Calendar c = Calendar.getInstance();

    String dia, mes, annio, hora, minuto, segundo;

    dia = Integer.toString(c.get(Calendar.DATE));
    mes = Integer.toString(c.get(Calendar.MONTH) + 1);
    annio = Integer.toString(c.get(Calendar.YEAR));

    hora = Integer.toString(c.get(Calendar.HOUR));
    minuto = Integer.toString(c.get(Calendar.MINUTE));
    segundo = Integer.toString(c.get(Calendar.SECOND));

    return dia + "/" + mes + "/" + annio + " " + hora + ":" + minuto + ":" + segundo;
  }

  public void setFechaObra(String fechaObra) {
    this.fechaObra = fechaObra;
  }

  public void mostrar_informacion() {
    System.out.println("Vivienda: "+this.vivienda.getDireccion());
    System.out.println("Materiales: ");
    for (int i = 0; i < this.material.length; i++) {
      System.out.println("   - " + this.material[i].getDescripcion());
    }    System.out.println("");
    System.out.println("Mano de obra: "+this.manoDeObra.getCantObreros());
    System.out.println("Estancia: "+this.estancia);
    System.out.println("Fecha: "+getFechaObra());
  }
}
