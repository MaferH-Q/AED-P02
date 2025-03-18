package Marco;
//Practica sin genercidad usando OBJECT

public class caja01 {
    private Object contenido;
        public void guardar(Object item){
            this.contenido = item;
        }
        public Object obtener(){
            return contenido;
        }
}