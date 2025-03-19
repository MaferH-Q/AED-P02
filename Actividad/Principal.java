package Actividad;

public class Principal {
    public static void main(String[] args) {
    //Creamos una bolsa para las chocolatimas con capacidad de 3
    Bolsa < Chocolatina > bolsaCho = new Bolsa < Chocolatina > (3);
   // Agregamos las chocolatimas a la bolsa
    Chocolatina c = new Chocolatina("milka");
    Chocolatina c1 = new Chocolatina("milka");
    Chocolatina c2 = new Chocolatina("ferrero");
    bolsaCho.add(c);
    bolsaCho.add(c1);
    bolsaCho.add(c2);
    // recorremos la bolsa y mostramos las chocolatinas 
    System.out.println("------------------------------------");
    System.out.println("Contenido de la bolsa de chocolatinas!!!");
    for (Chocolatina chocolatina: bolsaCho) {
    System.out.println(" * " + chocolatina.getMarca() + " * " );
    }
   // Crear una bolsa para golosinas con capacidad por ejemplo de 2
   Bolsa<Golosina> bolsaGolosina = new Bolsa<>(2);
        
   // agregamos  las golosinas a la bolsa
   bolsaGolosina.add(new Golosina("Caramelo", 5.0));
   bolsaGolosina.add(new Golosina("Chicle", 2.5));

   System.out.println("------------------------------------");
   // recorremos la bolsa y muestra las golosinas
   System.out.println(" Contenido de la bolsa de golosinas :");
   for (Golosina golosina : bolsaGolosina) {
       System.out.println(" * " + golosina.getNombre() + " y  Peso del producto:"+ " (" + golosina.getPeso() + "g)");
   }
    }
}
