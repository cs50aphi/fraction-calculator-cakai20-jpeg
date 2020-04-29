import java.util.Scanner;
public class FractionDriver 
{
    public static void main (String[]args) 
    {
        run = true
        
        while (run == true)
        {
        Scanner kb = new Scanner(System.in);
        System.out.print("Please enter an operation (+, -, *, /, = or Q to Quit): +")
        String operation = kb.nexLine();
        System.out.print("Num1: ");
        int n1 = kb.nextInt();
        System.out.print("Den1: ");
        int d1 = kb.nextInt();
        System.out.print("Num2: ");
        int n2 = kb.nextInt();
        System.out.print("Den2: ");
        int d2 = kb.nextInt();
        
        Fraction f1 = new Fraction(n1, d1);
        Fraction f2 = new Fraction(n2, d2);
        
        // System.out.println( f1 + "+" + f2 + "=" + f1.add(f2));
        // System.out.println( f1 + "-" + f2 + "=" + f1.subtract(f2));
        // System.out.println( f1 + "*" + f2 + "=" + f1.multiply(f2));
        // System.out.println( f1 + "/" + f2 + "=" + f1.divide(f2));
        }
    }       
}