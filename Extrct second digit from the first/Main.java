import java.util.Scanner;
class Main {
	public static void main (String[] args){
    
    
    
 Scanner scan = new Scanner(System.in);
       int n=scan.nextInt();
      int last=0;
      while(n>10)
      {
      last=n;
       n=n/10; 
      }
      int second_last = last % 10;
      System.out.println(second_last);
    
    }
}