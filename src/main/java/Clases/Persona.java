/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Juan Fernandez
 */
public abstract class Persona {
    private int codigo;
    private String nombre;
    private String apellido;
    private int edad;
    private String Nacionalidad;
    private double salario;

    public Persona() {
    }
    
    public Persona(int codigo, String nombre, String apellido, int edad, String Nacionalidad, double salario) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.Nacionalidad = Nacionalidad;
        this.salario = salario;
    }

    
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNacionalidad() {
        return Nacionalidad;
    }

    public void setNacionalidad(String Nacionalidad) {
        this.Nacionalidad = Nacionalidad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    
    public double calcularSalario(){
        
        return 0.00;
        
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + this.codigo;
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
        final Persona other = (Persona) obj;
        return this.codigo == other.codigo;
    }

   
    
    
    
    @Override
    public String toString() {
        return "Persona{" + "codigo=" + codigo + ", nombre=" + nombre 
                + ", apellido=" + apellido + ", edad=" + edad + ", Nacionalidad="
                + Nacionalidad + ", salario=" + salario + '}';
    }
    
    
    
           
}

