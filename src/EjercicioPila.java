public class EjercicioPila {
    public static int[] pila;
    public static int numElem = 0;

    public static void main(String[] args) {
        pila = new int[10];
        int opcion = 0;

        while (opcion != 3) {
            menu();
            opcion = MiEntradaSalida.leerEnteroDeRango("Introduce una opción", 1, 3);

            switch (opcion) {
                case 1:
                    int num = MiEntradaSalida.leerEntero("Introduce un número");
                    apilar(num);
                    break;
                case 2:
                    int numDesapilado = desapilar();
                    System.out.println("Has desapilado el número " + numDesapilado);
                    break;
                case 3:
                    System.out.println("Adiós");
                    break;
                default:
                    System.out.println("Elige una opción válida");
                    break;
            }
        }
    }

    public static void menu() {
        System.out.println("¿Qué deseas hacer?");
        System.out.println("1) Apilar");
        System.out.println("2) Desapilar");
        System.out.println("3) Salir");
    }

    public static void apilar(int num) {
        if (numElem < 10) {
            pila[numElem] = num;
            numElem++;
            mostrarPila();
        } else {
            System.out.println("La pila está llena, no puedo apilar el elemento");
        }
    }

    public static int desapilar() {
        if (numElem > 0) {
            int numDesapilado = pila[numElem - 1];
            numElem--;
            mostrarPila();
            return numDesapilado;
        } else {
            System.out.println("No hay elementos en la pila");
            return -1;
        }
    }

    public static void mostrarPila() {
        System.out.print("Pila -> [");
        for (int i = 0; i < numElem; i++) {
            System.out.print(pila[i]);
            if (i < numElem - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}