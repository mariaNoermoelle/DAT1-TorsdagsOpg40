package Task1;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Customer> customers = new ArrayList<Customer>();
    }
    public static void printCustomers(ArrayList<Customer> customers)
    {
        for(Customer c : customers)
        {
            System.out.println(c);
        }
    }
}
