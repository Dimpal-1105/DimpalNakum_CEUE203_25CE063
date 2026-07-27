import java.util.Random;
import java.util.Scanner;
enum Move
{
    ROCK, PAPER, SCISSORS, LIZARD, SPOCK
};
public class SPS
{
public static int Winner(Move a,Move b)
{
    if(a==b)
    return 0;
    else 
    {switch (a) 
         {
            case ROCK :
                if(b == Move.SCISSORS || b == Move.LIZARD)
                    return 1;
                else
                    return -1;

            case PAPER :
                if(b == Move.ROCK || b == Move.SPOCK)
                    return 1;
                else
                    return -1;

            case SCISSORS :
                if(b == Move.PAPER || b == Move.LIZARD)
                    return 1;
                else
                    return -1;
            case LIZARD :
                if(b == Move.SPOCK || b == Move.PAPER)
                    return 1;
                else
                    return -1;

            case SPOCK :
                if(b == Move.SCISSORS || b == Move.ROCK)
                    return 1;
                else
                    return -1;
        };
    }
    return 0;
}
public static void main(String[] args)
 {

        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int playerScore = 0;
        int computerScore = 0;

        for(int i=1; i<=5; i++)
        {
            System.out.println("\nRound " + i);
            System.out.println("Enter your choice from(ROCK, PAPER, SCISSORS, LIZARD, SPOCK):");

            String input = sc.next().toUpperCase();
            Move player = Move.valueOf(input);

            Move computer = Move.values()[r.nextInt(5)];

            System.out.println("You = " + player);
            System.out.println("Computer = " + computer);

            int result = Winner(player, computer);

            switch(result)
            {
                case 1:
                    System.out.println("You win this round");
                    playerScore++;
                    break;

                case -1:
                    System.out.println("Computer wins this round");
                    computerScore++;
                    break;

                case 0:
                    System.out.println("Tie");
                    break;
            }
        }

        System.out.println("\nFinal Score");
        System.out.println("You = " + playerScore);
        System.out.println("Computer = " + computerScore);

        if(playerScore > computerScore)
            System.out.println("You win " + playerScore + "-" + computerScore);
        else if(computerScore > playerScore)
            System.out.println("Computer wins " + computerScore + "-" + playerScore);
        else
            System.out.println("Match Tied " + playerScore + "-" + computerScore);

        sc.close();
    }
}

