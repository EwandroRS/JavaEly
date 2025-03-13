
import java.util.Scanner;

public class PersonObjects {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando um objeto Person com valores iniciais
        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter weight (kg): ");
        double weight = scanner.nextDouble();

        System.out.print("Enter height (m): ");
        double height = scanner.nextDouble();

        Person person = new Person(name, weight, height);

        // Exibir nome inicial
        person.getName();

        // Alterar nome
        person.setName();

        // Exibir nome alterado
        person.getName();

        // Atualizar peso e altura
        System.out.print("New weight: ");
        double newWeight = scanner.nextDouble();
        person.setWeight(newWeight);

        System.out.print("New height: ");
        double newHeight = scanner.nextDouble();
        person.setHeight(newHeight);

        person.showIMC();

        scanner.close();
    }
}
