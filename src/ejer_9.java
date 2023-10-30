public class ejer_9 {
    public static void main(String[] args) {
        int[] arrayOriginal = {1, 2, 1, 4, 5, 2};
        int[] nuevoArrayAscendente = obtenerNoRepetidos(arrayOriginal, false);
        int[] nuevoArrayDescendente = obtenerNoRepetidos(arrayOriginal, true);

        System.out.println("Array Original: ");
        for (int elemento : arrayOriginal) {
            System.out.print(elemento + " ");
        }

        System.out.println("\nNuevo Array sin elementos repetidos (Orden ascendente): ");
        for (int elemento : nuevoArrayAscendente) {
            System.out.print(elemento + " ");
        }

        System.out.println("\nNuevo Array sin elementos repetidos (Orden descendente): ");
        for (int elemento : nuevoArrayDescendente) {
            System.out.print(elemento + " ");
        }
    }

    public static int[] obtenerNoRepetidos(int[] array, boolean reverse) {
        int[] nuevoArray = new int[array.length];
        int nuevoIndice = 0;
        boolean repetido;

        for (int i = 0; i < array.length; i++) {
            repetido = false;

            for (int j = 0; j < nuevoIndice; j++) {
                if (array[i] == nuevoArray[j]) {
                    repetido = true;
                    break;
                }
            }

            if (!repetido) {
                nuevoArray[nuevoIndice] = array[i];
                nuevoIndice++;
            }
        }

        int[] resultado = new int[nuevoIndice];
        System.arraycopy(nuevoArray, 0, resultado, 0, nuevoIndice);

        if (reverse) {
            int temp;
            for (int i = 0; i < resultado.length / 2; i++) {
                temp = resultado[i];
                resultado[i] = resultado[resultado.length - 1 - i];
                resultado[resultado.length - 1 - i] = temp;
            }
        }

        return resultado;
    }
}