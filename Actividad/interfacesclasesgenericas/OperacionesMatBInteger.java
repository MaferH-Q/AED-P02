package interfacesclasesgenericas;
public class OperacionesMatBInteger implements Operable<Integer> {
    private Integer valor;
    public OperacionesMatBInteger(Integer valor) {
        this.valor = valor;
    }
    @Override
    public Integer suma(Integer otro) {
        return valor + otro;
    }
    @Override
    public Integer resta(Integer otro) {
        return valor - otro;
    }
    @Override
    public Integer producto(Integer otro) {
        return valor * otro;
    }
    @Override
    public Integer division(Integer otro) {
        if (otro == 0) {
            throw new ArithmeticException("División por cero no es permitida.");
        }
        return valor / otro;
    }
}
