import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner scan = new Scanner(System.in);
       int n=scan.nextInt();
      int first=n%10;
      int last=0;
      while(n>0)
      {
       last=n;
       n=n/10; 
      }
      int sum = first + last;
      System.out.println(sum); 
	}
}