package entregable67corregido;

import java.io.Serializable;

public class ParCotizacion implements Serializable {
    private Divisa divisaBase;
    private Divisa divisaCotizada;
    private Double precio;
    private Double variacionPorcentual;

    public Divisa getDivisaBase() {
        return divisaBase;
    }

    public void setDivisaBase(Divisa divisaBase) {
        this.divisaBase = divisaBase;
    }

    public Divisa getDivisaCotizada() {
        return divisaCotizada;
    }

    public void setDivisaCotizada(Divisa divisaCotizada) {
        this.divisaCotizada = divisaCotizada;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Double getVariacionPorcentual() {
        return variacionPorcentual;
    }

    public void setVariacionPorcentual(Double variacionPorcentuak) {
        this.variacionPorcentual = variacionPorcentuak;
    }

    public ParCotizacion(Divisa divisaBase, Divisa divisaCotizada, Double precio, Double variacionPorcentual) {
        this.divisaBase = divisaBase;
        this.divisaCotizada = divisaCotizada;
        this.precio = precio;
        this.variacionPorcentual = variacionPorcentual;
    }

    @Override
    public String toString() {
        return "ParCotizacion: " +
                "divisaBase=" + divisaBase.getNombre() +
                ", divisaCotizada=" + divisaCotizada.getNombre() +
                ", precio=" + precio +
                ", variacionPorcentual=" + variacionPorcentual +
                '.';
    }
}
