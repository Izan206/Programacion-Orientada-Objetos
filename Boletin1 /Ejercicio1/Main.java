package Ejercicio1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        //Creacion de Objetos
        Persona persona1=new Persona("Jose", "Rodriguez Mata", LocalDate.of(1965,01,15), 165);
        Persona persona2=new Persona("Maria", "Sanchez Gomez", LocalDate.of(1980,12,26), 170);
        Persona persona3=new Persona("Alejandro", "Gomez Gomez", LocalDate.of(2001,01,11), 190);
        Persona persona4=new Persona("Jose Manuel", "Perez Pons", LocalDate.of(2010,01,05), 127);

        //Impresion de objetos
        System.out.println("Muestra de datos." );
        System.out.println("");
        System.out.println("Datos persona 1: \n");
        persona1.mostrarDatos();
        System.out.println("");
        System.out.println("Datos persona 2: \n");
        persona2.mostrarDatos();
        System.out.println("");
        System.out.println("Datos persona 3: \n");
        persona3.mostrarDatos();
        System.out.println("");
        System.out.println("Datos persona 4: \n");
        persona4.mostrarDatos();
        System.out.println("");

        //Creacion de 2 nuevos Objetos (Apartado 3)
        Persona persona5=new Persona("Lorena", "Remeseiro Neira", 25, 162);
        Persona persona6=new Persona("Patricia", "Seoane Alvarez", 62, 154);

        //Llamada a el nuevo metodo para conseguir la fecha de Nacimiento de Lorena y Patricia
        System.out.println("Datos persona 5: ");
        persona5.mostrarDatos();
        System.out.println("");
        System.out.println("Datos persona 6: ");
        persona6.mostrarDatos();

    }
}
