package U7.T1.a3;

public class Numero implements Comparable<Numero>{
    private Integer numRandom;

    public Numero() {
        this.numRandom = (int) (0+(Math.random()*10));
    }

    @Override
    public String toString() {
        return "Numeros{" +
                "numRandom=" + numRandom +
                '}';
    }


    @Override
    public int compareTo(Numero numero) {
    return this.numRandom.compareTo(numero.numRandom);
    }
}
