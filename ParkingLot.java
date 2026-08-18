
public class ParkingLot {
    private int twoWheelers;
    private int fourWheelers;
    private final int twoCap=10;
    private final int fourCap=10;
    private static long revenue=0;
    void park(String type)
    {
        if(type=="two")
        {
            if(twoWheelers < twoCap)
            {
                twoWheelers++;
                revenue+=20;
            }
            else
            {
            System.out.println("Full");
             }
        }
        else if(type=="four")
        {
            if(fourWheelers < fourCap)
            {
                fourWheelers++;
                revenue+=40;
            }
             else
             {
            System.out.println("Full");
             }
        }
    }
    void leave(String type)
    {
        if(type=="two")
        {
        if(twoWheelers > 0)
        {
            twoWheelers--;
        }
        else
        {
            System.out.println("No two-wheelers parked");
        }
        }
         else if(type=="four")
         {
        if(fourWheelers > 0)
        {
            fourWheelers--;
        }
        else
        {
            System.out.println("No four-wheelers parked");
        }
         }
    }
    public static void main(String args[])
    {
        ParkingLot P1=new ParkingLot();
        P1.park("two");
        P1.park("two");
        P1.park("two");
        P1.park("four");
        P1.park("four");
        P1.park("four");
        P1.leave("two");
        P1.leave("four");
        System.out.println("Two Wheelers:"+P1.twoWheelers);
        System.out.println("four Wheelers:"+P1.fourWheelers);
        System.out.println("revenue:"+P1.revenue);
    }
}
