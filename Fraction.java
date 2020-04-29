public class Fraction
{
    private int denominator;
    
    private int numerator;
    
   public String fraction(int n, int d)
   {
      denominator = n;
      numerator = d;
      return neumerator + "/" + denominator;
   }
   
   public int getNum()
   {
       return nurmerator;
   }
   
   publinc int getDen()
   {
       return denominator;
   }
   
   public String add(int n, int d)
   {
       newNum  = f1.getNum() * d + n + f1.getDen;
       newDen = f1.getDen() * d;
       return newNum + "/" + newDen;
   }
     
       
   
   public int subtract(int n, int d)
   {
      newNum  = f1.getNum() * d - n + f1.getDen;
      newDen = f1.getDen() * d;
      return newNum + "/" + newDen;
      
   }
   
   public String multiply(int n, int d)
   {
       newNum  = f1.getNum() * n;
       newDen = f1.getDen() * d;
       return newNum + "/" + newDen;
   }
   
    public String divide(int n, int d)
    {
       newNum  = f1.getNum() * d;
       newDen = f1.getDen() * n();
       return newNum + "/" + newDen; 
    }
}