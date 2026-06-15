import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escribe tu edad: ");
        int edad = scanner.nextInt();

        if (edad >= 12 && edad <= 17) {
            System.out.println("Estas en la edad recomendada para este curso.");
        } else {
            System.out.println("Tambien puedes aprender, pero este curso esta pensado para jovenes de 12 a 17 años.");
        }

        scanner.close();
    }
}
