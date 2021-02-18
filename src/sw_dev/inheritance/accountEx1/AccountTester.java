package sw_dev.inheritance.accountEx1;

/**
   This program tests the BankAccount class and
   its subclasses. 
*/
public class AccountTester
{  
   public static void main(String[] args)
   {
      //Note: I've only included some testing here for illustrative purposes.
      SavingsAccount save1 = new SavingsAccount(10);
      CheckingAccount check1 = new CheckingAccount(100);

      save1.deposit(20);
      save1.deposit(80);
      save1.addInterest();

      check1.deposit(10);
      check1.deposit(10);
      check1.deposit(10);
      check1.deposit(10);
      check1.deposit(10);
      //I mentioned in the lecture that Polymorphism takes place here (in the transfer() method)
      //Can you remember what this effectively means? Maybe refer back to the recorded lecture - it's
      //near the end.
      check1.transfer(10, save1);
      check1.deductFees();

      System.out.println("Current Balance in save1: " + save1.getBalance());
      System.out.println("Current Balance in check1: " + check1.getBalance());

      System.out.println(save1.toString());
//---------------------------------------------------



      BankAccount b1 = new BankAccount(100);

      b1 = new SavingsAccount(10, 1000);

      SavingsAccount temp = (SavingsAccount)b1;
      temp.addInterest();


      SavingsAccount s1 = new SavingsAccount(5,200);

      BankAccount b2 = (BankAccount)s1;

   }
}
