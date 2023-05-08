/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.Objects;

/**
 *
 * @author Juan Fernandez
 */
public class Cancion {
    private int codigo;
    private String titulo;
    private String letra;
    private double tiempoEnMinu;

    public Cancion() {
    }

    public Cancion(int codigo, String titulo, String letra, double tiempoEnMinu) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.letra = letra;
        this.tiempoEnMinu = tiempoEnMinu;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public double getTiempoEnMinu() {
        return tiempoEnMinu;
    }

    public void setTiempoEnMinu(double tiempoEnMinu) {
        this.tiempoEnMinu = tiempoEnMinu;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + this.codigo;
        hash = 83 * hash + Objects.hashCode(this.titulo);
        hash = 83 * hash + Objects.hashCode(this.letra);
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.tiempoEnMinu) ^ (Double.doubleToLongBits(this.tiempoEnMinu) >>> 32));
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
        final Cancion other = (Cancion) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        if (Double.doubleToLongBits(this.tiempoEnMinu) != Double.doubleToLongBits(other.tiempoEnMinu)) {
            return false;
        }
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        return Objects.equals(this.letra, other.letra);
    }

    @Override
    public String toString() {
        return "Cancion{" + "codigo=" + codigo + ", titulo=" + titulo +
                ", letra=" + letra + ", tiempoEnMinu=" + tiempoEnMinu + '}';
    }
    
    
  
    
    
    
} 

