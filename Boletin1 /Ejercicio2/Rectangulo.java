package Ejercicio2;

public class Rectangulo {
    private double base;
    private double altura;
    private double area;

    public Rectangulo (double base, double altura) {
        this.base=base;
        this.altura=altura;
    }

    public double calcularArea () {
        return area=base*altura;
    }
}
