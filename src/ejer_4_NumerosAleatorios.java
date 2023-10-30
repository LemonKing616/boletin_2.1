//NumerosAleatorios

import java.util.Random;

public class ejer_4_NumerosAleatorios {
    public static void main(String[] args) {
        int[] numeros = generarArrayNumerosAleatorios(6000);
        double media = calcularMedia(numeros);
        int digitoMasRepetido = obtenerDigitoMasRepetido(numeros);
        int[] digitosSinRepetir = obtenerDigitosSinRepetir(numeros);
        int[] cantidadPorDigito = obtenerCantidadPorDigito(numeros);
        double[] porcentajePorDigito = calcularPorcentajePorDigito(cantidadPorDigito, 6000);
        double sumaPorcentajes = calcularSumaPorcentajes(porcentajePorDigito);
        double mediaPorcentajes = calcularMediaPorcentajes(sumaPorcentajes);

        System.out.println("La media de los números leídos es: " + media);
        System.out.println("El dígito en el que más números terminan es: " + digitoMasRepetido);
        System.out.println("En qué dígitos no ha terminado ningún número:");

        for (int i = 0; i < digitosSinRepetir.length; i++) {
            System.out.println(digitosSinRepetir[i]);
        }

        for (int i = 0; i < cantidadPorDigito.length; i++) {
            System.out.println("El número " + i + " se ha repetido " + cantidadPorDigito[i] + " veces. Esto equivale a un " + porcentajePorDigito[i] + "%");
        }

        System.out.println("La suma de todos los porcentajes es equivalente al 100.00%. El % medio para cada contador es de " + mediaPorcentajes + "%");
    }

    public static int[] generarArrayNumerosAleatorios(int tamaño) {
        int[] array = new int[tamaño];
        Random random = new Random();

        for (int i = 0; i < tamaño; i++) {
            array[i] = random.nextInt(101);
        }

        return array;
    }

    public static double calcularMedia(int[] array) {
        int suma = 0;

        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }

        return (double) suma / array.length;
    }

    public static int obtenerDigitoMasRepetido(int[] array) {
        int[] contadorDigitos = new int[10];

        for (int i = 0; i < array.length; i++) {
            int ultimoDigito = array[i] % 10;
            contadorDigitos[ultimoDigito]++;
        }

        int maxRepetido = contadorDigitos[0];
        int digitoMasRepetido = 0;

        for (int i = 1; i < contadorDigitos.length; i++) {
            if (contadorDigitos[i] > maxRepetido) {
                maxRepetido = contadorDigitos[i];
                digitoMasRepetido = i;
            }
        }

        return digitoMasRepetido;
    }

    public static int[] obtenerDigitosSinRepetir(int[] array) {
        boolean[] digitosRepetidos = new boolean[10];

        for (int i = 0; i < array.length; i++) {
            int ultimoDigito = array[i] % 10;
            digitosRepetidos[ultimoDigito] = true;
        }

        int contador = 0;

        for (int i = 0; i < digitosRepetidos.length; i++) {
            if (!digitosRepetidos[i]) {
                contador++;
            }
        }

        int[] digitosSinRepetir = new int[contador];
        int index = 0;

        for (int i = 0; i < digitosRepetidos.length; i++) {
            if (!digitosRepetidos[i]) {
                digitosSinRepetir[index] = i;
                index++;
            }
        }

        return digitosSinRepetir;
    }

    public static int[] obtenerCantidadPorDigito(int[] array) {
        int[] contadorDigitos = new int[10];

        for (int i = 0; i < array.length; i++) {
            int ultimoDigito = array[i] % 10;
            contadorDigitos[ultimoDigito]++;
        }

        return contadorDigitos;
    }

    public static double[] calcularPorcentajePorDigito(int[] cantidadPorDigito, int total) {
        double[] porcentajePorDigito = new double[10];

        for (int i = 0; i < cantidadPorDigito.length; i++) {
            porcentajePorDigito[i] = (double) cantidadPorDigito[i] / total * 100;
        }

        return porcentajePorDigito;
    }

    public static double calcularSumaPorcentajes(double[] porcentajePorDigito) {
        double suma = 0;

        for (int i = 0; i < porcentajePorDigito.length; i++) {
            suma += porcentajePorDigito[i];
        }

        return suma;
    }

    public static double calcularMediaPorcentajes(double sumaPorcentajes) {
        return sumaPorcentajes / 6;
    }
}