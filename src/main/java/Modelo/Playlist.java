package Modelo;

public class Playlist<T> {
    private Nodo<T> actual;
    private int size;
    
    public Playlist() {
        actual = null;
        size = 0;
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
    
    //Eliminar Actual
    public void eliminarActual() {
        if (estaVacia()) return;

        if (size == 1) {
            actual = null;
        } else {
            Nodo<T> anterior = actual.getAnt();
            Nodo<T> siguiente = actual.getSig();

            anterior.setSig(siguiente);
            siguiente.setAnt(anterior);

            actual = siguiente;
        }

        size--;
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
    
    //Recorrer
    public void mostrar() {
        if (estaVacia()) return;

        Nodo<T> aux = actual;

        do {
            System.out.println(aux.getDato());
            aux = aux.getSig();
        } while (aux != actual);
    }
    //Mostrar Recursivo
    public void mostrarRecursivo() {
        if (!estaVacia()) {
            mostrarRecursivo(actual, actual);
        }
    }

    private void mostrarRecursivo(Nodo<T> nodo, Nodo<T> inicio) {
        System.out.println(nodo.getDato());

        if (nodo.getSig() != inicio) {
            mostrarRecursivo(nodo.getSig(), inicio);
        }
    }
    
}
