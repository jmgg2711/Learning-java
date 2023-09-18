package ModificadoresAcceso;

public class Main {
    public static void main(String[] args){
        // Instancias de Usuario
        Usuario usuario1 = new Usuario("Juan","Gutierrez Gallegos",
        46,
        "Florencia, 8001-40",
        "+52-(664)-628-5907");

        System.out.println("Nombre: " + usuario1.nombre);
    }
}
