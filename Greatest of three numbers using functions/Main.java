import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   Scanner scan = new Scanner(System.in);
       int n1 = scan.nextInt();
       int n2 = scan.nextInt();
       int n3 = scan.nextInt();
      int result = largest(n1,n2);
      System.out.println(largest(result,n3));
	}
  public static int largest(int n1,int n2)
  {
    if(n1>n2)
    {
      return n1;
    }
    else
    {
      return n2;
    }
  }
}