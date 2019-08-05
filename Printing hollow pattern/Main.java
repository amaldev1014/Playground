import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
      int l=n-2;
         for(int i=1;i<=n;i++)
         {
           if(i==1 || i==n){
           for(int j=1;j<=n;j++)           
           {
             System.out.print("*");
           }
           }
           else
           {
             System.out.print("*");
             for(int k=1;k<=l;k++)
             {
               System.out.print(" ");
             }
             System.out.print("*");
           }
           System.out.println();
         }
        
      
	}
}