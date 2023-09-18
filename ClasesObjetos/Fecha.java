package ClasesObjetos;

import java.time.Year;

public class Fecha {
    //#region Declaracion de variables
    private int dia;
    private int mes;
    private int anio;
    //#endregion

    //#region Constructores
    public Fecha(){

    }

    public Fecha(int _dia, int _mes, int _anio){
        dia = _dia;
        mes = _mes;
        anio = _anio;
    }

    public Fecha(String _sFecha){
        // Formato de la fecha "27/11/1976" (dia/mes/anio)
        int pos1 = _sFecha.indexOf('/');
        int pos2 = _sFecha.lastIndexOf('/');

        // Procesar dia 
        String sDia = _sFecha.substring(0, pos1);
        dia = Integer.parseInt(sDia);

        String sMes = _sFecha.substring(pos1 + 1, pos2);
        mes = Integer.parseInt(sMes);

        String sAnio = _sFecha.substring(pos2 + 1);
        anio = Integer.parseInt(sAnio);
    }
    //#endregion

    //#region Setters
    public void setDia(int _dia){
        this.dia = _dia;
    }

    public void setMes(int _mes){
        this.mes = _mes;
    }

    public void setAnio(int _anio){
        this.anio = _anio;
    }
    //#endregion

    //#region Getters

    public int getDia(){
        return dia;
    }

    public int getMes(){
        return mes;
    }

    public int getAnio(){
        return anio;
    }
    //#endregion

    //#region Declaracion de metodos
    // Sobreescritura de metodo toString (heredado de Object)
    public String toString(){
        return dia + "/" + mes + "/" + anio;
    }

    // Sobreescritura de metodo equals (heredado de Object)
    public boolean equals(Object o){
        Fecha otra = (Fecha)o;
        return (dia == otra.dia) && (mes == otra.mes) && (anio == otra.anio);
    }

    // Identifica anio bisiesto para saber si son 365 o 366 dias por anio.
    private boolean anioBisiesto(int _anio){
        boolean bBisiesto = false;

        bBisiesto = Year.of(_anio).isLeap();
        //if(_anio % 4 == 1){
        //    bBisiesto = true;
        //}

        return bBisiesto;
    }

    // Identifica cuantos dias por mes
    private int mesDias(int _mes, int _anio){
        int numDias = 0;
        
        switch(_mes){
            case 1: 
            case 3:
            case 5:
            case 7:
            case 9:
            case 11:
                numDias = 31;
                break;
            case 4: 
            case 6:
            case 8:
            case 10:
            case 12: 
                numDias = 30;
                break;
            case 2:
                if(anioBisiesto(_anio)){
                    numDias = 29;
                }
                break;
            default: 
                System.out.println("ERROR: No es posible determinar anio bisiesto");    
        }
        
        return numDias;
    }

    public int fechaToDias(int _dia, int _mes, int _anio){
        
        if(anioBisiesto(_anio)){
            anio = _anio * 366;
        } else {
            anio = _anio * 365;
        }
        
        mes = mesDias(_mes, anio);
        
        return anio + mes + _dia;
    }

    // private void diasToFecha(int _dias){
    //     //se divide por 360 y se obtiene el anio
    //     int bisiesto;

    //     bisiesto = 
    //     anio = (int)_dias/360;

    //     // del resto de la division anterior se obtiene el mes y el dia

    // }
    //#endregion
}
