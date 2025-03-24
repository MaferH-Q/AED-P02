package interfacesclasesgenericas;
public class Prueba {
    public static void main(String[] args) {
        OperacionesMatBInteger op = new OperacionesMatBInteger(10);
        System.out.println("Suma: " + op.suma(5));
        System.out.println("Resta: " + op.resta(3));
        System.out.println("Producto: " + op.producto(4));
        System.out.println("División: " + op.division(2));
        // Prueba de división por cero
        try {
            System.out.println("División: " + op.division(0));
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
