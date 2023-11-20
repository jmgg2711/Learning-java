package Instancias;

// Los objetos son instancias de las clases porque cada uno (cada objeto)
// mantiene diferentes combinaciones de valores en sus atributos. Las expresiones
// "crear un objeto" e "instanciar la clase" muchas veces son sinónimos aunque 
// no siempre "instanciar" implica "crear un objeto" en el sentido de definir
// una variable para que lo contenga.

public class X {
    private int a;
    private int b;

    public X (int a, int b){
        this.a = a;
        this.b = b;
    }

    public String toString(){
        return "("+a+","+b+")";
    }
}
