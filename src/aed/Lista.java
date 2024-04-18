package aed;

public class Lista<T> implements ILista<T> {

    private Nodo<T> primero;

    public Lista() {
        primero = null;
    }

    @Override
    public void insertar(T dato, Comparable clave) {
        if(primero == null) { //Si la lista no tiene elementos
            primero = new Nodo<T>(clave,dato);
        } else {
            Nodo<T> actual = primero;
            while(actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual = new Nodo<T>(clave, dato); // Cuándo se encuentra un nodo en la lista que sea null
                           // indica que estamos en el último nodo de la lista
                           // entonces ese nodo pasa a apuntar al nuevo nodo, y ese nuevo nodo
                           // pasa a apuntar a null;
        }
    }

    @Override
    public T buscar(Comparable clave) {
       if(primero == null) { //No tiene elementos
           return null;
       } else {
           Nodo<T> actual = primero;
           while(actual != null) {
               if(actual.getEtiqueta().compareTo(clave) == 0) {
                   return actual.getDato();
               }
               actual = actual.getSiguiente();
           }
           return null;
       }
    }

    @Override
    public boolean eliminar(Comparable clave) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'eliminar'");
    }

    @Override
    public String imprimir() {
        return null;
    }


    @Override
    public String imprimir(String separador) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'imprimir'");
    }

    @Override
    public int cantElementos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cantElementos'");
    }

    @Override
    public boolean esVacia() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'esVacia'");
    }

    @Override
    public void setPrimero(Nodo<T> unNodo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setPrimero'");
    }


    // implementar los metodos indicados en la interfaz
}
