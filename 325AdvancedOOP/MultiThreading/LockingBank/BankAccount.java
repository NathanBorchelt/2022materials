/**
   A bank account has a balance that can be changed by
   deposits and withdrawals.
*/

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Condition;

public class BankAccount
{
   private double balance;
   private Lock transactionLock = new ReentrantLock();
   private Condition overdraw = transactionLock.newCondition();

   /**
      Constructs a bank account with a zero balance.
   */
   public BankAccount()
   {
      balance = 0;
   }

   /**
      Deposits money into the bank account.
      @param amount the amount to deposit
   */
   public void deposit(double amount)
   {
      transactionLock.lock();
      try
      {
         System.out.print("Depositing " + amount);
         double newBalance = balance + amount;
         System.out.println(", new balance is " + newBalance);
         balance = newBalance;
         overdraw.signalAll();
      }
      catch(Exception e){}
      finally
      {
         transactionLock.unlock();
      }

   }

   /**
      Withdraws money from the bank account.
      @param amount the amount to withdraw
   */
   public void withdraw(double amount)
   {
      transactionLock.lock();
      try
      {
         while(balance<amount){
            overdraw.await();
         }
         System.out.print("Withdrawing " + amount);
         double newBalance = balance - amount;
         System.out.println(", new balance is " + newBalance);
         balance = newBalance;
      }
      catch(Exception e){}
      finally
      {
         transactionLock.unlock();
      }

   }

   /**
      Gets the current balance of the bank account.
      @return the current balance
   */
   public double getBalance()
   {
      return balance;
   }
}
