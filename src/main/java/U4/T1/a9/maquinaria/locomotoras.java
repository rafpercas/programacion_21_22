package U4.T1.a9.maquinaria;

public class locomotoras {
    private String matricula;
    private float potencia;
    private int añoFabricacion;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public float getPotencia() {
        return potencia;
    }

    public void setPotencia(float potencia) {
        this.potencia = potencia;
    }

    public int getAñoFabricacion() {
        return añoFabricacion;
    }

    public void setAñoFabricacion(int añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }
    public locomotoras(String matriculaLocomotora,float potenciaLocomotora,int añoFabricacionLocomotora){
        setMatricula(matriculaLocomotora);
        setPotencia(potenciaLocomotora);
        setAñoFabricacion(añoFabricacionLocomotora);
    }
}
