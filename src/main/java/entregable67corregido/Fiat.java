package entregable67corregido;

import java.io.Serializable;

public class Fiat extends Divisa implements Serializable {
    private String paisReferencia;

    public String getPaisReferencia() {
        return paisReferencia;
    }

    public void setPaisReferencia(String paisReferencia) {
        this.paisReferencia = paisReferencia;
    }

    public Fiat(String nombre, String simbolo, String paisReferencia) {
        super(nombre, simbolo);
        this.paisReferencia = paisReferencia;
    }

    @Override
    public String toString() {
        return super.toString() + ", paisReferencia='" + paisReferencia + ".";
    }
}
