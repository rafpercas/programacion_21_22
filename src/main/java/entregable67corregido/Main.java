package entregable67corregido;

import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // DIVISAS
        Divisa dolar = new Fiat("Dolar", "USD", "Estados Unidos");
        Divisa euro = new Fiat("Euro", "EUR", "Comunidad Económica Europea");
        Divisa bitcoin = new Criptomoneda("Bitcoin", "BCN", 537.34, 1200D, "06/06/2006", 1);
        Divisa ethereum = new Criptomoneda("Ethereum", "ETH", 135.84, 800D, "06/06/2006", 2);
        Divisa cardano = new Criptomoneda("Cardano", "CAR", 227.15, 954D, "06/06/2006", 3);

        // PARES COTIZACIÓN
        ParCotizacion dolarEuro = new ParCotizacion(dolar, euro, 0.87, 0.2);
        ParCotizacion dolarBitcoin = new ParCotizacion(dolar, bitcoin, 0.015, 0.06);
        ParCotizacion dolarEthereum = new ParCotizacion(dolar, ethereum, 0.22, 0.01);
        ParCotizacion dolarcardano = new ParCotizacion(dolar, cardano, 0.5, -0.01);
        ParCotizacion euroDolar = new ParCotizacion(euro, dolar, 1.17, 0.2);
        ParCotizacion euroBitcoin = new ParCotizacion(euro, bitcoin, 0.018, -1D);
        ParCotizacion bitcoinDolar = new ParCotizacion(bitcoin, dolar, 537.34, -0.06);
        ParCotizacion bitcoinEthereum = new ParCotizacion(bitcoin, ethereum, 62D, 0.4);
        ParCotizacion ethereumEuro = new ParCotizacion(ethereum, euro, 125D, 0.12);
        ParCotizacion ethereumCardano = new ParCotizacion(ethereum, cardano, 0.5, 0.12);
        ParCotizacion cardanoDolar = new ParCotizacion(cardano, dolar, 227.15, 0.08);
        ParCotizacion cardanoBitcoin = new ParCotizacion(cardano, bitcoin, 0.15, -0.08);

        // EXCHANGE
        Exchange exchangeEmpresa = new Exchange();

        // Añadimos las cotizaciones.
        exchangeEmpresa.addCotizacion(dolarEuro);
        exchangeEmpresa.addCotizacion(dolarBitcoin);
        exchangeEmpresa.addCotizacion(ethereumEuro);
        exchangeEmpresa.addCotizacion(bitcoinDolar);
        exchangeEmpresa.addCotizacion(cardanoBitcoin);

        System.out.println("----OBTENEMOS LAS COTIZACIONES DEL DÓLAR (USD)----");
        exchangeEmpresa.obtenerCotizaciones("USD");
        System.out.println("----------------");
        System.out.println("----------------");
        System.out.println("----MOSTRAMOS LAS DIVISAS ORDENADAS----");
        exchangeEmpresa.mostrarDivisasOrdenadas();
        System.out.println("----------------");
        System.out.println("----------------");
        System.out.println("----MOSTRAMOS LAS COTIZACIONES AL ALZA----");
        exchangeEmpresa.mostrarCotizacionesAlAlzaUnaHora();
        System.out.println("----------------");
        System.out.println("----------------");
        exchangeEmpresa.guardarCotizaciones();
        exchangeEmpresa.recuperarCotizaciones();
        System.out.println("----MOSTRAMOS EL MAP DESPUÉS DE GUARDARLO Y CARGARLO----");
        Set<Map.Entry<Divisa, LinkedHashSet<ParCotizacion>>> e1 = exchangeEmpresa.getMapaCotizaciones().entrySet();
        for (Map.Entry<Divisa, LinkedHashSet<ParCotizacion>> entrada : e1) {
            System.out.println(entrada.getKey());
            System.out.println(entrada.getValue());
            System.out.println("----");
        }
        System.out.println("----AÑADIMOS LA ÚLTIMA DIVISA Y UN PAR DE COTIZACIONES, Y VOLVEMOS A GUARDAR Y CARGAR----");
        exchangeEmpresa.addCotizacion(euroBitcoin);
        exchangeEmpresa.addCotizacion(bitcoinEthereum);
        exchangeEmpresa.addCotizacion(dolarcardano);
        exchangeEmpresa.guardarCotizaciones();
        exchangeEmpresa.recuperarCotizaciones();
        Set<Map.Entry<Divisa, LinkedHashSet<ParCotizacion>>> e2 = exchangeEmpresa.getMapaCotizaciones().entrySet();
        for (Map.Entry<Divisa, LinkedHashSet<ParCotizacion>> entrada : e2) {
            System.out.println(entrada.getKey());
            System.out.println(entrada.getValue());
            System.out.println("----");
        }
    }
}
