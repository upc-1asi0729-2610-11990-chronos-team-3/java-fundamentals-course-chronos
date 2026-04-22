import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 🎯 Entrada de datos
        System.out.print("Ingresa el nombre del estudiante: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingresa la edad del estudiante: ");
        int edad = scanner.nextInt();

        // 🧱 Crear objeto
        Estudiante estudiante = new Estudiante(nombre, edad);

        System.out.println("\n📋 Información del estudiante:");
        estudiante.mostrarInformacion();

        // ✏️ Modificar datos usando setters
        System.out.println("\n--- Actualizar edad ---");
        System.out.print("Nueva edad: ");
        int nuevaEdad = scanner.nextInt();

        estudiante.setEdad(nuevaEdad);

        // 📋 Mostrar datos actualizados
        System.out.println("\n📋 Información actualizada:");
        estudiante.mostrarInformacion();

        scanner.close();
    }
}