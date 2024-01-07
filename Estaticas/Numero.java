package Estaticas;

public class Numero {

    private double valor;

    public Numero(double v){
        valor = v;
    }

    public Numero sumar(double a){
        valor+=a;
        return this;
    }
    
    public String toString(){
        return Double.toString(valor);
    }
    public static double sumar(double a, double b) {
        return a + b;
    }
}
