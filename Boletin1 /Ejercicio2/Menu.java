package Ejercicio2;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("---------Menu--------- \n"
        +"1. Calcular area triangulo \n"
        +"2. Calcular area cuadrado \n"
        +"3. Calcular area rectangulo \n"
        +"4. Calcular area rombo \n"
        +"5. Salir"
        );

        System.out.println(" ");
        boolean querercontinuar=true;

        do { 
            System.out.println("¿Qué quieres hacer?");
            int opcion=sc.nextInt();
            switch (opcion) {
                case 1:
                    Triangulo triangulo=new Triangulo(2, 3);
                    System.out.println("El area del triangulo es: "+triangulo.calcularArea());
                    break;
                case 2:
                    Cuadrado cuadrado=new Cuadrado(2);
                    System.out.println("El area del cuadrado es: "+cuadrado.calcularArea());
                    break;
                case 3:
                    Rectangulo rectangulo=new Rectangulo(2, 4);
                    System.out.println("El area del rectangulo es: "+rectangulo.calcularArea());
                    break;
                case 4:
                    Rombo rombo=new Rombo(4, 2);
                    System.out.println("El area del rombo es: "+rombo.calcularArea());
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    querercontinuar=false;
                    break;
            }
        } while (querercontinuar);
    }
}
