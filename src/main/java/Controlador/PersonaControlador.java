/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Clases.Cancion;
import Clases.Cantante;
import Clases.Compositor;
import Clases.Disco;
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

    public String imprimir() {
        String retorno = "";
        for (Persona persona : this.persona) {
            if (persona instanceof Compositor) {  //If con la instruccion instanceOf para comprobar si es de la clase hija Compositor
                Compositor compositor = (Compositor) persona;// Es un objeto de la clase Compositor
                // Concatenamos la salida con el toString
                retorno += compositor.toString() + " \nSalario Final: " + compositor.calcularSalario() + "\n";
                //else if con la instruccion instanceOf para comprobar si es de la clase hija Cantante
            } else if (persona instanceof Cantante) {
                // Es un objeto de la clase Cantante
                Cantante cantante = (Cantante) persona;
                // Concatenamos la salida con el toString
                retorno += cantante.toString() + " \nSalario Final: " + cantante.calcularSalario() + "\n";;
            }
        }
        //Retornamos la variable salida para mostrar en la consola
        return retorno;
    }

    public String buscarPorNombre(String valor) {
        String retorno = "";
        //Recorremos la lista persona
        for (Persona persona : persona) {
            //Si la persona es de clase Cantante entonces
            if (persona instanceof Cantante) {
                //Obtenemos el obj persona y casteamos a clase Cantante
                Cantante cantante = (Cantante) persona;
                //De este cantante recorremos sus discos para encontrar el nombre del disco que buscamos
                for (Disco disco : cantante.getDiscografia()) {
                    //Si el nombre del disco que recorremos es igual al nombre del parametro de entrada entocnes
                    if (disco.getNombre().equalsIgnoreCase(valor)) {
                        //Concatenamos al string resultante el nombre y apellido del cantante 
                        retorno += cantante.getNombre() + " " + cantante.getApellido() + "\n";
                        break;
                    }
                }
            }
        }
        //Retornamos el String de las personas que tienen un disco con el nombre como parametro
        return retorno;

    }

    public String buscarPorTitulo(String valor) {
        String retorno = "";
        //Recorremos la lista persona
        for (Persona persona : persona) {
            //Si la persona es de clase Compositor entonces
            if (persona instanceof Compositor) {
                //Obtenemos el obj persona y casteamos a clase Compositor
                Compositor compositor = (Compositor) persona;
                //De este compositor recorremos sus canciones para encontrar el nombre de la cancion que buscamos
                for (Cancion cancion : compositor.getCancionesTop100Billboard()) {
                    //Si el nombre de la cancion que recorremos es igual al nombre del parametro de entrada entocnes
                    if (cancion.getTitulo().equalsIgnoreCase(valor)) {
                        //Concatenamos al string resultante el nombre y apellido del compositor
                        retorno += compositor.getNombre() + " " + compositor.getApellido() + "\n";
                        break;
                    }
                }
            }
        }
        //Retornamos el String de las personas que tienen una cancion con el nombre como parametro
        return retorno;

    }

    @Override
    public void list() {
        for (Persona persona1 : persona) {
            System.out.println(persona1.toString());
        }
    }

    @Override
    public void create(Object obj) {
        if (obj instanceof Persona) {
            persona.add((Persona) obj);
        }
    }

    @Override
    public Object read(Object obj) {
        if (obj instanceof Integer) {
            int codigo = (int) obj;
            for (Persona persona : persona) {
                if (persona.getCodigo() == codigo) {
                    return persona;
                }
            }
        }

        return null;
    }

    @Override
    public void update(Object obj) {
        if (obj instanceof Persona) {

            int codigo = ((Persona) obj).getCodigo();
            for (int i = 0; i < persona.size(); i++) {
                Persona pers = persona.get(i);
                if (pers.getCodigo() == codigo) {
                    persona.set(i, (Persona) obj);
                    break;
                }
            }

        }
    }

    @Override
    public void delete(Object obj) {
        if (obj instanceof Persona) {

            for (int i = 0; i < persona.size(); i++) {
                Persona pers = persona.get(i);
                if (pers.equals((Persona) obj)) {
                    persona.remove(i);
                    break;
                }
            }

        }
    }
    public Compositor readCompositor(Object obj) {
        // If para comprobar si el obj que pasa es un int que es el tipo de variable Codigo 
        if (obj instanceof Integer) {
            int codigo = (int) obj;
            // Recorremos la lista de personas
            for (Persona persona : persona) {
                // Si el codigo entrante es igual al codigo de la lista persona Y la persona es de clase Compositor entonces
                if (persona.getCodigo() == codigo && persona instanceof Compositor) {
                    //Devolvemos el objeto que se busca
                    return (Compositor) persona;
                }
            }
        }

        return null;
    }
    public String buscarCompositorPorNombreDeCancion(String nombreCancion) {
        String salida="";
        //Recorremos la lista persona
        for (Persona persona : persona) {
            //Si la persona es de clase Compositor entonces
            if (persona instanceof Compositor) {
               //Obtenemos el obj persona y casteamos a clase Compositor
                Compositor compositor = (Compositor) persona;
                 //De este compositor recorremos sus canciones para encontrar el nombre de la cancion que buscamos
                for (Cancion cancion : compositor.getCancionesTop100Billboard()) {
                    //Si el nombre de la cancion que recorremos es igual al nombre del parametro de entrada entocnes
                    if (cancion.getTitulo().equalsIgnoreCase(nombreCancion)) {
                        //Concatenamos al string resultante el nombre y apellido del compositor
                        salida += compositor.getNombre() + " " + compositor.getApellido()+"\n";
                        break;
                    }
                }
            }
        }
        //Retornamos el String de las personas que tienen una cancion con el nombre como parametro
        return salida;
    }
}
