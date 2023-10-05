package Task3;

public class Room
{
    private int numberOfDoors;
    private int numberOLamps;
    private int numberOfWindows;

    public Room(int numberOfDoors, int numberOfLamps, int numberOfWindows)
    {
        this.numberOfDoors=numberOfDoors;
        this.numberOLamps=numberOfLamps;
        this.numberOfWindows=numberOfWindows;
    }

    public int getNumberOfDoors()
    {
        return numberOfDoors;
    }

    public int getNumberOLamps()
    {
        return numberOLamps;
    }

    public int getNumberOfWindows()
    {
        return numberOfWindows;
    }
}
