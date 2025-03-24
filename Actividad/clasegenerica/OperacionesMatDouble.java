package clasegenerica;
public class OperacionesMatDouble implements Operable<Double> {
    private Double valor; // Atributo que almacena el valor sobre el cual se operará
    //Constructor de la clase.//
    public OperacionesMatDouble(Double valor) {
        this.valor = valor;
    }
    //Suma el valor actual con otro número.//
    @Override
    public Double suma(Double otro) {
        return valor + otro;
    }
    //Resta el valor actual con otro número.//
    @Override
    public Double resta(Double otro) {
        return valor - otro;
    }
    //Multiplica el valor actual con otro número.//
    @Override
    public Double producto(Double otro) {
        return valor * otro;
    }
    //Divide el valor actual por otro número//
    @Override
    public Double division(Double otro) {
        if (otro == 0) {
            throw new ArithmeticException("División por cero no permitida.");
        }
        return valor / otro;
    }
}


