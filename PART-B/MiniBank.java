    import java.util.Scanner;

public class MiniBank 
{
    record BankInfo(String name, String branch){}
    enum MenuOption
     {
        OPEN_ACCOUNT,
        DEPOSIT,
        WITHDRAW,
        TRANSFER,
        EXIT
    }

    public static void main(String[] args)
     {

        Scanner sc = new Scanner(System.in);

        BankInfo bank = new BankInfo("MiniBank", "CHARUSAT Branch");

        System.out.println("================================");
        System.out.println(bank);
        System.out.println("================================");

        int choice;

        do {

            System.out.println("\n----- MENU -----");
            System.out.println("1. Open Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Transfer");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            String message = switch (choice)
             {
                case 1 -> MenuOption.OPEN_ACCOUNT + " - To be implemented in a later lab.";
                case 2 -> MenuOption.DEPOSIT + " - To be implemented in a later lab.";
                case 3 -> MenuOption.WITHDRAW + " - To be implemented in a later lab.";
                case 4 -> MenuOption.TRANSFER + " - To be implemented in a later lab.";
                case 5 -> MenuOption.EXIT + " - Exiting MiniBank.";
                default -> "Invalid choice. Please try again.";
            };

            System.out.println(message);

        } while (choice != 5);

        System.out.println("Thank you for using MiniBank!");

        sc.close();
    }
}
