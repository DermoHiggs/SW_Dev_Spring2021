package sw_dev.inheritance.accountEx1;

/**
   An account that earns interest at a fixed rate.
*/
public class SavingsAccount extends BankAccount
{  
   private double interestRate;
   //private double balance; //never do this

   /**
    Constructs a bank account with a given interest rate.
    @param rate the interest rate (represents a percentage)
    */
   public SavingsAccount(double rate) 
   {  
      super();
      interestRate = rate;
   }

   /**
    *
    * @param rate the interest rate to be appiled via addInterest()
    * @param initBalance the initial balance the account opens with
    */
   public SavingsAccount(double rate, double initBalance)
   {  
		super(initBalance);
      interestRate = rate;
   }

   /**
      Adds the earned interest to the account balance.
   */
   //Note the use of inherited methods to access balance indirectly
   public void addInterest() 
   {  
      double interest = getBalance() * interestRate / 100;

      //balance += interest; //NB: Can't do this due to balance being private
      //
      //
      deposit(interest);
   }

}
