package ClasesAbstractas;

public abstract class FigurasGeometricas {
    private String nombre;
    
    // método abstracto
    public abstract double area();

    public static double areaPromedio(FigurasGeometricas arr[]){
        int sum = 0;
        for( int i = 0; i < arr.length; i++){
            sum += arr[i].area();
        }
        return sum / arr.length;
    }

    public FigurasGeometricas(String nom){
        nombre = nom;
    }

    public String toString(){
        return nombre + " (area = " + area() + ")";
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
}
