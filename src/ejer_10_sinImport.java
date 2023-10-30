public class ejer_10_sinImport {
    public static void main(String[] args) {
        int[] arrayOriginal = {1, 2, 1, 4, 5, 2};
        int[] nuevoArray = obtenerNoRepetidos(arrayOriginal);


        System.out.println("Array Original: ");
        for (int elemento : arrayOriginal) {
            System.out.print(elemento + " ");
        }
        System.out.println("\nNuevo Array sin elementos repetidos: ");
        for (int elemento : nuevoArray) {
            System.out.print(elemento + " ");
        }
    }

    public static int[] obtenerNoRepetidos(int[] array) {
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

        return resultado;
    }
}