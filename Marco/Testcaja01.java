package Marco;
public class Testcaja01 {
    public static void main(String[] args) {
        caja01 caja = new caja01();
        caja.guardar("Probando ele ejemplo de sin genericidad");
        String mensaje = (String) caja.obtener(); // Necesita casting
        System.out.println(mensaje);
    }
}
