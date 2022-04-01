import java.util.Date;

import javax.swing.Timer;

/**
   A runnable that repeatedly prints a greeting.
*/
public class GreetingRunnable implements Runnable
{

   private String greeting;
   private int index;

   /**
      Constructs the runnable object.
      @param aGreeting the greeting to display
      @param index the index of the runnable, still using zero based indexing
   */
   public GreetingRunnable(String aGreeting, int index)
   {
      greeting = aGreeting;
      this.index = ++index;

   }

   public void run()
   {
      try
      {
         int delay = GreetingThreadRunner.delay;
         for (int i = 1; i <= GreetingThreadRunner.reps; i++)
         {
            GreetingThreadRunner.outputArea.append(greeting + index+"\n");
            Thread.sleep(delay);
         }
      }
      catch (InterruptedException exception)
      {
      }
   }
}
