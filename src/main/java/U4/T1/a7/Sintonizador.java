package U4.T1.a7;
// Actividad 7: Se quiere definir una clase que permita controlar un sintonizador digital de
// emisoras FM; concretamente, se desea dotar al controlador de una interfaz que permita subir (up)
// o bajar (down) la frecuencia (en saltos de 0.5 MHz) y mostrar la frecuencia sintonizada en un
// momento dado (display).
//
// Supondremos que el rango de frecuencias a manejar oscila entre los 80MHz y los 108MHz y que, al
// inicio, el controlador sintonice a 80MHz. Si durante una operación de subida o bajada se
// sobrepasa uno de los dos límites, la frecuencia sintonizada debe pasar a ser la del extremo
// contrario.
//
// Escribir un pequeño programa principal para probar su funcionamiento.
public class Sintonizador {
    private float frecuencia;

    public float getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(float frecuencia) {
        this.frecuencia = frecuencia;
    }

    public Sintonizador(){
        setFrecuencia(80.0F);
    }
    public void modificarFrecuencia(String modificacion){
        if(modificacion.equalsIgnoreCase("up")){
            this.frecuencia+=0.5F;
        } else if(modificacion.equalsIgnoreCase("down")){
            this.frecuencia-=0.5F;
        }
        if(this.frecuencia<80){
            this.frecuencia=108;
        }else if(this.frecuencia>108){
            this.frecuencia=80;
        }
    }
    public void display(){
        System.out.println("La frecuencia actual es: "+getFrecuencia()+"MHz");
    }

}
