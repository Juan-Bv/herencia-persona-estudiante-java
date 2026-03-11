package Dominio;

public class Persona {

    private String id;
    private String nombre;

    public Persona(String id, String n) {
        this.id = id;
        this.nombre = n;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String obtenerDatos() {
        return id + " " + nombre;
    }
}