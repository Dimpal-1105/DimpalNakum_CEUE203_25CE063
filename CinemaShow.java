/* import java.util.Scanner; */
public class CinemaShow {
    private String title;
    private int seatsAvailable;
    private final int capacity;
    private static int totalBooked=0;
    CinemaShow(String title,int capacity)
    {
        this.title=title;
        this.capacity=capacity;
        seatsAvailable=capacity;
    }
    CinemaShow(String title)
    {
        this(title,100);
    }
    boolean book(int n)
    {
        if(n<=seatsAvailable)
        {
            seatsAvailable-=n;
            totalBooked+=n;
            return true;
        }
        else
        {
            return false;
        }
    }
    int cancel(int n)
{
    seatsAvailable += n;
    if(seatsAvailable > capacity)
    {
        seatsAvailable = capacity;
    }
    return seatsAvailable;
}
    int getSeatsAvailable()
    {
        return seatsAvailable;
    }
    static int getTotalBooked()
    {
        return totalBooked;
    }
    public static void main(String args[])
    {
         /* Scanner sc = new Scanner(System.in);
         String t=sc.nextLine(); */
        CinemaShow C1=new CinemaShow("throne");
        CinemaShow C2=new CinemaShow("secrecy");
        C1.book(10);
        C1.cancel(5);
        C2.book(30);
        C2.cancel(15);
        System.out.println("C1 Seats Available: " + C1.getSeatsAvailable());
        System.out.println("Total Booked: " + C1.getTotalBooked());
        System.out.println("C2 Seats Available: " + C2.getSeatsAvailable());
        System.out.println("Total Booked: " + C1.getTotalBooked());
    }

}
