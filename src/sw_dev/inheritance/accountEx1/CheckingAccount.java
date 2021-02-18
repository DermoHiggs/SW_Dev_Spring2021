package sw_dev.inheritance.accountEx1;

/**
   A checking account that charges transaction fees.
*/
public class CheckingAccount extends BankAccount
{
   private int transactionCount;

   private static final int FREE_TRANSACTIONS = 3;
   private static final double TRANSACTION_FEE = 2.0;
  
   /**
      Constructs a checking account with a given balance.
      @param initialBalance the initial balance
   */
   public CheckingAccount(double initialBalance)
   {  
      // Construct superclass
      super(initialBalance);
      
      // Initialize transaction count
      transactionCount = 0; 
   }

   
   @Override
   public void deposit(double amount) 
   {  
      transactionCount++;
      // Now add amount to balance 
      super.deposit(amount); 
   }

   @Override
   public void withdraw(double amount) 
   {  
      transactionCount++;
      // Now subtract amount from balance 
      super.withdraw(amount); 
   }

   /**
      Deducts the accumulated fees and resets the
      transaction count.
   */
   public void deductFees()
   {
      int numOfChargableTransactions = transactionCount - FREE_TRANSACTIONS;
      if (numOfChargableTransactions > 0)
         //if (transactionCount > FREE_TRANSACTIONS)
      {  
         double fees = TRANSACTION_FEE *
               (numOfChargableTransactions);
         super.withdraw(fees);
      }
      transactionCount = 0;
   }

}
