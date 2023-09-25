//RECUPERATORIO + PUNTOS EXTRA
// Jennifer Daniela Maigual Alvarez
import java.util.Random;

public class Cuenta {
    //propiedades
    private double saldoDeCuenta;
    private String nombreDelTitular;
    private long numeroDeCuenta;

    //constructor
    public Cuenta (String nombreDelTitular, double saldoDeCuenta){
        this.saldoDeCuenta=saldoDeCuenta;
        this.nombreDelTitular=nombreDelTitular;
        this.numeroDeCuenta=generarNumeroDeCuenta();
    }
    private long generarNumeroDeCuenta() {
        Random random = new Random();
        // Generamos un número de cuenta aleatorio entre 1000000000 y 9999999998
        return 1000000000L + random.nextLong () % (9999999998L - 1000000000L + 1);
    }
    public void setIngreso(double cantidad) {
        saldoDeCuenta +=cantidad;

    }
    public void setRetiro(double cantidad) {
        saldoDeCuenta -= cantidad;

    }
    public double getSaldoCuenta() {
        return this.saldoDeCuenta;
    }

    public String getDatosCuenta() {
       return ("Datos de la cuenta " +"\n"
               + "Nombre del titular: "+ nombreDelTitular+"\n"
               + "Número de cuenta: " + numeroDeCuenta +"\n"
               + "Saldo actual: $" + saldoDeCuenta+ "\n");
    }

}
