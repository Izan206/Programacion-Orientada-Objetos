package Ejercicio3;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el IBAN de la cuenta:");
        String iban = sc.nextLine();

        System.out.println("Introduce el porcentaje de comisión para retiradas:");
        float porcentajeComision = sc.nextFloat();

        CuentaCorriente cuenta = new CuentaCorriente(iban, porcentajeComision);

        System.out.println("----------Menu----------- \n"
                + "1. Ingresar importe. \n"
                + "2. Retirar importe. \n"
                + "3. Ver saldo. \n"
                + "4. Cambiar comision de retirada. \n"
                + "5. Ver porcentaje de comision. \n"
                + "6. Salir.");

        boolean querercontinuar = true;

        do {
            System.out.println("Elige que quieres hacer: ");
            int opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Que importe quieres realizar?");
                    float importeIngresar = sc.nextFloat();
                    cuenta.ingresar(importeIngresar);
                    break;

                case 2:
                    System.out.print("Qué importe quieres retirar? ");
                    float importeRetirar = sc.nextFloat();
                    if (cuenta.retirar(importeRetirar)) {
                        System.out.println("Retirada realizada con éxito.");
                    }
                    break;

                case 3:
                    System.out.println("Tu saldo actual es de: " + cuenta.getSaldo() + " euros.");
                    break;

                case 4:
                    System.out.print("Introduce el nuevo porcentaje de comisión: ");
                    float nuevaComision = sc.nextFloat();
                    cuenta.setComision(nuevaComision);
                    System.out.println("Porcentaje de comisión actualizado.");
                    break;

                case 5:
                    System.out.println("Tu porcentaje de comisión actual es de: " + cuenta.getPorcentajeComision() + "%.");
                    break;

                case 6:
                    System.out.println("Saliendo...");
                    querercontinuar = false;
                    break;

            }
        } while (querercontinuar);

    }
}
