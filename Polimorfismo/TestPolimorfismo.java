package Polimorfismo;

import ClasesObjetos.Fecha;
import Herencia.FechaDetallada;

public class TestPolimorfismo {
    public static void main(String[] args){
        // a fec (de tipo Fecha) le asigno un objeto FechaDetallada
        Fecha fec = new FechaDetallada("27/11/1976");

        // a obj (de tipo objeto) le asigno un objeto de FechaDetallada
        Object obj = new FechaDetallada("23/12/1977");

        System.out.println("fec: " + fec); //invoca a toString de fec
        System.out.println("obj: "+ obj); //invoca a toString de obj
    }
}
