import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      
      Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
       int array[] = new int[n];
      int barray[] = new int[n];
      int count=0;
      int bcount=0;
    for(int i=0;i<n;i++)
        {
          array[i] = scan.nextInt();
      if(array[i]==0)
      {
        count++;
      }else
      {
        barray[bcount]=array[i];
        System.out.print(barray[bcount]+" ");
        bcount++;
      }
      
    }
      for(int j=0;j<count;j++)
      {
        barray[bcount]=0;
        System.out.print(barray[bcount]+" ");
        bcount++;
      }
      
    }
}