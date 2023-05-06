/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ec.edu.java.practica2.practica2.main;

import java.util.Scanner;

/**
 *
 * @author Juan Fernandez
 */
public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        
        do {
            System.out.println("---- MENÚ PRINCIPAL ----");
            System.out.println("1. Ingreso de Cantante");
            System.out.println("2. Ingreso de Compositor");
            System.out.println("3. Agregar Clientes");
            System.out.println("4. Imprimir persona");
            System.out.println("5. Búsqueda de cantante por nombre de disco");
            System.out.println("6. Búsqueda de compositor por nombre de canción");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");
            
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    // Lógica para ingresar un cantante
                    break;
                case 2:
                    // Lógica para ingresar un compositor
                    break;
                case 3:
                    // Lógica para agregar clientes
                    break;
                case 4:
                    // Lógica para imprimir persona
                    break;
                case 5:
                    // Lógica para buscar cantante por nombre de disco
                    break;
                case 6:
                    // Lógica para buscar compositor por nombre de canción
                    break;
                case 7:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
                    break;
            }
        } while (opcion != 7);
        
        scanner.close();
    }
    
 }
