package U4.T1;

public class CuentaCorriente {
    private long saldo;
    private int limite;
    private String nombre;
    private String dni;

    public long getSaldo() {
        return saldo;
    }

    public void setSaldo(long saldo) {
        this.saldo = saldo;
    }

    public int getLimite() {
        return limite;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }

    public void crear(String nombreTitular, String dniTitular){
        setSaldo(0);
        setLimite(-50);
        this.nombre = nombreTitular;
        this.dni = dniTitular;
    }
    public void sacar(int cantidad){
        if(cantidad>this.saldo-this.limite){
      System.out.println("No tiene suficiente saldo.");
        }else{
            this.saldo-=cantidad;
      System.out.println("Aqui tiene su dinero.");
        }
    }

    public void ingresar(int cantidad){
        this.saldo+=cantidad;
    }
    public void mostrarInfo(){
    System.out.println("La cantidad de saldo de la cuenta es de: "+ this.saldo);
    }
}

