import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Ejercicio_manana{

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
        HashSet<Integer> set = new HashSet<>();
        List<Integer> noRepetidos = new ArrayList<>();

        for (int elemento : array) {
            if (!set.contains(elemento)) {
                set.add(elemento);
                noRepetidos.add(elemento);
            }
        }

        int[] nuevoArray = new int[noRepetidos.size()];
        for (int i = 0; i < noRepetidos.size(); i++) {
            nuevoArray[i] = noRepetidos.get(i);
        }

        return nuevoArray;
    }


}