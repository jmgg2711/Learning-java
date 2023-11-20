package ClasesAbstractas;

public class Triangulo extends FigurasGeometricas{
    private double base;
    private double altura;

    public Triangulo(int b, int h){
        super("Triangulo");
        base = b;
        altura = h;
    }

    public double area(){
        return (base * altura) / 2;
    }
    
}
