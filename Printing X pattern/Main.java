import java.util.Scanner;
class Main {
	public static void main (String[] args){
       Scanner scan = new Scanner(System.in);
      int n = scan.nextInt();
      int l=(n/2)+1;
      int m=1;
      int h=n-2;
      for(int i=1;i<=l;i++)
      {
        for(int j=1;j<m;j++)
        {
          System.out.print(" ");
        }
        
          System.out.print("*");
          for(int g=1;g<=h;g++)
          {
            System.out.print(" ");
          }
        if(h>0){
          System.out.print("*");
        }
        System.out.println();
        m++;
        h=h-2;
      }
       l=(n/2);
     
       m=n/3;
       h=1;
      
      for(int i=1;i<=l;i++)
      {
        for(int j=1;j<=m;j++)
        {
          System.out.print(" ");
        }
        
          System.out.print("*");
          for(int g=1;g<=h;g++)
          {
            System.out.print(" ");
          }
        if(h>0){
          System.out.print("*");
        }
        System.out.println();
        m--;
        h=h+2;
      }
	}
}