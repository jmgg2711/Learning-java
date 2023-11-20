package ClasesAbstractas;

public class Circulo extends FigurasGeometricas {
    private int radio;

    public Circulo(int r){
        super("Circulo");
        radio = r;
    }

    public double area(){
        // retorno "PI por radio al cuadrado"
        return Math.PI * Math.pow(radio, 2);
    }
    
}
