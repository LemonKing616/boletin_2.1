              public class EjercicioCola {
    public static int[] cola;
    public static int inicio = 0;
    public static int fin = 0;

    public static void main(String[] args) {
        cola = new int[10];
        encolar(3);
        mostrarCola();

        encolar(12);
        mostrarCola();

        desencolar();
        mostrarCola();

        desencolar();
        mostrarCola();

        desencolar();
        mostrarCola();

        encolar(23);
        mostrarCola();
    }

    public static void encolar(int num) {
        if (fin < 10) {
            cola[fin] = num;
            fin++;
        } else {
            System.out.println("La cola está llena, no puedo encolar el elemento");
        }
    }

    public static void desencolar() {
        if (inicio < fin) {
            inicio++;
        } else {
            System.out.println("No hay elementos en la cola");
        }
    }

    public static void mostrarCola() {
        System.out.print("Cola -> [");
        for (int i = inicio; i < fin; i++) {
            System.out.print(cola[i]);
            if (i < fin - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}