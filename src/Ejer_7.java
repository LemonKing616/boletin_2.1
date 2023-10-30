public class Ejer_7 {
    public static boolean contieneElemento(int[] array, int elemento) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elemento) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int elemento = 3;
        boolean resultado = contieneElemento(array, elemento);
        System.out.println("¿El array contiene el elemento? " + resultado);
    }
}