class MyResource implements AutoCloseable
{
    MyResource()
    {
        System.out.println("Resource opened");
    }

    void work()
    {
        System.out.println("Working...");
        throw new RuntimeException("Something went wrong!");
    }

    @Override
    public void close()
    {
        System.out.println("Resource closed");
    }
}

public class TestResource
{
    public static void main(String args[])
    {
        try (MyResource r = new MyResource())
        {
            r.work();
        }
        catch (Exception e)
        {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
