package interfacesclasesgenericas;
public interface Operable<N extends Number> {
    N suma(N otro);
    N resta(N otro);
    N producto(N otro);
    N division(N otro);
}
