package clasegenerica;
public class OperacionesMatInteger implements Operable<Integer> {
    private Integer valor; // Atributo que almacena el número entero con el que se trabajará
    // Constructor que inicializa el objeto con un valor entero
    public OperacionesMatInteger(Integer valor) {
        this.valor = valor;
    }
    // Método para sumar el valor actual con otro número entero
    @Override
    public Integer suma(Integer otro) {
        return valor + otro;
    }
    // Método para restar otro número entero al valor actual
    @Override
    public Integer resta(Integer otro) {
        return valor - otro;
    }
    // Método para multiplicar el valor actual con otro número entero
    @Override
    public Integer producto(Integer otro) {
        return valor * otro;
    }
    // Método para dividir el valor actual entre otro número entero
    @Override
    public Integer division(Integer otro) {
        if (otro == 0) { // Verifica si el divisor es 0 para evitar error de división por cero
            throw new ArithmeticException("División por cero no permitida.");
        }
        return valor / otro;
    }
}
