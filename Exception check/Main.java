import java.util.Scanner;
import java.util.InputMismatchException;
public class Main
{
   public static void main(String args[])
   {
    Scanner scan = new Scanner(System.in);
     try
     {
       int n= scan.nextInt();
       System.out.println(n);
     }
     catch(InputMismatchException e)
     {
       System.out.println("Input Mismatch Exception occurred");
     }
   }
}