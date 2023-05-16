/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.edu.ups.prac_3_fernandez___pallo.Controlador;

/**
 *
 * @author Myrka
 */
public interface Icontrolador {
    public abstract void create(Object obj); //C
    
    public abstract Object read(Object obj); //R
    public abstract void update(Object obj); //U
    public abstract void delete(Object obj); //D
    public abstract void list();
    
    
}
