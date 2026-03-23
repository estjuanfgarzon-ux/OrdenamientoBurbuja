//Se usa la estructura cola para manejar los usuarios en orden de llegada.
 // paquete

public class ColaUsuarios { // clase cola

    private NodoUsuario frente; // primer nodo
    private NodoUsuario fin; // ultimo nodo

    public ColaUsuarios() { // constructor

        frente = null; // cola vacia
        fin = null; // cola vacia

    }

    public void insertar(Usuario u) { // insertar en cola

        NodoUsuario nuevo = new NodoUsuario(u); // crear nodo

        if (frente == null) { // si vacia

            frente = nuevo; // nuevo es primero
            fin = nuevo; // nuevo es ultimo

        } else {

            fin.siguiente = nuevo; // enlazar al final
            fin = nuevo; // nuevo es ultimo

        }

    }
public NodoUsuario getFrente() {

    return frente;

}
}
