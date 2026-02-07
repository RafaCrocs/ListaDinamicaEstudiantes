package Lista;

public class ListaSimple {
    
    Nodo cabeza;
    
    public ListaSimple(){
        cabeza = null;
    }
    
    public void insertar(int dato){
        Nodo nuevo = new Nodo(dato);
        
        if(cabeza == null){
            cabeza = nuevo;
        }
        else
        {
            Nodo aux = cabeza;
            while (aux.siguiente != null)
            {
                aux = aux.siguiente;
            }
            aux.siguiente = nuevo;
        }
    }
    
    public void mostrar()
    {
        Nodo aux = cabeza;
        while(aux != null)
        {
            System.out.print(aux.dato + " -> ");
            aux = aux.siguiente;
        }
        System.out.println("null");
    }
    
    
}
