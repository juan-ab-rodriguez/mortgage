import java.util.Scanner;
import java.text.DecimalFormat;

public class MortgageTest2RodriguezJuan
{
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in);
      DecimalFormat df = new DecimalFormat("#,##0.00");
      
      double rate;
      int    amount;
      int    years;
      
      System.out.print("Enter loan amount: ");
      amount = kb.nextInt();
      
      System.out.print("Enter number of years: ");
      years  = kb.nextInt();
      
      System.out.print("Enter yearly interest rate: ");
      rate   = kb.nextDouble();
      
      Mortgage m1    = new Mortgage(rate, amount, years);
      double   tp    = m1.totalPayments();
      String   ms    = df.format(tp);
      int      width = ms.length();
      
      System.out.println("***********************************");
      System.out.print(m1);
      System.out.println();
      System.out.printf("Monthly Payment: $%" + width + "s\n", df.format(m1.monthlyPayment()));
      System.out.printf("Total Payment:   $%s\n"  , ms);
      System.out.println("***********************************");
   }
}