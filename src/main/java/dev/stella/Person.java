package dev.stella;
public class Person {
    private String name;
    private String lastName;
    private int dni;
    private int bornYear;
    private String countryOfBirth;
    private char gender;

    public Person(String name, String lastname, int dni, int bornyear, String countryogbirht, char gender) {
        this.name = name;
        this.lastName = lastname;
        this.dni = dni;
        this.bornYear = bornyear;
        this.countryOfBirth = countryogbirht;
        this.gender = gender;
    }

    public void print() {
        System.out.println("Name: " + name);
        System.out.println("Last Name: " + lastName);
        System.out.println("Dni: " + dni);
        System.out.println("Born Year: " + bornYear);
        System.out.println("Country of Birth: " + countryOfBirth);
        System.out.println("Gender: " + gender);
    }

    public static void main(String[] args) {
        Person person1 = new Person("Juan", "Perez", 12345678, 1990, "Argentina", 'H');
        Person person2 = new Person("Maria", "Lopez", 98765432, 1985, "España", 'M');

        person1.print();
        person2.print();
    }
}
