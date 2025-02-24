package org.jdelira.app.hogar;

import org.jdelira.app.jardin.Perro;
import static org.jdelira.app.hogar.Persona.saludar;

public class EjemploHogar {
    public static void main(String[] args) {
        Persona p = new Persona();
        Perro perro = new Perro();
        String saludo = saludar();
    }
}
