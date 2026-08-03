import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class RegexCheck 
{ 
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the password:");
        String input=sc.nextLine();
        Pattern patternup=Pattern.compile(".*[A-Z].*");
        Pattern patternd=Pattern.compile(".*\\d.*");
        Pattern patterns=Pattern.compile(".*[!@#$%^&*()].*");
        Matcher matchup=patternup.matcher(input);
        Matcher matchd=patternd.matcher(input);
        Matcher matchs=patterns.matcher(input);
        int c=0;
        if(input.length()>=8)
        {
            c++;   
        }
        if(matchup.matches())
        {
            c++;
        }
        if(matchd.matches())
        {
            c++;
        }
        if(matchs.matches())
        {
            c++;
        }
        if (c <= 1) {
            System.out.println("Weak");
        } else if (c <= 3) {
            System.out.println("Medium");
        } else {
            System.out.println("Strong");
        }
    }
}
