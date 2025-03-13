
import java.util.Scanner;

public class Person {
    private String name;
    private double weight;
    private double height;

    public Person(String name, double weight, double height) {
        this.name = name;
        setWeight(weight);
        setHeight(height);
    }

    public String getName() {
        return name;
    }

    public void setName() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("New name: ");
            this.name = scanner.nextLine();
        }
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight >= 0.1 && weight <= 300) {
            this.weight = weight;
            System.out.println("Weight changed to: " + weight);
        } else {
            System.out.println("Invalid weight");
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height >= 0.3 && height <= 3) {
            this.height = height;
            System.out.println("Height changed to: " + height);
        } else {
            System.out.println("Invalid height");
        }
    }

    public double calculateIMC() {
        return weight / (height * height);
    }

    public void showIMC() {
        System.out.printf("IMC: %.2f%n", calculateIMC());
    }
}
