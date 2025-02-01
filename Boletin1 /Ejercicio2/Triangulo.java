package Ejercicio2;

public class Triangulo {
    private double base;
    private double altura;
    private double area;

    public Triangulo (double base, double altura) {
        this.base=base;
        this.altura=altura;
    }

    public double calcularArea () {
       return area=(base*altura)/2;
    }
}
