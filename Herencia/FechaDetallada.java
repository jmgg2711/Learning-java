package Herencia;

import ClasesObjetos.Fecha;

public class FechaDetallada extends Fecha{
    public static String meses[] = {"Enero",
                                    "Febrero",
                                    "Marzo",
                                    "Abril",
                                    "Mayo",
                                    "Junio",
                                    "Julio",
                                    "Agosto",
                                    "Septiembre",
                                    "Octubre",
                                    "Noviembre",
                                    "Diciembre"};

    public FechaDetallada(){

    }                                
    public FechaDetallada(String f){
        super(f);
    }
    public String toString(){
        return getDia() + " de " + meses[getMes() - 1] + " de " + getAnio();
    }
}
