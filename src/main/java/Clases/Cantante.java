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

    public Cantante(String nombreArtistico, String generoMusical, int numeroDeSencillos, int numeroDeConciertos, int numeroDeGiras, int codigo, String nombre, String apellido, int edad, String nacionalidad, double salario) {
        super(codigo, nombre, apellido, edad, nacionalidad, salario);
        this.nombreArtistico = nombreArtistico;
        this.generoMusical = generoMusical;
        this.numeroDeSencillos = numeroDeSencillos;
        this.numeroDeConciertos = numeroDeConciertos;
        this.numeroDeGiras = numeroDeGiras;
    }
    
    
    

    public String getNombreArtistico() {
        return nombreArtistico;
    }

    public void setNombreArtistico(String nombreArtistico) {
        this.nombreArtistico = nombreArtistico;
    }

    public String getGeneroMusical() {
        return generoMusical;
    }

    public void setGeneroMusical(String generoMusical) {
        this.generoMusical = generoMusical;
    }

    public int getNumeroDeSencillos() {
        return numeroDeSencillos;
    }

    public void setNumeroDeSencillos(int numeroDeSencillos) {
        this.numeroDeSencillos = numeroDeSencillos;
    }

    public int getNumeroDeConciertos() {
        return numeroDeConciertos;
    }

    public void setNumeroDeConciertos(int numeroDeConciertos) {
        this.numeroDeConciertos = numeroDeConciertos;
    }

    public int getNumeroDeGiras() {
        return numeroDeGiras;
    }

    public void setNumeroDeGiras(int numeroDeGiras) {
        this.numeroDeGiras = numeroDeGiras;
    }

    public List<Disco> getDiscografia() {
        return discografia;
    }

    public void setDiscografia(List<Disco> discografia) {
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

    
    
    
    
    public void agregarDisco(int codigo, String nombre, int anioDeLanza) {
        
        discografia = new ArrayList<>();
        
        Disco d1 = new Disco(01, "cancion 1", 2010);
        Disco d2 = new Disco(02, "cancion 2", 2011);
        Disco d3 = new Disco(03, "cancion 3", 2013);
        Disco d4 = new Disco(04, "cancion 4", 2016);
        Disco d5 = new Disco(05, "cancion 5", 2018);
        Disco d6 = new Disco(06, "cancion 6", 2022);
        Disco d7 = new Disco(07, "cancion 7", 2022);
        
        discografia.add(d1);
        discografia.add(d2);
        discografia.add(d3);
        discografia.add(d4);        
        discografia.add(d5);
        discografia.add(d6);
        discografia.add(d7);
       
        d1.setCodigo(codigo);
        d1.setNombre(nombre);
        d1.setAnioDeLanza(anioDeLanza);
        
        System.out.println(d1);
    }

}
