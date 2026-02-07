package Estructuras;

public class ListaEstudiantes {
    
    NodoEstudiante cabeza;
    
    public ListaEstudiantes(){
        cabeza = null;
        
    }
    
    public void insertar(Estudiante estudiante)
    {
        NodoEstudiante nuevo = new NodoEstudiante(estudiante);
        
        if(cabeza == null)
        {
            cabeza = nuevo;
        }
        else
        {
            NodoEstudiante aux = cabeza;
            while(aux.siguiente != null)
            {
                aux = aux.siguiente;
            }
            aux.siguiente = nuevo;
        }
    }
    
    public void mostrar()
    {
        if(cabeza == null)
        {
           System.out.println("Lista Vacia");
           return;
        }
        
        NodoEstudiante aux = cabeza;
        while(aux != null)
        {
            aux.dato.mostrar();
            aux = aux.siguiente;
        }
    }
    
    public void buscar(String cedula)
    {
        NodoEstudiante aux = cabeza;
        while(aux != null)
        {
            if(aux.dato.Cedula.equals(cedula))
            {
                System.out.println("Estudiante encontrado: ");
                aux.dato.mostrar();
                return;
            }
            aux = aux.siguiente;
        }
        
        System.out.println("Estudiante no encontrado");
    }
    
    
    public int contar()
    {
        int contador = 0;
        
        NodoEstudiante aux = cabeza;
        
        while(aux != null)
        {
            contador++;
            aux = aux.siguiente;
        }
        return contador;
    }
    
}
