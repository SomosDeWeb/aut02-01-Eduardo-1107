import javax.print.attribute.standard.RequestingUserName;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static void main() {
        int flag = 0, contEstudiantes = 0, edad = 0;
        double notaMedia = 0, suma = 0, mediaTotal = 0;
        String nombre = "";
        boolean esMatriculado = false, encontrado = false;
        ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();
        do {
            Menu.verMenu();
            flag = Funciones.pedirNumeroInt("Elige una opcion: ");
            switch (flag) {
                case 1:
                    nombre = Funciones.pedirTexto("\nIntroduce nombre: ");
                    do {
                        edad = Funciones.pedirNumeroInt("Introduce edad: ");
                        if (edad <= 0)
                            System.out.println(">> Edad no puede ser igual o inferior a 0. Vuelve a intentarlo");
                    } while (edad <= 0);
                    notaMedia = Funciones.pedirNumeroDouble("Introduce nota media: ");
                    esMatriculado = Funciones.pedirBoolean("¿Está matriculado? (true/false): ");
                    listaEstudiantes.add(new Estudiante(nombre,edad,notaMedia,esMatriculado));
                    System.out.println("> Estudiante añadido correctamente\n");
                    break;
                case 2:
                    System.out.println("\n=== Lista de Estudiantes ===");
                    if (listaEstudiantes.isEmpty())
                        System.out.println(">> No hay nigún alumno en la lista");
                    else
                        for (Estudiante estudiante : listaEstudiantes) {
                            System.out.printf("Nombre: %s (%s años) - Nota Media: %s - Matriculado: %s%n",estudiante.getNombre(),estudiante.getEdad(),estudiante.getNotaMedia(),estudiante.getEsMatriculado());
                        }
                    System.out.printf("%n");
                    break;
                case 3:
                    nombre = Funciones.pedirTexto("\nIntroduce nombre: ");
                    for (Estudiante estudiante : listaEstudiantes) {
                        if (estudiante.getNombre().equalsIgnoreCase(nombre)) {
                            System.out.printf("Estudiante encontrado%n" +
                                    "> Nombre: %s%n" +
                                    "> Edad: %s%n" +
                                    "> Nota Media: %s%n" +
                                    "> Matriculado: %s%n%n", estudiante.getNombre(),estudiante.getEdad(),estudiante.getNotaMedia(), estudiante.getEsMatriculado());
                            encontrado = true;
                        }
                    }
                    if (!encontrado)
                        System.out.println("\n>> Estudiante no encontrado\n");
                    break;
                case 4:
                    if (!listaEstudiantes.isEmpty()) {
                        for (Estudiante estudiante : listaEstudiantes) {
                            suma += estudiante.getNotaMedia();
                        }
                        mediaTotal = suma/listaEstudiantes.size();
                            System.out.printf("%n> La media total de %s estudiante/es es: %s%n%n",listaEstudiantes.size(),mediaTotal);
                    } else
                        System.out.println("\n>> La lista está vacía\n");
                    break;
            }
        } while (flag != 6);
        System.out.println("> Adiós");
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
                if (sc.hasNextDouble()) { // boolean que señala si el sc contiene un double o no
                    num = sc.nextDouble();
                    valido = true;
                } else {
                    System.out.println("Entrada no válida. Intenta de nuevo.");
                    sc.next();
                }
            }
            return num;
        }
        public static boolean pedirBoolean(String msg) {
            Scanner sc = new Scanner(System.in);
            String respuesta = "";
            boolean valido = false, b = false;

            while (!valido) {
                System.out.print(msg);
                    respuesta = sc.nextLine();
                if (respuesta.equalsIgnoreCase("true")) { // no es Case Sensitive
                    valido = true;
                    b = true;
                } else if (respuesta.equalsIgnoreCase("false")) {
                    valido = true;
                } else {
                    System.out.println("Entrada no válida. Intenta de nuevo.");
                    sc.next();
                }
            }
            return b;
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
