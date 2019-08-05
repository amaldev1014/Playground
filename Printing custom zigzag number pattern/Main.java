import java.util.Scanner;
class Main{
	public static void main (String[] args){
	  Scanner scan = new Scanner(System.in);
      int n=scan.nextInt();
      int l=1;
      for(int i=1;i<=n;i++)
      {
        if(i%2==1)
        {
         for(int j=1;j<n;j++)
         {
           System.out.print(l);
         }
        System.out.print(++l);
        
        }
        else
        {
          System.out.print(l+1);
          for(int t=1;t<n;t++)
          {
            System.out.print(l);
          }
          l++;
        }
        System.out.println();
      }
	}
}