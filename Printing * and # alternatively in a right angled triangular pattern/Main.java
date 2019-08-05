import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner scan = new Scanner(System.in);
  		int n=scan.nextInt();
      int num=1;
      for(int i=0;i<n;i++)
      {
        for(int j=0;j<=i;j++)
        {
          if(num%2==1)
          {
            System.out.print("*");
          }
          else
          {
            System.out.print("#");
          }
          num++;
        }
        System.out.println();
      }
    }
}