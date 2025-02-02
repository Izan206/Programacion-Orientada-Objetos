package Ejercicio3;

public class CuentaCorriente {
    public String iban;
    private double saldo;
    private float porcComision;
    private int contadorIngresos;

    public CuentaCorriente (String iban, float porcComision) {
        this.iban=iban;
        this.porcComision=porcComision;
        this.saldo=0;
        this.contadorIngresos=0;
    }

    public void ingresar (float importe) {
        saldo+=importe;
        contadorIngresos++;
        if (contadorIngresos==3) {
            saldo+=0.7f;
            contadorIngresos=0;
        }
    }

    public boolean retirar (float importe) {
        float totalRetirar=importe+((importe * porcComision / 100));
        if (saldo>=totalRetirar) {
            saldo-=totalRetirar;
            contadorIngresos=0;
            return true;
        } else {
            System.out.println("Saldo insuficiente");
            return false;
            
        }

    }

    public float getSaldo () {
        return (float) saldo;
    }

    public void setComision (float porcComision){
        this.porcComision=porcComision;
    }

    public float getPorcentajeComision() {
        return porcComision;
    }
}
