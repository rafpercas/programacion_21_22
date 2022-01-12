package U4.T1.a1;

import java.util.Scanner;

    // Actividad 1: Diseñar la clase CuentaCorriente, sabiendo que los datos que caracterizan a un
// objeto de ese tipo son: saldo, límite de descubrimiento (cantidad de dinero que se permite sacar
// de una cuenta que ya está a cero), nombre y DNI del titular. Las operaciones típicas con una
// cuenta corriente son:
//
//    Crear la cuenta: se necesita el nombre y DNI del titular. El saldo inicial será 0 y el límite
// de descubierto será de -50 euros.
//
//    Sacar dinero: solo se podrá sacar dinero hasta el límite de descubierto. El método debe
// indicar, por pantalla, un mensaje que indique si ha sido posible llevar a cabo la operación.
// Además, deberá devolver un valor booleano que indique lo mismo.
//
//    Ingresar dinero: se incrementa el saldo.
//
//    Mostrar información: muestra la información de la cuenta corriente.
    public class CuentaCorriente {
        Scanner teclado = new Scanner(System.in);
        private long saldo;
        private int limite;
        public String nombre;
        protected String dni;

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
            if (limite > 0 && limite < 10000) {
                this.limite = limite;
            }
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void CuentaCorriente(String nombreTitular, String dniTitular) {
            setSaldo(0);
            setLimite(-50);
            this.nombre = nombreTitular;
            this.dni = dniTitular;
        }

        public String getDni() {
            return dni;
        }

        public void setDni(String dni) {
            this.dni = dni;
        }


        public void sacar(long cantidad) {
            if (cantidad > this.saldo - this.limite) {
                System.out.println("No tiene suficiente saldo.");
            } else {
                this.saldo -= cantidad;
                System.out.println("Aqui tiene su dinero.");
            }
        }

        public void ingresar(long cantidad) {
            this.saldo += cantidad;
        }

        public void mostrarInfo() {
            System.out.println("La cantidad de saldo de la cuenta es de: " + getSaldo());
        }
}
