package Actividad;

//Compara dos arreglos (arrays) y verifica si son iguales en contenido y orden
public class DemoMetodoGenerico {
    
    static <T extends Comparable<T>> boolean igualArrays (T[] x, T[] y){
        //Si las longitudes de los array son diferentes,
        // entonces los array son diferentes
        if (x.length != y.length)
        return false;
        for (int i = 0; i < x.length; i++){
        if(!x[i].equals(y[i]))
        return false; //arrays diferentes
    }
        return true; // Contenido de arrays son equivalentes
        }
        public static void main(String[] args) {
        Integer nums[]={1,2,3,4,5};
        Integer nums2[]={1,2,3,4,5};
        Integer nums3[]={1,2,7,4,5};
        Integer nums4[]={1,2,7,4,5,6};
        System.out.println("Comparando arreglos de entero");
        if (igualArrays(nums,nums))
        System.out.println("nums es igual a nums "); //False
        if (igualArrays(nums,nums2))
        System.out.println("nums es igual a nums2 " );//True
        if (igualArrays(nums,nums3))
        System.out.println("nums es igual a num3 ");//
        if (igualArrays(nums,nums4))
        System.out.println("nums es igual a nums4 " );
       
        System.out.println("*****************************************");
        System.out.println("Resultados completos sin saltarse lineas");

        System.out.println("nums es igual a nums: " + igualArrays(nums, nums));
        System.out.println("nums es igual a nums2: " + igualArrays(nums, nums2));
        System.out.println("nums es igual a nums3: " + igualArrays(nums, nums3));
        System.out.println("nums es igual a nums4: " + igualArrays(nums, nums4));

        // Crea un array de double
        // Nos dice que nuestro metodo igualArrays esperaba que ambos arreglos fueran exactamente del mismo tipo (T)
        //Integer[]≠ Double[] -> No se pueden comparar directamente
        //Double dvals[]={1.1,2.2,3.3,4.4,5.5};
        //if(igualArrays(nums,dvals)) 
        //System.out.println("nums es igual a dvals");
        // La solucion que se me ocurre es  modificar el método para aceptar DOS tipos genéricos: T y U
       // static <T extends Number, U extends Number> boolean igualArrays(T[] x, U[] y) {
            // Si los arreglos tienen diferente longitud, no son iguales
           // if (x.length != y.length)
             //   return false;
             //Comparamos elemento por elemento convirtiéndolos a double
       // for (int i = 0; i < x.length; i++) {
            //if (x[i].doubleValue() != y[i].doubleValue()) 
              //  return false; //Si hay una diferencia, los arreglos son distintos
       // }
        //return true; //Si todos los valores coinciden, los arreglos son equivalentes
    //}
        }

    }
    