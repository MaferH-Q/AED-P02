package Marco;
//Creamos la clase testcaja para probar

public class Testcaja {
    public static void main(String[] args) {
        //Se crea una caja para el string
        caja<String> cajastring = new caja<>();
        System.out.println("-------------------------------------");
        cajastring.guardar("Probando el tema de genericidad");
        System.out.println("Contenido de la cajita: " + cajastring.obtener());
        System.out.println("-------------------------------------");
    //Crea una Caja para Integer
        caja<Integer> cajaInteger = new caja<>();
        cajaInteger.guardar(74153710);
        System.out.println("-------------------------------------");
        System.out.println("Contenido de la cajita: " + cajaInteger.obtener());
        System.out.println("-------------------------------------");

// prueba sin genericidad

    }
}
