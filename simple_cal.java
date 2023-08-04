
import java.util.Scanner;
public class simple_cal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double firstValue, secondValue, result = 0;
        char operator, choice = 'y';
        while(choice == 'y') {
            Label: System.out.print("Enter two numbers: ");
            firstValue = sc.nextDouble();
            secondValue  = sc.nextDouble();
            System.out.print("Enter the operation to be performed ( +, -, *, /, %, ^ ): ");
            operator = sc.next().charAt(0);
            switch(operator) {
                case '+':
                    result = firstValue + secondValue;
                    break;
                case '-':
                    result = firstValue - secondValue;
                    break;
                case '*':
                    result = firstValue * secondValue;
                    break;
                case '/':
                    result = firstValue / secondValue;
                    break;
                case '%':
                    result = firstValue % secondValue;
                    break;
                case '^':
                    result = Math.pow(firstValue, secondValue);
                    break;
                default:
                    System.out.println("\nOOPS! Incorrect choice. ");
                    System.exit(0);
            }
            System.out.println("\n" + firstValue + " " + operator + " " + secondValue + " = " + result);
            System.out.print("\nDo you want to continue?( y / n): ");
            choice = sc.next().charAt(0);
            System.out.println();
        }
    }
}
