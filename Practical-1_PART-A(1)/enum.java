 import java.util.Scanner;
 enum day
{
    monday;
    tuesday;
    wednesday;
};
static class trail_switch;
 static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
  System.out.println("enter input");
  String input=sc.nextInt().touppercase(input);
  day day=valueof(input);
  String result=switch(day){
    case MONDAY->"today is monday";
    case TUESDAY->"today is wednesday";
    case WEDNESDAY->"today is tuesday";
    default:
  }

}
