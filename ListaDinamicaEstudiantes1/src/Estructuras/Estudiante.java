package Estructuras;


public class Estudiante {
    String Cedula;
    String Nombre;
    int Edad;
    
    public Estudiante(String cedula, String nombre, int edad)
    {
        this.Cedula = cedula;
        this.Nombre = nombre;
        this.Edad = edad;
    }
    
    public void mostrar() { 
        System.out.println("Cedula: " + Cedula + " | Nombre: " + Nombre + " | Edad: " + Edad);
    } 
}
