import java.util.Scanner;
import java.lang.Math;
class Main{
	public static void main (String[] args){
	   Scanner scan = new Scanner(System.in);
       int n=scan.nextInt();
      int k=n;
      int j=n;
      int rem=0;
      int temp=0;
      int sum=0;
       while(n>0)
       {
         temp++;
         rem=n%10;
         n=n/10;
       }
      while(k>0)
      {
         rem=k%10;
         k=k/10;
         sum=sum+(int)Math.pow(rem,temp);
      }
      if (sum==j){
      System.out.println("Armstrong Number");
      }
      else
      {
        System.out.println("Not a Armstrong Number");
      }
	}
}