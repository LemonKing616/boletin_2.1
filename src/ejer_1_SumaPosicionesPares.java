// sumar las posiciones pares de un array de enteros:

public class ejer_1_SumaPosicionesPares {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int suma = 0;

        for (int i = 0; i < array.length; i += 2) {
            suma += array[i];
        }

        System.out.println("La suma de las posiciones pares es: " + suma);
    }
}