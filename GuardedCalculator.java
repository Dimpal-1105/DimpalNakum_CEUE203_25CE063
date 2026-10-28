
import java.util.Scanner;

class DivideByZeroException extends Exception
{
    DivideByZeroException(String message)
    {
        super(message);
    }
}

public class GuardedCalculator
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        while (true)
        {
            try
            {
                System.out.print("Enter first number: ");
                int a = sc.nextInt();

                System.out.print("Enter operator: ");
                char op = sc.next().charAt(0);
                System.out.print("Enter second number: ");
                int b = sc.nextInt();

                if (op == '/' && b == 0)
                {
                    throw new DivideByZeroException("Cannot divide by zero!");
                }

                int result = 0;

                switch (op)
                {
                    case '+' ->
                        result = a + b;

                    case '-' ->
                        result = a - b;

                    case '*' ->
                        result = a * b;

                    case '/' ->
                        result = a / b;

                    default ->
                        System.out.println("Invalid operator!");
                }

                System.out.println("Result: " + result);
                break;
            }

            catch (DivideByZeroException e)
            {
                System.out.println(e.getMessage());
            }

            catch (Exception e)
            {
                System.out.println("Invalid number!");
                sc.nextLine();
            }

            finally
            {
                System.out.println("Attempt completed.");
            }
        }

        sc.close();
    }
}