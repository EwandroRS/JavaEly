


public class CalculatorObjects {
    public static void main(String[] args) {
        
        Calculator calc = new Calculator(10, 5);
        System.out.println("Sum: " + calc.sumNum());
        System.out.println("Sub: " + calc.subNum());
        System.out.println("Mult: " + calc.multNum());
        System.out.println("Div: " + calc.divNum());
    }    
}
