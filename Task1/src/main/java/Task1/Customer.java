package Task1;

public class Customer
{
    private String firstName;
    private String lastName;
    private String userName;
    private int id;

    public void Customer(String firstName, String lastName, String userName)
    {
        this.firstName=firstName;
        this.lastName=lastName;
        this.userName=userName;
    }

    public String toString()
    {
        return "Firstname: " + firstName + ". Lastname: " + lastName + ". Username: " + userName;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public String getUserName()
    {
        return userName;
    }
}
