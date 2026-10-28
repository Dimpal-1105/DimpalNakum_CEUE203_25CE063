import java.util.Scanner;

class InvalidQuantityException extends Exception
{
    InvalidQuantityException(String message)
    {
        super(message);
    }
}

class OutOfStockException extends Exception
{
    int shortfall;

    OutOfStockException(String message, int shortfall)
    {
        super(message);
        this.shortfall = shortfall;
    }
}

class Warehouse
{
    int stock = 10;

    void issue(int qty) throws InvalidQuantityException, OutOfStockException
    {
        if (qty <= 0)
        {
            throw new InvalidQuantityException("Quantity must be greater than zero!");
        }

        if (qty > stock)
        {
            throw new OutOfStockException(
                "Not enough stock! Shortfall: " + (qty - stock),
                qty - stock
            );
        }

        stock -= qty;

        System.out.println("Issued: " + qty);
        System.out.println("Remaining stock: " + stock);
    }
}

public class StockIssue
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        Warehouse w = new Warehouse();

        System.out.print("Enter number of requests: ");
        int n = sc.nextInt();

        int requests[] = new int[n];
        for (int i = 0; i < requests.length; i++)
        {
            System.out.print("Enter quantity for request " + (i + 1) + ": ");
            requests[i] = sc.nextInt();
            try
            {
                w.issue(requests[i]);
            }
            catch (InvalidQuantityException e)
            {
                System.out.println("Invalid: " + e.getMessage());
            }
            catch (OutOfStockException e)
            {
                System.out.println("Failed: " + e.getMessage());
            }
        }
    }
}