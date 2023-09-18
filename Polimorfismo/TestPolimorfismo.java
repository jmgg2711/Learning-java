package Polimorfismo;

import ClasesObjetos.*;
import Herencia.*;

public class TestPolimorfismo {
    public static void main(String[] args){
        Fecha fec = new FechaDetallada("27/11/1976");

        Object obj = new FechaDetallada("23/12/1977");

        System.out.println("fec: " + fec); //invoca a toString de fec
        System.out.println("obj: "+ obj); //invoca a toString de obj
    }
}
