package Instancias;

import Herencia.FechaDetallada;

public class TestPersona {
    public static void main(String[] args) {
        Persona p1 = new Persona("Juan"
                                        ,"21773823"
                                        , new FechaDetallada(27,11,1976));

        Persona p2 = new Persona("Laura"
                                , "19234452"
                                , new FechaDetallada(23,12,1977));

        System.out.println(p1);
        System.out.println(p1);
        System.out.println(p1);

        System.out.println("---");

        System.out.println(p2);
        System.out.println(p2);

        System.out.println("---");

        System.out.println(p1);
        System.out.println(p1);
    }
}
