/*

Lazy initialization method to implement Singleton pattern
creates the instance in the global access method.

 */



public class LazyInitializedSingleton {
    private static LazyInitializedSingleton object = new LazyInitializedSingleton();

    private LazyInitializedSingleton()
    {

    }

    public static LazyInitializedSingleton getObject()
    {
        if(object == null )
        {
            object = new LazyInitializedSingleton();
        }
        return object;
    }
}

/*

The above implementation works fine in case of the single-threaded environment
but when it comes to multithreaded systems,
it can cause issues if multiple threads are inside the if condition at the same time.
It will destroy the singleton pattern and
both threads will get the different instances of the singleton class.

So we see the thread-safe singleton next.

 */
