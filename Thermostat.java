public class Thermostat {
    private String location;
    private int temperature;
    private static final int MIN=16;
    private static final int MAX=30;
    private static int activeCount=0;
    Thermostat(String location, int startTemp)
    {
        this.location=location;
        if(startTemp>=MIN && startTemp<=MAX)
        {
            temperature=startTemp;
        }
        else
        {
            temperature=22;
        }
        activeCount++;
    }
    Thermostat(String location)
    {
        this(location, 22);
    }
    int raise()
    {
        if(temperature<MAX)
        {
            temperature+=1;
        }
        else
        {
            System.out.println("Already at maximum(30)");
        }
        return temperature;
    }
    int lower()
    {
        if(temperature>MIN)
        {
            temperature-=1;
        }
        else
        {
            System.out.println("Already at minimum(16)");
        }
        return temperature;
    }
    int getTemperature()
    {
        return temperature;
    }
     static int getActiveCount()
    {
        return activeCount;
    }
     public static void main(String args[])
    {
        int startTemp=22;
        Thermostat T1=new Thermostat("anand",startTemp);
        Thermostat T2=new Thermostat("ahemdabad",20);
        for(int i=0;i<10;i++)
        {
            T1.raise();
            System.out.println(T1.getTemperature());
        }
        for(int i=0;i<20;i++)
        {
            T1.lower();
             System.out.println(T1.getTemperature());
        }
        System.out.println(T1.getActiveCount());

    }
}
