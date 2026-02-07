package Lista;

public class ListaCircular {
    
    NodoCircular ultimo;
    
    public void insertar(int dato)
    {
        NodoCircular nuevo = new NodoCircular(dato);
        
        if(ultimo == null)
        {
            ultimo = nuevo;
            ultimo.siguiente = ultimo;
        }
        else
        {
            nuevo.siguiente = ultimo.siguiente;
            ultimo.siguiente = nuevo;
            ultimo = nuevo;
        }
    }
    
    public void mostrar()
    {
        if(ultimo != null)
        {
            NodoCircular aux = ultimo.siguiente;
            do
            {
                System.out.print(aux.dato + " -> ");
                aux = aux.siguiente;
            }while(aux != ultimo.siguiente);
            System.out.println("(Inicio)");
        }
    }
}
