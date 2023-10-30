import java.util.ArrayList;

public class Ejercicio_10 {
    public static int[] eliminarDuplicados(int[] array) {
        ArrayList<Integer> lista = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            if (!lista.contains(array[i])) {
                lista.add(array[i]);
            }
        }

        int[] nuevoArray = new int[lista.size()];
        for (int i = 0; i < lista.size(); i++) {
            nuevoArray[i] = lista.get(i);
        }

        return nuevoArray;
    }

    public static void main(String[] args) {
        int[] arrayOriginal = {1, 2, 3, 4, 3, 2, 5};
        int[] nuevoArray = eliminarDuplicados(arrayOriginal);

        System.out.println("Array Original: ");
        for (int elemento : arrayOriginal) {
            System.out.print(elemento + " ");
        }

        System.out.println("\nNuevo Array sin duplicados: ");
        for (int elemento : nuevoArray) {
            System.out.print(elemento + " ");
        }
    }
}