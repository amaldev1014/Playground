import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    boolean is_match = true;
    Scanner scan = new Scanner(System.in);
    int n =  scan.nextInt();
    int array[] = new int[n];
    for(int i=0;i<n;i++)
    {
      array[i] = scan.nextInt();
    }
    int num = n/3;
    int k=0;
    int peak[] = new int[num];
    for(int j=0;j<num;j++)
    {
      
      int p=k+3;
     peak[j]=batch(array,k,p);
      k=p;
      
      
    }
    int value = peak[0];
    for(int q=1;q<num;q++)
    {
      if(peak[q]!=value)
      {
        is_match = false; 
      }
    }
    if(is_match)
    {
      System.out.println("Perfect Batch");
    } 
    else{System.out.println("Not a Perfect Batch");}
    
  }
  static int batch(int[] array, int k, int p)
  {
    int sum=0;
    for(int t=k;t<p;t++)
    {
      sum = sum + array[t];
    }
    return sum;
  }
}