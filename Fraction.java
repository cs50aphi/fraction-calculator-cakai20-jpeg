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
   
   public String add()
   {
       newNum  = f1.getNum() * getDen() + getNum() + f1.getDen;
       newDen = f1.getDen() * getDen();
       return newNum + "/" + newDen;
   }
     
       
   
   public int subtract()
   {
      newNum  = f1.getNum() * getDen() - getNum() + f1.getDen;
      newDen = f1.getDen() * getDen();
      return newNum + "/" + newDen;
      
   }
   
   public String multiply()
   {
       newNum  = f1.getNum() * getNum();
       newDen = f1.getDen() * getDen();
       return newNum + "/" + newDen;
   }
   
    public String divide( )
    {
       newNum  = f1.getNum() * getDen();
       newDen = f1.getDen() * getNum();
       return newNum + "/" + newDen; 
    }
}