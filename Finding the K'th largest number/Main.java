import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     Scanner scan = new Scanner(System.in);
      int n = scan.nextInt();
      int array[] = new int[n];
      for(int i=0;i<n;i++)
      {
        array[i]= scan.nextInt();
      }
      int k = scan.nextInt();
      
      for(int j=n-1;j>=0;j--)
      {
        for(int t=0;t<j;t++){
       if(array[t]>array[t+1])
       {
         int temp=array[t];
         array[t]=array[t+1];
         array[t+1]=temp;
       }
        }
      }
      int b=n-k;
      System.out.println(array[b]);
    }   
}