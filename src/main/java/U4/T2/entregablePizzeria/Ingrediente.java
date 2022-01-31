package U4.T2.entregablePizzeria;

public class Ingrediente {
  private String nombre;
  private Integer caloriasPor100;

  public Ingrediente() {
    this.nombre = "Queso";
    this.caloriasPor100 = 250;
  }

  public Ingrediente(String nombreIngrediente, Integer caloriasPor100Ingrediente) {
    this.nombre = nombreIngrediente;
    this.caloriasPor100 = caloriasPor100Ingrediente;
  }

  public String getNombre() {
    return this.nombre;
  }
}
