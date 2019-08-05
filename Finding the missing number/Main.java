import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int array[] = new int[n];
       int barray[] = new int[n];
      int ele = 0;  
      for(int i=0;i<n;i++)
        {
          array[i] = scan.nextInt();
          ele = array[i];
        ele--;
        barray[ele]=1;
        }
     for(int b=0;b<n;b++)
     {
       if(barray[b]==0)
       {
         int h = b+1;
         System.out.println(h);
       }
     }
      
    }
}