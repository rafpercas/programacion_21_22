package Perez_Castano_U6U7_entregable;

public class Main {
  public static void main(String[] args) {
    Criptomoneda c1 = new Criptomoneda("Bitcoin", "BTC", 30000.70, 80.3, "hoy");
    System.out.println(c1);
    Criptomoneda c2 = new Criptomoneda("Ethereum", "ETH", 1200.3, 90.3, "hoy");
    System.out.println(c2);
    Criptomoneda c3 = new Criptomoneda("RafaCoin", "RC", 100000.99, 99.7, "hoy");
    System.out.println(c3);

    Fiat f1 = new Fiat("Euro", "EUR", "España");
    System.out.println(f1);
    Fiat f2 = new Fiat("Dolar Americano", "USD", "USA");
    System.out.println(f2);
    System.out.println();
    System.out.println("******************************************************");
    System.out.println();
    ParCotizacion c1c2 = new ParCotizacion(c1, c2, 400.20, 56.7);
    ParCotizacion c1c3 = new ParCotizacion(c1, c3, 200.7, 70.7);
    ParCotizacion c2c3 = new ParCotizacion(c2, c3, 120.6, 30.0);
    System.out.println(c1c2);
    System.out.println(c1c3);
    System.out.println(c2c3);
    ParCotizacion c1f1 = new ParCotizacion(c1, f1, 100.0, 57.8);
    ParCotizacion c1f2 = new ParCotizacion(c1, f2, 130.0, 52.8);
    ParCotizacion c2f1 = new ParCotizacion(c2, f1, 150.0, 43.8);
    ParCotizacion c2f2 = new ParCotizacion(c2, f2, 170.0, 24.8);
    System.out.println(c1f1);
    ParCotizacion c3f1 = new ParCotizacion(c3, f1, 150.5, 46.7);
    System.out.println();
    System.out.println("*******************************************************");
    System.out.println();
    Exchange e1 = new Exchange(c1, c2);

    e1.obtenerCotizaciones("EUR");

    e1.addCotizacion(c1c2);
    e1.addCotizacion(c1c3);
    e1.addCotizacion(c2c3);
    e1.addCotizacion(c1f1);
    e1.addCotizacion(c1f2);
    e1.addCotizacion(c2f1);
    e1.addCotizacion(c2f2);
    e1.addCotizacion(c3f1);

    System.out.println();
    e1.mostrarDivisasOrdenadas();
    System.out.println();
    e1.guardarCotizaciones();
    e1.recuperarCotizaciones();


  }
}
