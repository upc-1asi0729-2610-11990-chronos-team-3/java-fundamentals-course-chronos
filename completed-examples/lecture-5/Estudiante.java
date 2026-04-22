public class Estudiante {

    // 🔒 Atributos privados (encapsulación)
    private String nombre;
    private int edad;

    // 🏗 Constructor
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // 📥 Getter para nombre
    public String getNombre() {
        return nombre;
    }

    // 📤 Setter para nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // 📥 Getter para edad
    public int getEdad() {
        return edad;
    }

    // 📤 Setter para edad
    public void setEdad(int edad) {
        if (edad > 0) { // Validación simple
            this.edad = edad;
        } else {
            System.out.println("Edad inválida");
        }
    }

    // 🧾 Método para mostrar información
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}