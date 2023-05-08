/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ec.edu.java.practica2.practica2.main;



import Clases.Cantante;
import Clases.Persona;
import Controlador.IControlador;
import static Controlador.IControlador.MAX_OBJECTS;
import Controlador.PersonaControlador;
import java.util.Scanner;

/**
 *
 * @author Juan Fernandez
 */
public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IControlador controlador = new PersonaControlador();
        
        int opcion = 0;
        do {
            System.out.println("Menú:");
            System.out.println("1. Ingreso de Cantante");
            System.out.println("2. Ingreso de Compositor");
            System.out.println("3. Agregar Clientes");
            System.out.println("4. Imprimir persona");
            System.out.println("5. Búsqueda de cantante por nombre de disco");
            System.out.println("6. Búsqueda de compositor por nombre de canción");
            System.out.println("7. Salir");
            
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    
                    Persona[] personas = new Persona[MAX_OBJECTS];
                    
                    
                    /*System.out.println("Ingrese nombre de Cantante");
                    String nombre = scanner.next();
                    
                    System.out.println("Ingrese codigo de Cantante");
                    int codigo = scanner.nextInt();
                    p1.setCodigo(codigo);
                    System.out.println("Ingrese apellido de Cantante");
                    String apellido = scanner.next();
                    p1.setApellido(apellido);
                    System.out.println("Ingrese edad de Cantante");
                    int edad = scanner.nextInt();
                    p1.setEdad(edad);
                    System.out.println("Ingrese nacionalidad de Cantante");
                    String nacionalidad = scanner.next();
                    p1.setNacionalidad(nacionalidad);
                    System.out.println("Ingrese salario de Cantante");
                    double salario = scanner.nextDouble();
                    p1.setSalario(salario);
                    scanner.nextLine(); /*se debe llamar a nextLine() después de nextInt() 
                    para evitar saltos de línea no deseados
                    
                    System.out.println(p1);*/
                    
                    System.out.println("Cantante agregado exitosamente.");
                    
                    break;
                
                case 2:
                    System.out.println("Ingreso de Compositor");
                    System.out.print("Ingrese el nombre: ");
                    String nombreCompositor = scanner.next();
                    System.out.print("Ingrese el número de composiciones: ");
                    int numComposiciones = scanner.nextInt();
                    System.out.print("Ingrese el número de canciones en el top 100 de billboard: ");
                    int numTop100 = scanner.nextInt();
                    
                 //Compositor compositor = new Compositor(nombreCompositor, numComposiciones, numTop100);
                    //controlador.agregarCompositor(compositor);
                    
                    System.out.println("Compositor agregado exitosamente.");
                    break;
                    
                case 3:
                    System.out.println("Agregar Clientes");
                    // Implementar funcionalidad
                    break;
                    
                case 4:
                    System.out.println("Imprimir persona");
                    System.out.print("Ingrese el nombre de la persona: ");
                    String nombrePersona = scanner.next();
                   /*Persona persona = controlador.buscarPersona(nombrePersona);
                    
                    if (persona != null) {
                        System.out.println(persona);
                    } else {
                        System.out.println("Persona no encontrada.");
                    }*/
                    break;
                    
                case 5:
                    System.out.print("Ingrese el nombre del disco: ");
                    String nombreDisco = scanner.next();
                   /* Cantante cantanteEncontrado = controlador.buscarCantantePorDisco(nombreDisco);
                    if (cantanteEncontrado == null) {
                        System.out.println("No se encontró un cantante con ese nombre de disco.");
                    } else {
                        System.out.println("El cantante encontrado es: " + cantanteEncontrado.getNombre());
                    }*/
                    break;

                case 6:
                    System.out.print("Ingrese el nombre de la canción: ");
                    String nombreCancion = scanner.next();
                    /*Compositor compositorEncontrado = controlador.buscarCompositorPorCancion(nombreCancion);
                    if (compositorEncontrado == null) {
                        System.out.println("No se encontró un compositor con esa canción.");
                    } else {
                        System.out.println("El compositor encontrado es: " + compositorEncontrado.getNombre());
                    }*/
                    break;

                case 7:
                    System.out.println("Saliendo del programa...");
                    
                    break;

                default:
                    System.out.println("Opción inválida. Por favor, ingrese una opción del 1 al 5.");
            }

        } while (opcion != 5);

        scanner.close();
    }
    
 }
