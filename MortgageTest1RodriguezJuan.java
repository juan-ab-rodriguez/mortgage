public class MortgageTest1RodriguezJuan
{
   public static void main(String[] args)
   {
      Mortgage m1 = new Mortgage(6.0, 200_000, 20);
      Mortgage m2 = new Mortgage(200_000, 20);
      Mortgage m3 = new Mortgage(200_000);
      Mortgage m4 = new Mortgage();
      
      System.out.println("Test the toString Method");
      System.out.println("************************");
      System.out.println(m1);
      System.out.println(m2);
      System.out.println(m3);
      System.out.print  (m4);
      System.out.println("************************");
      
      System.out.println();
      System.out.println("Test the accessor Methods");
      System.out.println("*************************");
      System.out.println("Account#:    "  +  m1.getNumber()                         + "\n" +
                         "Loan amount: $" +  String.format("%,.2f", m1.getAmount()) + "\n" +
                         "Years:       "  +  m1.getYears()                          + "\n" +
                         "Annual rate: "  +  m1.getRate()                           + "%");
      System.out.println("*************************");
   }
}