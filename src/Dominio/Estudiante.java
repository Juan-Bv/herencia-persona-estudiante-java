package Dominio;

public class Estudiante extends Persona {

    private String carrera;

    public Estudiante(String id, String nombre, String carrera) {
        super(id, nombre);
        this.carrera = carrera;
    }

    @Override
    public String obtenerDatos() {
        return getId() + " " + getNombre() + " " + carrera;
    }
}