/**
   This program runs two greeting threads in parallel.
*/
public class GreetingThreadRunner2
{
   public static void main(String[] args)
   {
      String[] printOptions = {"1","2","3","4","5","6","7","8","9","10"};
      Thread[] threads = new Thread[printOptions.length];
      for(int i = 0; i < printOptions.length; i++){
         threads[i] = new Thread(new GreetingRunnable2(printOptions[i]));
      }
      for (Thread thread : threads) {
         thread.start();
      }
   }
}
