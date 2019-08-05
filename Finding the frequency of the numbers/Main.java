import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	 Scanner scan = new Scanner(System.in);
      int n = scan.nextInt();
      int array[] = new int[n];
      int k = scan.nextInt();
      int barray[] = new int[k];
      int p=0;
      for(int i=0;i<n;i++)
      {
        array[i]= scan.nextInt();
        p = array[i];
        barray[p-1]++;
      }
      for(int j=0;j<k;j++)
      {
        System.out.println(j+1 + " " +barray[j]);
        
      }
      
      
    }
}