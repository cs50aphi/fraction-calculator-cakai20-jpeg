import java.util.Scanner;
public class FractionDriver 
{
    public static void main (String[]args) 
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("Num1: ");
        int n1 = kb.nextInt();
        System.out.println("Den1: ");
        int d1 = kb.nextInt();
        System.out.println("Num2: ");
        int n2 = kb.nextInt();
        System.out.println("Den2: ");
        int d2 = kb.nextInt();
        
        Fraction f1 = new Fraction(n1,d1);
        Fraction f2 = new Fraction(n2,d2);
        
        // System.out.println( f1 + "+" + f2 + "=" + f1.add(f2));
        // System.out.println( f1 + "-" + f2 + "=" + f1.subtract(f2));
        // System.out.println( f1 + "*" + f2 + "=" + f1.multiply(f2));
        // System.out.println( f1 + "/" + f2 + "=" + f1.divide(f2));
    }       
}