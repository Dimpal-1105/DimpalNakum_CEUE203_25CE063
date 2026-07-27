import java.util.Scanner;

public class TollBooth
{
    record Vehicle(String vehicle_num, String vehicle_type) {}

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int total = 0;
        int bike_count = 0;
        int car_count = 0;
        int truck_count = 0;

        while (true)
        {
            System.out.print("Enter vehicle number (or 'done' to stop): ");
            String vehicle_num = sc.next();

            if (vehicle_num.toUpperCase().equals("DONE"))
            {
                break;
            }

            System.out.print("Enter vehicle type (bike/car/truck): ");
            String vehicle_type = sc.next().toUpperCase();

            Vehicle vehicle = new Vehicle(vehicle_num, vehicle_type);

            int toll = 0;

            switch (vehicle.vehicle_type())
            {
                case "BIKE" ->
                {
                    bike_count++;
                    toll = 20;
                }

                case "CAR" ->
                {
                    car_count++;
                    toll = 50;
                }

                case "TRUCK" ->
                {
                    truck_count++;
                    toll = 150;
                }

                default ->
                {
                    System.out.println("Invalid vehicle type!");
                }
            }

            total += toll;
        }

        String most_frequent;

        if (bike_count >= car_count && bike_count >= truck_count)
        {
            most_frequent = "bike";
        }
        else if (car_count >= bike_count && car_count >= truck_count)
        {
            most_frequent = "car";
        }
        else
        {
            most_frequent = "truck";
        }

        System.out.println("Total toll: " + total);
        System.out.println("Most frequent: " + most_frequent);

        sc.close();
    }
}