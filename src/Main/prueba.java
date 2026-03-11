package Main;

import Dominio.Estudiante;

public class prueba {

    public static void main(String[] args) {

        Estudiante estudiante = new Estudiante(
                "01",
                "Juan Barros",
                "Ingeniería de Sistemas"
        );

        System.out.println(estudiante.obtenerDatos());
    }
}


