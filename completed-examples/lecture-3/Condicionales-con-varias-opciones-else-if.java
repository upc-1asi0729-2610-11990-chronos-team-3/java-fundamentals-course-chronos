import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escribe tu edad: ");
        int edad = scanner.nextInt();

        if (edad >= 12 && edad <= 17) {
            System.out.println("Estas en la edad recomendada para este curso.");
        } else if (edad == 10) {
            System.out.println("Aun eres menor de la edad recomendada, pero puedes intentarlo.");
        } else {
            System.out.println("Este curso es basico, pero tambien te puede servir para repasar.");
        }

        scanner.close();
    }
}
