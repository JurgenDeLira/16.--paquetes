package org.jdelira.app.jardin;

import org.jdelira.app.hogar.Persona;

public class Perro {

    protected String nombre;
    protected String raza;

    String jugar(Persona persona){

        return persona.lanzarPelota();
    }
}