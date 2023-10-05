import java.util.Scanner;

public class Main {
    /*
     * Create a Java program that declares variables for a person's name,
     * age, and email address. Print these values to the console.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String personName, age, email;

        System.out.print("Insira seu nome:");
        personName = scanner.nextLine();
        System.out.print("Insira a sua idade:");
        age = scanner.nextLine();

        System.out.print("Insira o seu Email:");
        email = scanner.nextLine();

        System.out.println("Nome: " + personName + "  Idade: " + age + "  2Email: " + email);
        scanner.close();
    }

}