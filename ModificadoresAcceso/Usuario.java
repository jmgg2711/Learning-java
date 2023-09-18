package ModificadoresAcceso;

public class Usuario {
    public String nombre;   // es accesible desde cualquier lugar del codigo.
    String apellidos;       // no se especifica modificador de acceso..
    int edad;               // ... el valor es 'default'
    String direccion;
    String telefono;

    public Usuario(){

    }

    public Usuario(String _nombre, 
                String _apellidos, 
                int _edad,
                String _direccion,
                String _telefono){ 
                    nombre = _nombre;
                    apellidos = _apellidos;
                    edad = _edad;
                    direccion = _direccion;
                    telefono = _telefono;               
    }

    public String getNombre(){
        return nombre;
    }

    public String getApellidos(){
        return apellidos;
    }

    public int getEdad(){
        return edad;
    }

    public String getDireccion(){
        return direccion;
    }

    public String getTelefono(){
        return telefono;
    }
    
}
