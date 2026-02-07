package Lista;

public class ListaCircularDoble {
    
    NodoCircularDoble cabeza;
    
    public void insertar(int dato)
    {
        NodoCircularDoble nuevo = new NodoCircularDoble(dato);
        
        if(cabeza == null)
        {
            cabeza = nuevo;
            cabeza.siguiente = cabeza;
            cabeza.anterior = cabeza;
        }
        else
        {
            NodoCircularDoble ultimo = cabeza.anterior;
            ultimo.siguiente = nuevo;
            nuevo.anterior = ultimo;
            nuevo.siguiente = cabeza;
            cabeza.anterior = nuevo;
        }
    }
    
    public void mostrar()
    {
        if(cabeza != null)
        {
            NodoCircularDoble aux = cabeza;
            do{
                System.out.print(aux.dato + " <-> ");
                aux = aux.siguiente;
            }while(aux != cabeza);
            System.out.println("(Inicio)");
        }
    }
}
