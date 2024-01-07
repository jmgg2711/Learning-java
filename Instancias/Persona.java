package Instancias;

import ClasesObjetos.Fecha;
//import Herencia.FechaDetallada;

public class Persona {
    private String nombre;          // atributo
    private String dni;             // atributo
    private Fecha fechaNacimiento;  // atributo

    private int cont = 0;           // variable de estado

    public Persona(String _nombre, String _dni, Fecha _fecNac){
        this.nombre = _nombre;
        this.dni = _dni;
        this.fechaNacimiento = _fecNac;
    }

    public String toString(){
        cont++;
        return nombre + ", DNI: " + dni
                        + ", nacido el: " + fechaNacimiento
                        + " (" + cont + ")";
    }
}
