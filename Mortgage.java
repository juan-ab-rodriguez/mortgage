public class Mortgage
{
   private int                  number;
   private double               rate;
   private double               amount;
   private int                  years;
   
   private static int           last_created    = 3_745_000;
   
   private final static double  P_RATE   = 7.5,
                                P_AMOUNT = 100_000;
   private final static int     P_YEARS  = 30;
   
   // Constructor 1
   public Mortgage(double rate, double amount, int years)
   {
      this.rate   = rate;
      this.amount = amount;
      this.years  = years;
      number = ++last_created;
   }
   
   // Constructor 2
   public Mortgage(double amount, int years)
   {
      this(P_RATE, amount, years);
   }
   
   // Constructor 3
   public Mortgage(double amount)
   {
      this(P_RATE, amount, P_YEARS);
   }
   
   // Constructor 4
   public Mortgage()
   {
      this(P_RATE, P_AMOUNT, P_YEARS);
   }
   
   // Account Number Accessor
   public int getNumber()
   {
      return number;
   }
   
   // Annual Interest Rate Accessor
   public double getRate()
   {
      return rate;
   }
   
   // Loan Amount Accessor
   public double getAmount()
   {
      return amount;
   }
   
   // Loan Period Accessor
   public int getYears()
   {
      return years;
   }
   
   // toString Method
   public String toString()
   {
      return "Account number: "  + getNumber()                         + "\n" +
             "Loan amount:    $" + String.format("%,.2f", getAmount()) + "\n" +
             "Years:          "  + getYears()                          + "\n" +
             "Annual rate:    "  + getRate()                           + "%\n";
   }
   
   // Method to Calculate Monthly Payment
   public double monthlyPayment()
   {
      double monthly_interest_rate = rate / 1_200;
      
      return amount * monthly_interest_rate /
             (1 - (Math.pow(1 / (1 + monthly_interest_rate), years * 12)));
   }
   
   // Method to Calculate Total Payments for Life of Loan
   public double totalPayments()
   {
      return monthlyPayment() * years * 12;
   }
}