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

    public FechaDetallada(int dia, int mes, int anio){
        super(dia, mes, anio);
    }

    public FechaDetallada(){
        super();
        //this(0,0,0);
    }                                
    public FechaDetallada(String f){
        super(f);
    }
    public String toString(){
        return getDia() + " de " + meses[getMes() - 1] + " de " + getAnio();
    }
}
