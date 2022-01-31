package U4.T2.entregablePizzeria;

public class Pizza {

    public enum EnumSize {
        mediana,
        familiar
    }

    public final int maxIngredientes = 3;
    private EnumSize size;
    private Ingrediente[] ingredientes = new Ingrediente[maxIngredientes];
    private int contadorIngredientes = 0;
    public static final int maxIngredien = 5;

    public static void muestraSizePizza() {
        System.out.println("Tamaños: ");
        for (EnumSize size : EnumSize.values()) {
            System.out.println(size);
        }
    }

    public Pizza() {
        this.size = EnumSize.familiar;
    }

    public Pizza(EnumSize sizePizza) {
        this.size = sizePizza;
    }

    public int cantidadIngredientes() {
        return contadorIngredientes;
    }

    // int indiceArray = 0;

    // public void addIngrediente(ingrediente ingredientePizza) {
    // this.ingredientes = new ingrediente[indiceArray + 1];

    // boolean quedaSitio = this.ingredientes.length < 3;
    // if (quedaSitio) {

    //   this.ingredientes[indiceArray] = ingredientePizza;
    //    System.out.println("Ingrediente " + ingredientePizza.toString() + " añadido
    // correctamente.");
     //   this.ingredientes = Arrays.copyOf(this.ingredientes,this.igredientes.lenght+1);
    //    indiceArray++;

    // } else{
    //   System.out.println("La pizza ya tiene el límite de ingredientes.");
    //  }

    // }
    public boolean addIngrediente(Ingrediente ingredientePizza) {
        boolean quedaSitio = false;
        if (contadorIngredientes < maxIngredientes) {
            ingredientes[contadorIngredientes++] = ingredientePizza;
            quedaSitio = true;
        }
        return quedaSitio;
    }

    public void muestraInfoPizza() {
        System.out.println("El tamaño de la pizza es: " + this.size);
        System.out.println("Ingredientes: ");
        for (int i = 0; i < contadorIngredientes; i++) {
            System.out.println("   - " + ingredientes[i].getNombre());
        }
    }
}
