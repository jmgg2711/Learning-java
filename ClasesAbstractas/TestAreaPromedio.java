package ClasesAbstractas;

public class TestAreaPromedio {
    public static void main(String[] args) {
        FigurasGeometricas arr[] = { new Circulo(23)
                                    , new Rectangulo(12, 4)
                                    , new Triangulo(2, 5) };
        double prom = FigurasGeometricas.areaPromedio(arr);

        System.out.println("Promedio = " + prom);
    }
}
