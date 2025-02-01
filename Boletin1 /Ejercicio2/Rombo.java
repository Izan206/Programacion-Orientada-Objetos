package Ejercicio2;

public class Rombo {
    private double DImayor;
    private double DImenor;
    private double area;

    public Rombo (double DImayor, double DImenor) {
        this.DImayor=DImayor;
        this.DImenor=DImenor;
    }

    public double calcularArea () {
        return area=(DImayor*DImenor)/2;
    }
}
