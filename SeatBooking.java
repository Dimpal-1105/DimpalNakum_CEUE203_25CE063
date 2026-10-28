class Booking
{
    int seatsLeft = 5;

    synchronized void book()
    {
        if (seatsLeft > 0)
        {
            System.out.println("Seat booked");
            seatsLeft--;
        }
    }
}

class MyThread extends Thread
{
    Booking b;

    MyThread(Booking b)
    {
        this.b = b;
    }

    public void run()
    {
        b.book();
    }
}

public class SeatBooking
{
    public static void main(String args[]) throws Exception
    {
        Booking b = new Booking();

        MyThread t[] = new MyThread[10];

        for (int i = 0; i < 10; i++)
        {
            t[i] = new MyThread(b);
            t[i].start();
        }

        for (int i = 0; i < 10; i++)
        {
            t[i].join();
        }

        System.out.println("Seats left: " + b.seatsLeft);
    }
}