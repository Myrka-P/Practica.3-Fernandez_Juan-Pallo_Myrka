/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.List;
import java.util.Objects;

/**
 *
 * @author Juan Fernandez
 */
public class Cantante extends Persona {

    private String nombreArtistico;
    private String generoMusical;
    private int numeroDeSencillos;
    private int numeroDeConciertos;
    private int numeroDeGiras;
    private List<Disco> discografia;

    public Cantante() {
    }

    public Cantante(String nombreArtistico, String generoMusical, int numeroDeSencillos, int numeroDeConciertos, int numeroDeGiras, List<Disco> discografia, int codigo, String nombre, String apellido, int edad, String nacionalidad, double salario) {
        super(codigo, nombre, apellido, edad, nacionalidad, salario);
        this.nombreArtistico = nombreArtistico;
        this.generoMusical = generoMusical;
        this.numeroDeSencillos = numeroDeSencillos;
        this.numeroDeConciertos = numeroDeConciertos;
        this.numeroDeGiras = numeroDeGiras;
        this.discografia = discografia;
    }

   

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.numeroDeSencillos;
        hash = 97 * hash + this.numeroDeGiras;
        hash = 97 * hash + Objects.hashCode(this.discografia);
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
        final Cantante other = (Cantante) obj;
        if (this.numeroDeSencillos != other.numeroDeSencillos) {
            return false;
        }
        if (this.numeroDeGiras != other.numeroDeGiras) {
            return false;
        }
        return Objects.equals(this.discografia, other.discografia);
    }

    @Override
    public String toString() {
        return "Cantante{" + "nombreArtistico=" + nombreArtistico
                + ", generoMusical=" + generoMusical + ", numeroDeSencillos=" + numeroDeSencillos
                + ", numeroDeConciertos=" + numeroDeConciertos + ", numeroDeGiras=" + numeroDeGiras
                + ", discografia=" + discografia + '}';
    }

 
    @Override
    public double calcularSalario() {
        double salarioBase = 1000.0;
        if (numeroDeSencillos > 10 && numeroDeGiras > 3) {
            salarioBase += 1000.0;
        } else if (numeroDeSencillos >= 1 && numeroDeSencillos <= 10) {
            salarioBase += salarioBase * 0.05;
        }

        if (numeroDeGiras >= 1 && numeroDeGiras <= 3) {
            salarioBase += salarioBase * 0.03;
        }

        if (discografia.size() >= 5) {
            salarioBase += 2000.0;
        } 
        return salarioBase;
    }
    
        
    
    public void agregarDisco(int codigo,String nombre,int anioDeLanza){
        discografia.add(new Disco(01,"cancion 1",2010));
        discografia.add(new Disco(02,"cancion 2",2011));
        discografia.add(new Disco(03,"cancion 3",2012));
        discografia.add(new Disco(04,"cancion 4",2013));
        
        System.out.println(discografia);
    }
    
    
}
