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
        System.out.println("....CUENTA....");
        Cuenta cuenta = new Cuenta("David Aza", 1000.0);

        cuenta.getDatosCuenta();
        cuenta.setIngreso(500.0);
        cuenta.setRetiro(200.0);
        System.out.println(" ");
        cuenta.getDatosCuenta();
                    

    }
}