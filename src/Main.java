//RECUPERATORIO + PUNTOS EXTRA
// Jennifer Daniela Maigual Alvarez


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Persona> personas = new ArrayList<>();
        Persona p1 = new Persona("Lugel", 27, "112345689");

        personas.add(p1);

        personas.add(new Persona("Camilo", 17, "122345689"));
        System.out.println("....Lista de personas....");
        for (int i = 0; i<personas.size(); i++){

            System.out.println(personas.get(i).mostrar());
            System.out.println("Es mayor de edad: " + personas.get(i).esMayorDeEdad());
        }

        //EJERCICIO PRACTICO
        System.out.println(" ");
        System.out.println("....\uD83D\uDCB8CUENTAS BANCARIAS\uD83D\uDCB8....");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del titular de la cuenta: ");
        String nombreTitular = scanner.nextLine();
        System.out.print("Ingrese el saldo inicial de la cuenta: ");
        double saldoInicial = scanner.nextDouble();
        if (saldoInicial >= 0) {

            System.out.println("Registro del saldo inicial exitoso !!");


        } else {
            System.out.println("El saldo inicial debe ser mayor o igual que cero ");
        }

        Cuenta cuenta = new Cuenta(nombreTitular, saldoInicial);

        int opcion;
        do {
            System.out.println("\nMENU DE OPCIONES");
            System.out.println("1. Hacer un ingreso");
            System.out.println("2. Hacer un retiro");
            System.out.println("3. Consultar saldo");
            System.out.println("4. Consultar datos de la cuenta");
            System.out.println("0. Salir");
            System.out.print("\nIngrese su opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:

                    System.out.print("Digite el monto de dinero a ingresar: ");
                    double montoIngreso = scanner.nextDouble();

                    if (montoIngreso > 0) {
                        cuenta.setIngreso(montoIngreso);
                        System.out.println("Ingreso de $" + montoIngreso + " realizado con éxito.");


                    } else {
                        System.out.println("El monto de dinero ingresado debe ser mayor que cero.");
                    }
                    break;
                case 2:
                    System.out.print("Digite el monto de dinero a retirar: ");
                    double montoRetiro = scanner.nextDouble();

                    if (montoRetiro > 0 && montoRetiro <= cuenta.getSaldoCuenta()) {
                        cuenta.setRetiro(montoRetiro);
                        System.out.println("Retiro de $" + montoRetiro+ " realizado con éxito.");
                    } else if (montoRetiro <= 0) {
                        System.out.println("El monto de dinero a retirar debe ser mayor que cero.");
                    } else {
                        System.out.println("Fondos insuficientes para realizar el retiro.");
                    }
                    break;
                case 3:
                    System.out.println("Saldo actual: " + cuenta.getSaldoCuenta());
                    break;
                case 4:
                    System.out.println(cuenta.getDatosCuenta());
                    break;
                case 0:
                    System.out.println("Saliendo del sistema...\uD83D\uDE1E");
                    System.out.println("Regresa Pronto");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 0);

        scanner.close();


                    

    }
}