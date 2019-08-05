import java.util.Scanner;
import java.util.Arrays;
class Main{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int array[] = new int[n];
       for(int i=0;i<n;i++)
       {
         array[i] = scan.nextInt();
       }
      int barray[] = new int[n];
      int k=0;
      for(int j=n-1;j>=0;j--)
      {
        barray[k]=array[j];
        k++;
      }
    
      if(Arrays.equals(array,barray))
      {
        System.out.println("Yes");
      }
      else{System.out.println("No");}
      }
}