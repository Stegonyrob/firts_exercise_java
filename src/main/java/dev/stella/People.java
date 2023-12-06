package dev.stella;
// Definición de la clase Persona
public class People {

    // Atributos de la clase Persona
    private String name; // Atributo para almacenar el nombre de la persona
    private String lastname; // Atributo para almacenar el apellido de la persona
    private int dni; // Atributo para almacenar el número de documento de la persona
    private int bornyear; // Atributo para almacenar el año de nacimiento de la persona

    // Constructor de la clase Persona
    public People(String name, String lastname, int dni, int bornyear) {
        this.name = name;
        this.lastname = lastname;
        this.dni = dni;
        this.bornyear= bornyear;
    }

    // Método para imprimir los valores de los atributos en consola
    public void print() {
        System.out.println("Name: " + name);
        System.out.println("Lastname: " + lastname);
        System.out.println("Dni: " + dni);
        System.out.println("Born Year: " + bornyear);
    }

    // Método main, punto de entrada del programa
    public static void main(String[] args) {
        // Creación de dos objetos de la clase Persona
        People people1 = new People("Juan", "Perez", 12345678, 1990);
        People people2 = new People("Maria", "Lopez", 98765432, 1985);

        // Llamada al método imprimir() en cada objeto para mostrar los valores de los atributos en consola
        people1.print();
        people2.print();
    }
}