/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Juan Fernandez
 */
public class Compositor extends Persona {

    private int numeroDeComposiciones;
    private List<Cancion> cancionesTop100Billboard;
    private List<Cantante> clientes;

    /**
     *
     */
    public Compositor() {
    }

    public Compositor(int numeroDeComposiciones, List<Cancion> cancionesTop100Billboard, List<Cantante> clientes, int codigo, String nombre, String apellido, int edad, String Nacionalidad, double salario) {
        super(codigo, nombre, apellido, edad, Nacionalidad, salario);
        this.numeroDeComposiciones = numeroDeComposiciones;
        this.cancionesTop100Billboard = cancionesTop100Billboard;
        this.clientes = clientes;
    }

    public Compositor(int numeroDeComposiciones, int codigo, String nombre, String apellido, int edad, String nacionalidad, double salario) {
        super(codigo, nombre, apellido, edad, nacionalidad, salario);
        this.numeroDeComposiciones = numeroDeComposiciones;
    }

    public int getNumeroDeComposiciones() {
        return numeroDeComposiciones;
    }

    public void setNumeroDeComposiciones(int numeroDeComposiciones) {
        this.numeroDeComposiciones = numeroDeComposiciones;
    }

    public List<Cancion> getCancionesTop100Billboard() {
        return cancionesTop100Billboard;
    }

    public void setCancionesTop100Billboard(List<Cancion> cancionesTop100Billboard) {
        this.cancionesTop100Billboard = cancionesTop100Billboard;
    }

    public List<Cantante> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cantante> clientes) {
        this.clientes = clientes;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.numeroDeComposiciones;
        hash = 97 * hash + Objects.hashCode(this.cancionesTop100Billboard);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Compositor other = (Compositor) obj;
        if (this.numeroDeComposiciones != other.numeroDeComposiciones) {
            return false;
        }
        return Objects.equals(this.cancionesTop100Billboard, other.cancionesTop100Billboard);
    }

    @Override
    public double calcularSalario() {
        double salarioBase = 1000.0;

        if (numeroDeComposiciones > 5) {
            salarioBase += 300.0;
        }

        if (cancionesTop100Billboard.size() >= 1 && cancionesTop100Billboard.size() <= 3) {
            salarioBase += salarioBase * 0.1;
        } else if (cancionesTop100Billboard.size() >= 4 && cancionesTop100Billboard.size() <= 6) {
            salarioBase += salarioBase * 0.2;
        } else if (cancionesTop100Billboard.size() > 6) {
            salarioBase += salarioBase * 0.3;
        }

        return salarioBase;

    }

   /* Cancion c1 = new Cancion(01, "Un cigarrillo", "Regueton", 3.24);
    Cancion c2 = new Cancion(02, "Fanatica sensual", "Regueton", 4.00);
    Cancion c3 = new Cancion(03, "Es un secreto", "Regueton", 3.34);
    Cancion c4 = new Cancion(04, "Zapatito roto", "Regueton", 4.07);
    Cancion c5 = new Cancion(05, "La receta", "Regueton", 3.10);
    Cancion c6 = new Cancion(06, "Si no le contesto", "Regueton", 3.41);*/

   

    public void agregarCancion(int codigo, String titulo, String letra, double tiempoEnMinutos) {
        cancionesTop100Billboard = new ArrayList<>();
        Cancion c1 = new Cancion(01, "Un cigarrillo", "Regueton", 3.24);
        Cancion c2 = new Cancion(02, "Fanatica sensual", "Regueton", 4.00);
        Cancion c3 = new Cancion(03, "Es un secreto", "Regueton", 3.34);
        Cancion c4 = new Cancion(04, "Zapatito roto", "Regueton", 4.07);
        Cancion c5 = new Cancion(05, "La receta", "Regueton", 3.10);
        Cancion c6 = new Cancion(06, "Si no le contesto", "Regueton", 3.41);

        cancionesTop100Billboard.add(c1);
        cancionesTop100Billboard.add(c2);
        cancionesTop100Billboard.add(c3);
        cancionesTop100Billboard.add(c4);
        cancionesTop100Billboard.add(c5);
        cancionesTop100Billboard.add(c6);

    }

    public void agregarCliente(Cantante cliente) {
        clientes.add(cliente);
    }

    @Override
    public String toString() {
        return "Compositor{" + "numeroDeComposiciones=" + numeroDeComposiciones
                + ", cancionesTop100Billboard=" + cancionesTop100Billboard + ", clientes=" + clientes + '}';
    }

}
