// obtener el mayor, el menor y la media de un array de enteros:

import java.util.Scanner;

public class ejer_3_MayorMenorMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca la cantidad de elementos del array: ");
        int n = sc.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Introduzca el número " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }

        int mayor = array[0];
        int menor = array[0];
        int suma = array[0];

        for (int i = 1; i < n; i++) {
            if (array[i] > mayor) {
                mayor = array[i];
            }

            if (array[i] < menor) {
                menor = array[i];
            }

            suma += array[i];
        }

        double media = (double) suma / n;

        System.out.println("El mayor número introducido es: " + mayor);
        System.out.println("El menor número introducido es: " + menor);
        System.out.println("La media de los números introducidos es: " + media);
    }
}