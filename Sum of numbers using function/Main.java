import java.util.Scanner;
class Main{
	public static void main (String[] args){
	  Scanner scan = new Scanner(System.in);
      int n = scan.nextInt();
      System.out.println(sum(n));
      
	}
  static int sum(int n)
  {
    int add=0;
    while(n>=1)
    {
      add=add+n;
      n--;
    }
    return add;
  }
}