package ClasesAbstractas;

public class Rectangulo extends FigurasGeometricas{
    private double base;
    private double altura;

    public Rectangulo(double b, double a){
        super("Rectangulo"); // constructor del padre
        base = b;
        altura = a;
    }

    public double area(){
        return base * altura;
    }
    
}
