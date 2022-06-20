
public class ThreadSafeSingleton {
    private static ThreadSafeSingleton object;

    private ThreadSafeSingleton()
    {

    }


    /*
    public static synchronized ThreadSafeSingleton getObject()
    {
        if(object == null)
        {
            object = new ThreadSafeSingleton();
        }
        return object;
    }
*/


    /*


    Above implementation works fine and provides thread-safety
    but it reduces the performance
    because of the cost associated with the synchronized method,
    although we need it only for the first few threads
    who might create the separate instances.
    To avoid this extra overhead every time, double checked locking principle is used.
    In this approach, the synchronized block is used
    inside the if condition with an additional check
    to ensure that only one instance of a singleton class is created.

    */

    public static ThreadSafeSingleton getObject()
    {
        if(object == null)
        {
            synchronized (ThreadSafeSingleton.class)
            {
                if(object == null)
                {
                    object = new ThreadSafeSingleton();
                }
            }
        }
        return object;
    }
}
