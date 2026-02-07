
package Lista;

public class ListaDoble {
    
    NodoDoble cabeza;
    
    public void insertar(int dato)
    {
        NodoDoble nuevo = new NodoDoble(dato);
        
        if(cabeza == null)
        {
            cabeza = nuevo;
        }
        else
        {
            NodoDoble aux = cabeza;
            while(aux.siguiente != null)
            {
                aux = aux.siguiente;
            }
            aux.siguiente = nuevo;
            aux.anterior = aux;
        }
    }
    
    public void mostrar()
    {
        NodoDoble aux = cabeza;
        while(aux != null)
        {
            System.out.print(aux.dato + " <-> ");
            aux = aux.siguiente;
        }
        System.out.println("null");
        
    }
    
}
