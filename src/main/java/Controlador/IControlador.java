/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Controlador;

import Clases.Persona;

/**
 *
 * @author Juan Fernandez
 */
public interface IControlador {
    
    int MAX_OBJECTS = 10;
    
    public abstract  void create (Persona obj);
    public abstract Object read (Persona obj);
    public abstract void update (Persona obj);
    public abstract void delete (Persona obj);
    public abstract void list ();
    
}
    
