package Marco;
//Genercidad  -> Permite crear clases y metodos que funcionan con cualquier tipo de dato sin perder seguridad en el codigo 
//Beneficios:
//Reutilizar el codigo
//Evitar conversaciones de tipo casting
//Dectecta errores en compilacion en lugar de ejecucion




//Practica de una clase generica con <T> creamos una clase generica con parametro tipo T
public class caja <T> {
    private T contenido;

//Método para guardar un objeto de tipo T
    public void guardar(T item){
        this.contenido = item;
    }
//Método para obtener el objeto  bueno mejor dicho retornar el objeto almacenado
    public T obtener() {
        return contenido;
    }
}