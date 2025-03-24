package interfacesclasesgenericas;
public class OperacionesMatBDouble implements Operable<Double> {
    private Double valor;
    public OperacionesMatBDouble(Double valor) {
        this.valor = valor;
    }
    @Override
    public Double suma(Double otro) {
        return valor + otro;
    }
    @Override
    public Double resta(Double otro) {
        return valor - otro;
    }
    @Override
    public Double producto(Double otro) {
        return valor * otro;
    }
    @Override
    public Double division(Double otro) {
        if (otro == 0.0) {
            throw new ArithmeticException("División por cero no es permitida.");
        }
        return valor / otro;
    }
}
