package ClasesObjetos;

import java.util.Scanner;

public class TestFecha4 {
    public static void main(String[]args) {
        Scanner entrada = new Scanner(System.in);

        // Ingresar los datos de la fecha
        System.out.print("Ingresa Fecha (dd\\mm\\aaaa): ");

        // Lectura de fecha
        String sFecha = entrada.next();

        // Crear un objeto de la clase Fecha
        Fecha f = new Fecha(sFecha);

        // Despliegue de fecha ingresada
        System.out.println("La fecha ingresada es: " + f);

        // Ingreso de dias a sumar
        System.out.print("Ingrese dias a sumar (puede ser negativo): ");
        int diasSuma = entrada.nextInt();

        entrada.close();
        
        // se suman los dias ingresados
        f.addDias(diasSuma);

        // se muestra la nueva fecha con los dias sumados
        System.out.println("Sumando " + diasSuma + " La nueva fecha es: " + f);
    }
}
