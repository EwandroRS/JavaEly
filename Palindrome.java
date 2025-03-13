import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = scanner.nextLine();
        
        if (word.equals(new StringBuilder(word).reverse().toString())) {
            System.out.println("It's a palindrome");
        } else {
            System.out.println("It's not a palindrome");
        }

        scanner.close();


    }
    
}
