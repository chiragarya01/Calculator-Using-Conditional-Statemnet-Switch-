import java.util.*;

public class Calculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        
        System.out.print("Enter operator (+, -, *, /, %): ");
        char Calculate = sc.next().charAt(0);
        
        switch (Calculate) {
            case '+':
                System.out.println("Result after Addition: " + (a + b));
                break;
                
            case '-':  // ✅ Fixed: '_' se '-' kar diya
                System.out.println("Result after Subtraction: " + (a - b));
                break;
                
            case '*':
                System.out.println("Result after Multiplication: " + (a * b));
                break;
                
            case '/':
                if (b != 0) {  // ✅ Division by zero check added
                    System.out.println("Result after Division: " + (a / b));
                } else {
                    System.out.println("Error! Division by zero is not allowed.");
                }
                break;
                
            case '%':
                if (b != 0) {  // ✅ Modulo by zero check added
                    System.out.println("Result after Modulo: " + (a % b));
                } else {
                    System.out.println("Error! Modulo by zero is not allowed.");
                }
                break;
                
            default:
                System.out.println("Wrong! Operation not available in system.");
        }
        
        sc.close();  // ✅ Scanner close kar diya (good practice)
    }
}
