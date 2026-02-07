package Lista;

public class Principal {
    
    public static void main(String[] args)
    {
        System.out.println("==== Lista Simple ====");
        ListaSimple listaSimple = new ListaSimple();
        listaSimple.insertar(10);
        listaSimple.insertar(20);
        listaSimple.insertar(30);
        listaSimple.mostrar();
        
        System.out.println("==== Lista Doblemente Enlasadas ====");
        ListaDoble listadoble = new ListaDoble();
        listadoble.insertar(100);
        listadoble.insertar(200);
        listadoble.insertar(300);
        listadoble.mostrar();
        
        System.out.println("==== Lista Circular Simple ====");
        ListaCircular listaCircular = new ListaCircular();
        listaCircular.insertar(1);
        listaCircular.insertar(2);
        listaCircular.insertar(3);
        listaCircular.mostrar();
        
        
        System.out.println("==== Lista Circular Doble ====");
        ListaCircularDoble listaCircularDoble = new ListaCircularDoble();
        listaCircularDoble.insertar(500);
        listaCircularDoble.insertar(600);
        listaCircularDoble.insertar(700);
        listaCircularDoble.mostrar();
        
    }
    
}
