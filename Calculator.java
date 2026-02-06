import java.util.*;

public class Calculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        char Calculate = sc.next().charAt(0);

        switch (Calculate) {
            case '+':
                System.out.println("Your Sum Is After Adding " + a + b);
                break;

            case '_':
                System.out.println("Your Sum Is After Substraction " + (a - b));
                break;

            case '*':
                System.out.println("Your Sum Is After Multiplication " + (a * b));
                break;

            case '/':
                System.out.println("Your Sum IS After Division " + (a / b));
                break;

            case '%':
                System.out.println("Your Sum IS After Modulo " + (a % b));
                break;

            default:
                System.out.println("Wroung! Operation Perform  Not in System ! ");
        }
    }
}
