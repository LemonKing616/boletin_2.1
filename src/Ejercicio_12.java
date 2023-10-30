public class Ejercicio_12 {
    public static void main(String[] args) {
        int[] array = {5, 3, 9, 1, 7};

        System.out.println("Array original: ");
        for (int elemento : array) {
            System.out.print(elemento + " ");
        }

        int[] arrayOrdenado = ordenarArray(array);

        System.out.println("\nArray ordenado de menor a mayor: ");
        for (int elemento : arrayOrdenado) {
            System.out.print(elemento + " ");
        }
    }
    public static int[] ordenarArray(int[] array) {
        int n = array.length;
        int temp;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Intercambiar los elementos
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        return array;
    }


}