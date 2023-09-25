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
        if (cantidad > 0) {
            saldoDeCuenta += cantidad;
            System.out.println("Ingreso de $" + cantidad + " realizado con éxito.");
        } else {
            System.out.println("El monto de dinero ingresado debe ser mayor que cero.");
        }
    }
    public void setRetiro(double cantidad) {
        if (cantidad > 0 && cantidad <= saldoDeCuenta) {
            saldoDeCuenta -= cantidad;
            System.out.println("Retiro de $" + cantidad + " realizado con éxito.");
        } else if (cantidad <= 0) {
            System.out.println("El monto de dinero a retirar debe ser mayor que cero.");
        } else {
            System.out.println("Fondos insuficientes para realizar el retiro.");
        }
    }
    public double getSaldoCuenta() {
        return saldoDeCuenta;
    }
    public void getDatosCuenta() {
        System.out.println("Datos de la cuenta:");
        System.out.println("Nombre del Titular: " + nombreDelTitular);
        System.out.println("Número de cuenta: " + numeroDeCuenta);
        System.out.println("Saldo actual: $" + saldoDeCuenta);
    }

}
