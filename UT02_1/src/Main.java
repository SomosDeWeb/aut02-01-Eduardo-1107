import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static void main() {
        int flag = 0, contEstudiantes = 0, edad = 0;
        double notaMedia = 0;
        String nombre = "";
        boolean esMatriculado = false;


        ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();
        do {
            Menu.verMenu();
            switch (flag) {
                case 1:
                    nombre = Funciones.pedirTexto("Introduce nombre: ");
            }
        } while (flag != 6);
    }
    public static class Menu {
        public static void verMenu() {
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
        public static int pedirNumeroInt(String msg) {
            Scanner sc = new Scanner(System.in);
            int num = 0;
            boolean valido = false;

            while (!valido) {
                System.out.print(msg);
                if (sc.hasNextInt()) { // boolean que señala si el sc contiene un int o no
                    num = sc.nextInt();
                    valido = true;
                } else {
                    System.out.println("Entrada no válida. Intenta de nuevo.");
                    sc.next();
                }
            }
            return num;
        }
        public static double pedirNumeroDouble(String msg) {
            Scanner sc = new Scanner(System.in);
            double num = 0;
            boolean valido = false;

            while (!valido) {
                System.out.print(msg);
                if (sc.hasNextDouble()) { // boolean que señala si el sc contiene un int o no
                    num = sc.nextDouble();
                    valido = true;
                } else {
                    System.out.println("Entrada no válida. Intenta de nuevo.");
                    sc.next();
                }
            }
            return num;
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
}
