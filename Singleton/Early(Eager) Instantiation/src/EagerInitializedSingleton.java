/*
In eager initialization, the instance of Singleton Class is created
at the time of class loading,
this is the easiest method to create a singleton class
but it has a drawback that instance is created
even though client application might not be using it.
 */


/*
---------     Kind of real pseudo code         --------


class A{
 private static A obj=new A();//Early, instance will be created at load time
 private A(){}

 public static A getA(){
  return obj;
 }

 public void doSomething(){
 //write your code
 }
}


 */

public class EagerInitializedSingleton {

    private static EagerInitializedSingleton obj = new EagerInitializedSingleton();

    private EagerInitializedSingleton()
    {

    }

    public static EagerInitializedSingleton getObj()
    {
        return obj;
    }
}
