package Ejercicio1;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
    //Atributos
    private String nombre;
    private String apellidos;
    private LocalDate fecha;
    private int estatura;
    private int edad;
    private LocalDate fechaNacimiento;

    //Constructor de persona
    public Persona (String nombre, String apellidos, LocalDate fecha, int estatura) {
        this.nombre=nombre;
        this.estatura=estatura;
        this.apellidos=apellidos;
        this.fecha=fecha;
        this.edad=obtenerEdad(fecha);
        this.fechaNacimiento=fecha;
    }

    //Constructor de persona (Apartado 3)
    public Persona (String nombre, String apellidos, int edad, int estatura) {
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.edad=edad;
        this.fechaNacimiento=obtenerFecha(edad);
        this.fecha=this.fechaNacimiento;
        this.estatura=estatura;
      
    }

    public void mostrarDatos () {

        System.out.println(
            "Nombre: "+ getNombre()+"\n"
            + "Apellidos: "+ getApellidos()+"\n"
            + "Fecha de Nacimiento: "+ getFechaNacimiento()+"\n"
            + "Estatura: "+ getEstatura()+"\n"
            + "Edad: "+getEdad()+"\n"
            );

    }

    public int obtenerEdad(LocalDate fecha) {
        int edad;
        edad=Period.between(fecha, LocalDate.now()).getYears();
        return edad;
    }

    public LocalDate obtenerFecha (int edad) {
        LocalDate fechaNacimiento=LocalDate.now().minusYears(edad);
        return fechaNacimiento;
    }


    public String getNombre () {
        return this.nombre;
    }

    public String getApellidos () {
        return this.apellidos;
    }

    public LocalDate getFecha() {
        return this.fecha;
    }

    public int getEstatura () {
        return this.estatura;
    }

    public int getEdad () {
        return this.edad;
    }

    public LocalDate getFechaNacimiento () {
        return this.fechaNacimiento;
    }
}
