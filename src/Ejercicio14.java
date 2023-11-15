public class Ejercicio14 {
    public static int[] cola;
    public static int inicio = 0;
    public static int fin = 0;
    public static int numElem = 0;

    public static int tamCola =10;

    public static void main(String[] args) {
        cola = new int[tamCola];
        int opcion = 0;

        while (opcion != 3) {
            menu();
            opcion = MiEntradaSalida.leerEnteroDeRango("Introduce una opción", 1, 3);

            switch (opcion) {
                case 1:
                    int num = MiEntradaSalida.leerEntero("Introduce un número");
                    encolar(num);
                    break;
                case 2:
                    int numDesencolado = desencolar();
                    if (numDesencolado != -1) {
                        System.out.println("Has desencolado el número " + numDesencolado);
                    }
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
        System.out.println("1) Encolar");
        System.out.println("2) Desencolar");
        System.out.println("3) Salir");
    }

    public static void encolar(int num) {
        if ((fin + 1) % 10 != inicio) {
            cola[fin] = num;
            fin = (fin + 1) % 10;
            mostrarCola();
        } else {
            System.out.println("La cola está llena, no puedo encolar el elemento");
        }
    }

    public static int desencolar() {
        if (inicio != fin) {
            int numDesencolado = cola[inicio];
            inicio = (inicio + 1) % 10;
            mostrarCola();
            return numDesencolado;
        } else {
            System.out.println("No hay elementos en la cola");
            return -1;
        }
    }

    public static void mostrarCola() {
        System.out.print("Cola -> [");
        for (int i = inicio; i != fin; i = (i + 1) % 10) {
            System.out.print(cola[i]);
            if ((i + 1) % 10 != fin) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

}