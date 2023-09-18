package Polimorfismo;

import ClasesObjetos.*;
import Herencia.*;

public class TestMuestraConjunto {
    public static void main(String[] args){
        Object[] arr = { new Fecha(27,11,1976)
                        , new FechaDetallada("23/12/1977")
                        , new String("Esto es una cadena")
                        , new Integer(34) };

        // como el metodo es estatico lo invoco a traves de la clase 
        MuestraConjunto.mostrar(arr);
    }
}
