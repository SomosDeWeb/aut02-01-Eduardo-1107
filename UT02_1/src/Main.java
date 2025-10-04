import java.util.Scanner;

public class Main {
    static void main() {

    }
    public static class Menu {
        public static void menu() {
            System.out.println("""
                    === Gestor de Estudiantes ===
                        1. Añadir Estudiantes
                        2. Listar Estudiantes
                        3. Buscar por nombre
                        4. Calcular nota media general
                        5. Mostar mejor estudiante
                        6. Salir
                    """);
        }
    }
    public static class Funciones {
        public static int pedirNumero(String msg) {
            Scanner sc = new Scanner(System.in);
            int num = 0;
            boolean valido = false;

            while (!valido) {
                System.out.print(msg);
                if (sc.hasNextInt()) { // boolean que señala si el sc contiene un Int o no
                    num = sc.nextInt();
                    valido = true;
                } else {
                    System.out.println("Entrada no válida. Intenta de nuevo.");
                    sc.next();
                }
            }
            return num;
        }
    }
    public static String pedirTexto(String msg) {
        Scanner sc = new Scanner(System.in);
        String txt = "";
        do {
            System.out.print(msg);
            txt = sc.nextLine();
        } while (txt.isEmpty());
        return txt;
    }
}
