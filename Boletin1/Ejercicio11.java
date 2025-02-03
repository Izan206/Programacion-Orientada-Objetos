public class Ejercicio11 {
    public static void main(String[] args) {
        boolean esEstudiante = true;
        boolean esTrabajador = false;
        boolean tieneCoche = true;


        System.out.println("esEstudiante && esTrabajador: " + (esEstudiante && esTrabajador));  
        System.out.println("esEstudiante || esTrabajador: " + (esEstudiante || esTrabajador));  
        System.out.println("!esTrabajador: " + (!esTrabajador)); 


        System.out.println("(esEstudiante && esTrabajador) || tieneCoche: " + ((esEstudiante && esTrabajador) || tieneCoche)); 
        System.out.println("!(esEstudiante || esTrabajador): " + (!(esEstudiante || esTrabajador)));  
    }
}
