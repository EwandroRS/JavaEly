import java.util.Scanner;

public class Rectangle {
    int height;
    int width;

    Scanner in = new Scanner(System.in);

    // Construtor sem parâmetros
    public Rectangle() {
        this.height = 0;
        this.width = 0;
    }

    // Construtor com um parâmetro (quadrado)
    public Rectangle(int side) {
        this.height = side;
        this.width = side;
    }

    // Construtor com dois parâmetros (retângulo)
    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public void getValors() {
        while (true) {
            System.out.printf("[1] Sem Parametros\n [2] Somente com lado\n [3] Com Dois Parametros\n [4] Sair\n ");
            int menuChoice = in.nextInt();

            if (menuChoice == 1) {
                Rectangle r = new Rectangle();
                
                System.out.println("Altura: " + r.height + " | Largura: " + r.width);
                System.out.println("Área: " + r.calculateArea());
            } 
            else if (menuChoice == 2) {
                
                System.out.println("Informe o valor do lado:");
                int side = in.nextInt();
                
                Rectangle r = new Rectangle(side);
                System.out.println("Altura: " + r.height + " | Largura: " + r.width);
                System.out.println("Área: " + r.calculateArea());
            }

            else if (menuChoice == 3) {
                System.out.println("Informe a altura:");
                int height = in.nextInt();
                System.out.println("Informe a largura:");
                int width = in.nextInt();
                
                Rectangle r = new Rectangle(height, width);
                
                System.out.println("Altura: " + r.height + " | Largura: " + r.width);
                System.out.println("Área: " + r.calculateArea());
            }

            else if (menuChoice == 4) {
                System.out.println("Saindo...");
                break;
            } 
            
            else {
                System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }

    public int calculateArea() {
        return this.height * this.width;
    }

    public void closeScanner() {
        in.close();
    }
}

