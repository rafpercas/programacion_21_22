package U4.T2.entregablePizzeria;

public class ingrediente {
    private String nombre;
    private Integer caloriasPor100;

    public ingrediente(){
        this.nombre="Queso";
        this.caloriasPor100=250;
    }
    public ingrediente(String nombreIngrediente, Integer caloriasPor100Ingrediente){
        this.nombre=nombreIngrediente;
        this.caloriasPor100=caloriasPor100Ingrediente;
    }

}
