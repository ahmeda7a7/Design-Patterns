package Demo1;

public class MakeACaptain {
    private static MakeACaptain captain;

    private MakeACaptain()
    {

    }

    public static MakeACaptain getCaptain()
    {
        if(captain == null)
        {
            captain = new MakeACaptain();
        }
        else
        {
            System.out.println("You have already selected a captain");
            System.out.println("Send him for the toss");
        }
        return captain;
    }
}
