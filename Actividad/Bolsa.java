package Actividad;
//Arraylist -> Una estructura de datos dinamicos que permite almacenar elementos sin un tamaño fijo
import java.util.ArrayList;
//Iterator -> Interfaz que nos permite recorrer colección como un ArrayList sin usar indices como EL FOR CLASICO
import java.util.Iterator;
//Definidmos la clase genérica
public class Bolsa <T> implements Iterable<T> {
    private ArrayList<T> lista = new ArrayList<>();
    private int tope;
    //El limite de elementos en la bolsa 
    //Contrustor para inicializar el limite 
    public Bolsa(int tope){
        this.tope= tope;
    }
    //Este es el metodo add() para agregar elementos 
    public void add(T objeto){
        if(lista.size() < tope){
            lista.add(objeto);
        }else {
            throw new RuntimeException("Ya no cabe más objeto en la bolsa");
        }
    }
    //  Implementamos un iterator() para recorrer la bolsa 
    public Iterator<T> iterator(){
        return lista.iterator();
    }
}
