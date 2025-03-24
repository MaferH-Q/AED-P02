package clasegenerica;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
        while (continuar) {
            int opcion = obtenerOpcion(scanner); // Obtiene una opción válida del menú
            
            if (opcion == 8) {
                continuar = false;
                break;
            }
            int tipo = obtenerTipoDato(scanner); // Obtiene el tipo de dato (Integer o Double)
            
            System.out.print("Ingrese el primer valor: ");
            if (tipo == 1) { // Si el usuario eligió Integer
                int num1 = scanner.nextInt();
                OperacionesMatInteger operacion = new OperacionesMatInteger(num1);
                if (esOperacionUnaria(opcion)) {
                    realizarOperacionUnaria(opcion, num1);
                } else {
                    System.out.print("Ingrese el segundo valor: ");
                    int num2 = scanner.nextInt();
                    realizarOperacionBinaria(opcion, operacion, num2);
                }
            } else { // Si el usuario eligió Double
                double num1 = scanner.nextDouble();
                OperacionesMatDouble operacion = new OperacionesMatDouble(num1);

                if (esOperacionUnaria(opcion)) {
                    realizarOperacionUnaria(opcion, num1);
                } else {
                    System.out.print("Ingrese el segundo valor: ");
                    double num2 = scanner.nextDouble();
                    realizarOperacionBinaria(opcion, operacion, num2);
                }
            }
        }        
        System.out.println("Programa finalizado.");
        scanner.close();
    }
    // Método para obtener una opción válida del menú
    private static int obtenerOpcion(Scanner scanner) {
        int opcion;
        do {
            System.out.println("\nMenú de Operaciones:");
            System.out.println("1. Suma.");
            System.out.println("2. Resta.");
            System.out.println("3. Producto.");
            System.out.println("4. División.");
            System.out.println("5. Potencia.");
            System.out.println("6. Raíz Cuadrada.");
            System.out.println("7. Raíz Cúbica.");
            System.out.println("8. Salir.");
            System.out.print("Seleccione una opción: ");
            while (!scanner.hasNextInt()) { // Validación de entrada
                System.out.println("Entrada inválida. Debe ingresar un número entre 1 y 8.");
                scanner.next(); // Descartar la entrada incorrecta
            }
            opcion = scanner.nextInt();
        } while (opcion < 1 || opcion > 8); // Asegura que el número esté dentro del rango

        return opcion;
    }
    // Método para obtener el tipo de dato a usar
    private static int obtenerTipoDato(Scanner scanner) {
        int tipo;
        do {
            System.out.print("Ingrese el tipo de número (1 para Integer, 2 para Double): ");
            while (!scanner.hasNextInt()) {
                System.out.println("Entrada inválida. Debe ingresar 1 o 2.");
                scanner.next();
            }
            tipo = scanner.nextInt();
        } while (tipo != 1 && tipo != 2); // Asegura que solo se acepte 1 o 2
        return tipo;
    }
    // Método para determinar si la operación es unaria (solo requiere un número)
    private static boolean esOperacionUnaria(int opcion) {
        return opcion == 5 || opcion == 6 || opcion == 7;
    }
    // Método para realizar operaciones unarias (potencia y raíces)
    private static void realizarOperacionUnaria(int opcion, double num) {
        switch (opcion) {
            case 5 -> System.out.println("Potencia: " + Math.pow(num, 2));
            case 6 -> System.out.println("Raíz Cuadrada: " + Math.sqrt(num));
            case 7 -> System.out.println("Raíz Cúbica: " + Math.cbrt(num));
        }
    }
    // Método para realizar operaciones binarias (suma, resta, producto, división)
    private static <T extends Number> void realizarOperacionBinaria(int opcion, Operable<T> operacion, T num2) {
        switch (opcion) {
            case 1 -> System.out.println("Resultado: " + operacion.suma(num2));
            case 2 -> System.out.println("Resultado: " + operacion.resta(num2));
            case 3 -> System.out.println("Resultado: " + operacion.producto(num2));
            case 4 -> {
                try {
                    System.out.println("Resultado: " + operacion.division(num2));
                } catch (ArithmeticException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }
        }
    }
}
