package org.jdelira.app.jardin;

import org.jdelira.app.hogar.*;

public class EjemploPaquetes {
    public static void main(String[] args) {

        Persona p = new Persona();
        p.nombre = "Jorge";
        System.out.println(p.nombre);

        Perro perro = new Perro();
        perro.nombre = "Toby";
        perro.raza = "Bulldog";
    }
}
