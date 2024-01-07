package Estaticas;

public class TestNumero {
    public static void main(String[] args) {
        
        // sumamos utilizando el método estático
        double d = Numero.sumar(2,3);
        System.out.println(d);

        // definimos un número con valor 5 y luego 
        // sumamos 4 con el método sumar de instancia 
        Numero n1 = new Numero(5);
        n1.sumar(4);

        System.out.println(n1);

        // sumamos concatenando invocaciones al método sumar
        n1.sumar(4).sumar(6).sumar(8).sumar(1);
        System.out.println(n1);
    }
}
