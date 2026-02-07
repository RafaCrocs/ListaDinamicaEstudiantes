/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructuras;

/**
 *
 * @author JOSE
 */
public class main {
    
    public static void main(String[] args)
    {
        ListaEstudiantes lista = new ListaEstudiantes();
        
        lista.insertar(new Estudiante("101", "Ana López", 20)); 
        lista.insertar(new Estudiante("102", "Carlos Mora", 22)); 
        lista.insertar(new Estudiante("103", "María Vargas", 19));
        
        System.out.println("=== LISTA DE ESTUDIANTES ==="); 
        lista.mostrar(); 
        System.out.println("\n=== BUSCAR ESTUDIANTE ==="); 
        lista.buscar("102"); 
        System.out.println("\n=== TOTAL DE ESTUDIANTES ==="); 
        System.out.println("Cantidad: " + lista.contar()); 
    }
    
    
}
