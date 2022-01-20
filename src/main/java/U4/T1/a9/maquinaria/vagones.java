package U4.T1.a9.maquinaria;

 class vagones {
    private float capMax;
    private float capActual;
    private String tipoCarga;


     public float getCapMax() {
        return capMax;
    }

    public void setCapMax(float capMax) {
        this.capMax = capMax;
    }

    public float getCapActual() {
        return capActual;
    }

    public void setCapActual(float capActual) {
        this.capActual = capActual;
    }

    public String getTipoCarga() {
        return tipoCarga;
    }

    public void setTipoCarga(String tipoCarga) {
        this.tipoCarga = tipoCarga;
    }
    public vagones(float capMaxVagon,float capActualVagon,String tipoCargaVagon){
        setCapMax(capMaxVagon);
        setCapActual(capActualVagon);
        setTipoCarga(tipoCargaVagon);
    }
}
