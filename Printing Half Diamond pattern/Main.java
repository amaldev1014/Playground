import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
       int m=n-1;
      int p=1;
        for(int i=1;i<=n;i++)
        {
          for(int j=1;j<=m;j++)
          {
            System.out.print(" ");
          }
          for(int k=1;k<=p;k++)
          {
            System.out.print("*");
          }
          System.out.println();
          m--;
          p=p+2;
        }
	}
}