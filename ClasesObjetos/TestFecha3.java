package ClasesObjetos;

import java.util.Scanner;

public class TestFecha3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // el usuario ingresa los datos de la fecha
        System.out.print("Ingrese Fecha1 (dia, mes y anio): ");
        int dia = entrada.nextInt();
        int mes = entrada.nextInt();
        int anio = entrada.nextInt();

        // creo un objeto de la clase Fecha
        Fecha f1 = new Fecha(dia,mes,anio);

        // el usuario ingresa los datos de la fecha
        System.out.print("Ingrese Fecha2 (dia, mes y anio): ");
        dia = entrada.nextInt();
        mes = entrada.nextInt();
        anio = entrada.nextInt();

        entrada.close();
        
        // creo un objeto de la clase Fecha
        Fecha f2 = new Fecha(dia,mes,anio);

        System.out.println("Fecha 1 = " + f1);
        System.out.println("Fecha 2 = " + f2);

        if( f1.equals(f2)) {
            System.out.println("Son iguales !");
        } else {
            System.out.println("Son distintas...");
        }

    }
}
