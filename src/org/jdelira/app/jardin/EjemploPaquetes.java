package org.jdelira.app.jardin;

import org.jdelira.app.hogar.*;
import static org.jdelira.app.hogar.Persona.*;
import static org.jdelira.app.hogar.ColorPelo.*;

public class EjemploPaquetes {
    public static void main(String[] args) {

        Persona p = new Persona();
        p.setNombre("Jorge");
        p.setApellido("De Lira");
        p.setColorPelo(CAFE);
        System.out.println(p.getNombre());

        Perro perro = new Perro();
        perro.nombre = "Toby";
        perro.raza = "Bulldog";

        String jugando = perro.jugar(p);
        System.out.println("jugando = " + jugando);
        String saludo = saludar();
        System.out.println("saludo = " + saludo);
        String generoMujer = GENERO_FEMENINO;
        String generoHombre = GENERO_MASCULINO;
    }
}
