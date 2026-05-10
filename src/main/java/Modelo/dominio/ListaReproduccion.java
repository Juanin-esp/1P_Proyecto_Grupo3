package Modelo.dominio;

import javax.swing.DefaultListModel;

public class ListaReproduccion<T> {
    private Nodo<T> actual;
    private int size;
    
    public ListaReproduccion() {
        actual = null;
        size = 0;
    }
    public int getSize() {
        return size;
    }
    
    public Nodo<T> getCabeza() {
        return actual;
    }
    
    public void setActual(Nodo<T> nodo) {
        this.actual = nodo;
    }
    
    public boolean estaVacia() {
        return actual == null;
    }
    
    //Insertar 
    public void insertar(T dato) {
        Nodo<T> nuevo = new Nodo<>(dato);

        if (estaVacia()) {
            actual = nuevo;
        } else {
            Nodo<T> ultimo = actual.getAnt();

            ultimo.setSig(nuevo);
            nuevo.setAnt(ultimo);

            nuevo.setSig(actual);
            actual.setAnt(nuevo);
        }

        size++;
    }
    
    //Control de las canciones
    public T siguiente() {
        if (estaVacia()) return null;

        actual = actual.getSig();
        return actual.getDato();
    }
    
    public T anterior() {
        if (estaVacia()) return null;

        actual = actual.getAnt();
        return actual.getDato();
    }
    
    public T getActual() {
        if (estaVacia()) return null;
        return actual.getDato();
    }
    
    //Buscar
    public Nodo<T> buscar(java.util.function.Predicate<T> criterio) {
        if (estaVacia()) return null;

        Nodo<T> aux = actual;

        do {
            if (criterio.test(aux.getDato())) {
                return aux;
            }
            aux = aux.getSig();
        } while (aux != actual);

        return null;
    }
    
    //Mostrar Recursivo
    public void cargarModeloRecursivo(DefaultListModel<T> modelo) {
        if (!estaVacia()) {
            cargarModeloRecursivo(actual, actual, modelo);
        }
    }

    private void cargarModeloRecursivo(Nodo<T> nodo,Nodo<T> inicio,DefaultListModel<T> modelo) {
        modelo.addElement(nodo.getDato());
        if (nodo.getSig() != inicio) {
            cargarModeloRecursivo(nodo.getSig(),inicio,modelo);
        }
    }
    
    public boolean eliminar(java.util.function.Predicate<T> criterio) {
        if (actual == null) {
            return false;
        }
        Nodo<T> inicio = actual;
        Nodo<T> aux = actual;

        do {

            if (criterio.test(aux.getDato())) {

                // SOLO UN NODO
                if (aux.getSig() == aux) {

                    actual = null;

                    return true;
                }

                aux.getAnt().setSig(aux.getSig());

                aux.getSig().setAnt(aux.getAnt());

                if (aux == actual) {
                    actual = aux.getSig();
                }
                size--;
                return true;
            }

            aux = aux.getSig();

        } while (aux != inicio);

        return false;
    }
}
