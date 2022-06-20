package Demo1;

/*

From vaskaran sarcar's book.

 */
public class SingletonPatternExample {
    public static void main(String[] args) {
        System.out.println("Singleton Pattern Demo");
        System.out.println("Trying to make a captain for our team");
        MakeACaptain c1 = MakeACaptain.getCaptain();

        System.out.println("Trying to make another captain for ur team");

        MakeACaptain c2 = MakeACaptain.getCaptain();

        if(c1 == c2 )
        {
            System.out.println("C1 and C2 are same instance");
        }

    }
}
