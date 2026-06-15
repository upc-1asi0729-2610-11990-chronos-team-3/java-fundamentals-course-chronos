import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escribe tu nombre: ");    
        String nombre = scanner.next();

        System.out.println("Hola " + nombre);

        scanner.close();
    }
}
