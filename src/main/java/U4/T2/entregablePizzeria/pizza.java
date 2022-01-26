package U4.T2.entregablePizzeria;

import java.util.Arrays;

public class pizza {

    public enum EnumSize{
        mediana,
        familiar
    }
    private EnumSize size;
    private ingrediente[] ingredientes;


public static void muestraSizePizza(){
        for (EnumSize size: EnumSize.values() ) {
      System.out.println(size);
        }
}
    public pizza(){
    this.size=EnumSize.familiar;
    }
    public pizza(EnumSize sizePizza){
    this.size=sizePizza;
    }
    public void muestraCantidadIngredientes(){

    }
    int indiceArray = 0;
    public void addIngrediente(ingrediente ingredientePizza){
    this.ingredientes = new ingrediente[indiceArray+1];

        boolean quedaSitio = this.ingredientes.length < 3;
        if (quedaSitio) {
        this.ingredientes=Arrays.copyOf(this.ingredientes,indiceArray+1);
        this.ingredientes[indiceArray]=ingredientePizza;
      System.out.println("Ingrediente "+ingredientePizza.toString()+" añadido correctamente.");
      indiceArray++;
    } else if(this.ingredientes.length==3){
            this.ingredientes[indiceArray]=ingredientePizza;
            System.out.println("Ingrediente añadido correctamente.");
            }else {
      System.out.println("La pizza ya tiene el límite de ingredientes.");
    }
    }

    public void muestraInfoPizza(){
    System.out.println("El tamaño de la pizza es: "+this.size);
    System.out.println("Los ingredientes de la pizza son: "+ Arrays.toString(this.ingredientes));
    }

}
