/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Clases.Persona;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Juan Fernandez
 */
public class PersonaControlador implements IControlador {

    private List<Persona> persona;


    
    public PersonaControlador() {
        persona = new ArrayList<>();
    }

    public void imprimir() {

    }

    public Persona buscarPorNombre(String valor) {
        
        return null;

    }

    public Persona buscarPorTitulo(String valor) {

        return null;

    }

    @Override
    public void create(Persona obj) {
        
         if (obj instanceof Persona) {
            persona.add((Persona) obj);
        }
        
    }

    @Override
    public Object read(Persona obj) {
        if(obj instanceof Persona){
            Persona nombre = (Persona) obj;
            for (Persona persona : persona) {
                if (persona.getNombre().equals(nombre)) {
                    return persona;
                }
            }
        }

        return null;
    }

    @Override
    public void update(Persona obj) {
        if (obj instanceof Persona) {

            String nacionalidad = ((Persona) obj).getNacionalidad();
            for (int i = 0; i < persona.size(); i++) {
                Persona persona1 = persona.get(i);
                if (persona1.getNacionalidad().equals(nacionalidad)) {
                    persona.set(i, (Persona) obj);
                    break;
                }
            }

        }
    }

    @Override
    public void delete(Persona obj) {
        if (obj instanceof Persona) {

            for (int i = 0; i < persona.size(); i++) {
                Persona persona1 = persona.get(i);
                if (persona1.equals((Persona) obj)) {
                    persona.remove(i);
                    break;
                }
            }

        }
    }

    @Override
    public void list() {
        for(Persona persona1 : persona){                     
            System.out.println(persona1.toString());
        }
    }

    
    
}

