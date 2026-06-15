class Estudiante {
    String nombre;
    int edad;

    void presentarse() {
        System.out.println("Hola, soy " + nombre + " y tengo " + edad + " años.");
    }

    void saludar(String persona) {
        System.out.println(nombre + " saluda a " + persona + ".");
    }

    int obtenerEdad() {
        return edad;
    }

    void estudiar(String curso) {
        System.out.println(nombre + " está estudiando " + curso + ".");
    }
}

public class Main {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante();

        estudiante.nombre = "Ana";
        estudiante.edad = 15;

        estudiante.presentarse();
        estudiante.saludar("Carlos");

        int edadActual = estudiante.obtenerEdad();
        System.out.println("Edad obtenida: " + edadActual);

        estudiante.estudiar("Programación");
    }
}
