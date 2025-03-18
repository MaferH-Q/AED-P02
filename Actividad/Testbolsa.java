package Actividad;

public class Testbolsa {
        public static void main(String[] args) {
            // Creamos una bolsa para Strings con capacidad 5
            Bolsa<String> bolsa = new Bolsa<>(5);
            
            // Agregamos elementos a la bolsa
            bolsa.add("Prueba 01");
            bolsa.add("Prueba 02");
            bolsa.add("Prueba 03");
            bolsa.add("Prueba 04");
            bolsa.add("Prueba 05");

    
            // Mostramos el contenido de la bolsa
            System.out.println("Prueba de Bolsa con Strings:");
            for (String item : bolsa) {
                System.out.println(" * " + item);
            }
       }
}
    