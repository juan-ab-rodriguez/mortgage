import java.util.Scanner;
import java.text.DecimalFormat;

public class MortgageTest3RodriguezJuan
{
   public static void main(String[] args)
   {
      Mortgage m1,
               m2;
      
      m1 = getMortgageAccount();
      printAccount(m1);
      
      m2 = getMortgageAccount();
      printAccount(m2);
   }
   
   public static Mortgage getMortgageAccount()
   {
      Scanner kb = new Scanner(System.in);
      
      double rate;
      int    amount;
      int    years;
      
      System.out.print("Enter loan amount: ");
      amount = kb.nextInt();

      System.out.print("Enter number of years: ");
      years  = kb.nextInt();
      
      System.out.print("Enter yearly interest rate: ");
      rate   = kb.nextDouble();

      return new Mortgage(rate, amount, years);
   }
   
   public static void printAccount(Mortgage m)
   {
      DecimalFormat df = new DecimalFormat("#,##0.00");
      
      double   tp    = m.totalPayments();
      String   ms    = df.format(tp);
      int      width = ms.length();
      
      System.out.println("*******************************");
      System.out.print(m);
      System.out.println();
      System.out.printf("Monthly Payment: $%" + width + "s\n", df.format(m.monthlyPayment()));
      System.out.printf("Total Payment:   $%s\n"  , ms);
      System.out.println("******************************");
   }
}