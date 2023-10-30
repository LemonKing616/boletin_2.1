//detectar la cantidad de números negativos en un array de enteros:

public class ejer_2_NumerosNegativos {
    public static void main(String[] args) {
        int[] array = {-1, 2, -3, 4, -5, 6, -7, 8, -9, 10};
        int contador = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                contador++;
            }
        }

        System.out.println("La cantidad de números negativos es: " + contador);
    }
}