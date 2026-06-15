import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escribe tu nombre: ");
        String nombre = scanner.next();

        System.out.print("Escribe tu edad: ");
        int edad = scanner.nextInt();

        if (edad >= 12 && edad <= 17) {
            System.out.println("Hola " + nombre + ", estas en la edad recomendada para este curso.");
        } else if (edad < 12) {
            System.out.println("Hola " + nombre + ", eres menor de la edad recomendada, pero puedes intentarlo.");
        } else {
            System.out.println("Hola " + nombre + ", este curso es basico, pero tambien puede servirte para repasar.");
        }

        System.out.print("Elige un numero para ver su tabla de multiplicar: ");
        int numero = scanner.nextInt();

        System.out.println("Tabla de multiplicar del " + numero + ":");

        for (int i = 1; i <= 12; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        System.out.println("Cuenta regresiva para finalizar:");

        int contador = 5;

        while (contador >= 1) {
            System.out.println(contador);
            contador--;
        }

        System.out.println("Fin del programa. Buen trabajo, " + nombre + "!");

        scanner.close();
    }
}