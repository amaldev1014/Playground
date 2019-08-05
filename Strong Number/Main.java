import java.util.Scanner;
class Main{
	public static void main (String[] args){
	     
       Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
      int k=num;
      int rem=0;
      int sum=0;
      while(num>0){
        rem=num%10;
        num=num/10;
      int product=1;
      for(int i=1;i<=rem;i++)
      {
        product=product*i;
      }
        sum=sum+product;
      }
      if(sum==k)
      {
        System.out.println("Yes");
      }
      else{System.out.println("No");}
	
	}
}