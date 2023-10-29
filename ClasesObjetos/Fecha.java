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

    private int fechaToDias(){
        return anio * 360 + mes * 30 + dia;
    }

    private void diasToFecha(int i){
        // dividimos por 360 y obtenemos el anio
        anio = (int)i/360;

        // del resto de la division anterior podremos obtener el mes y el dia
        int resto = i % 360;

        // el mes es el resto dividido 30
        mes = (int)resto/30;

        // el resto de la division anterior son los dias
        dia = resto % 30;

        // ajuste por si dia quedo en cero
        if(dia == 0){
            dia = 30;
            mes--;
        }

        // ajuste por si el mes quedo en cero
        if(mes == 0){
            mes = 12;
            anio--;
        }
    }
        public void addDias(int d){
            // convierto la fecha a dias y le sumo d
            int sum = fechaToDias() + d;
            
            // la fecha resultante (sum) la separo en dia, mes y anio
            diasToFecha(sum);
        }
}

