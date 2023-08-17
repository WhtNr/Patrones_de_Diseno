package clientes;

public class Cliente {
        private String nombre;
        private String direccion;
        private String email;

    public Cliente(String nombre, String direccion, String email) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.email = email;
    }
    public String getNombre() {
        return nombre;
    }

    }

