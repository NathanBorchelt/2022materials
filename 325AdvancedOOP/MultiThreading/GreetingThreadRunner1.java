/**
   This program runs two greeting threads in parallel.
*/
public class GreetingThreadRunner1
{
   public static void main(String[] args)
   {
      GreetingRunnable1 r1 = new GreetingRunnable1("Hello World");
     
      Thread t1 = new Thread(r1);

      t1.start();

   }
}

