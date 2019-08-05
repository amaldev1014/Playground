import java.util.Scanner;
class Main{
	public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
      int product=1;
      for(int i=2;i<=num;i++)
      {
        product=product*i;
      }
      System.out.println(product);
	}
}